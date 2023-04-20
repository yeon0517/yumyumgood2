package com.cookpang.app.manager;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.ingredient.dao.IngredientDAO;
import com.cookpang.app.ingredient.dto.IngredientDTO;
import com.cookpang.app.ingredient.image.dao.IngredientImageDAO;
import com.cookpang.app.ingredient.image.dto.IngredientImageDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class IngredietnInsertOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		IngredientDTO ingredientDTO = new IngredientDTO();
		IngredientDAO ingredientDAO = new IngredientDAO();
		IngredientImageDTO ingredientImageDTO = new IngredientImageDTO(); 
		IngredientImageDAO ingredientImageDAO = new IngredientImageDAO();
		
		
		String uploadPath = req.getSession().getServletContext().getRealPath("/") + "upload/";
		int fileSize = 1024 * 1024 * 5; // 5MB
		System.out.println(uploadPath);

//  req를 MultipartRequest객체로 만들어서 사용하면 데이터를 정상적으로 가져와 쓸 수 있다.
//  객체를 만들 때 여러 옵션을 설정해야한다.
//  생성자 매개변수 : req, 업로드 경로, 최대 크기, 인코딩 방식, 이름 정책
		MultipartRequest multipartRequest = new MultipartRequest(req, uploadPath, fileSize, "utf-8",
				new DefaultFileRenamePolicy());
		
		ingredientDTO.setIngredientName(multipartRequest.getParameter("ingredientName"));
		ingredientDTO.setIngredientPrice(Integer.valueOf(multipartRequest.getParameter("ingredientPrice")));
		ingredientDTO.setIngredientSmallestUnit(Integer.valueOf(multipartRequest.getParameter("ingredientSmallestUnit")));
		ingredientDTO.setIngredientMoreInfo(multipartRequest.getParameter("ingredientMoreInfo"));
		ingredientDTO.setIngredientCategoryNumber(Integer.valueOf(multipartRequest.getParameter("ingredientCategoryNumber")));
		
		
		ingredientDAO.insert(ingredientDTO);
		int ingredientNumber =  ingredientDAO.getSequence();
		
		
//  getFileNames는 input태그의 name속성을 의미한다.
//  Enumeration은 이터레이터와 비슷하다고 생각하면 된다.
//  이터레이터가 나오기 이전에 사용되던 인터페이스이다.
		Enumeration<String> fileNames = multipartRequest.getFileNames();

//    이터레이터의 hasNex()
		while (fileNames.hasMoreElements()) {
//       이터레이터의 next()
			String name = fileNames.nextElement();
			
			String ingredientImageSystemName = multipartRequest.getFilesystemName(name);
			String ingredientImageOriginalName = multipartRequest.getOriginalFileName(name);
			
			
			
			if (ingredientImageSystemName == null) {
				continue;
			}

			ingredientImageDTO.setIngredientImageSystemName(ingredientImageSystemName);
			ingredientImageDTO.setIngredientImageOriginalName(ingredientImageOriginalName);
			ingredientImageDTO.setIngredientNumber(ingredientNumber);
			
			
			ingredientImageDAO.insert(ingredientImageDTO);

		}

		resp.sendRedirect("/manager/managerListOk.manager");
		
		
		
		
		
	}

}
