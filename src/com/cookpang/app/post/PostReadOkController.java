package com.cookpang.app.post;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.post.dao.PostDAO;
import com.cookpang.app.post.file.dao.PostFileDAO;
import com.cookpang.app.post.file.dto.PostFileDTO;
import com.cookpang.app.post.read.vo.PostReadVO;
import com.cookpang.app.recipe.category.dao.RecipeCategoryDAO;
import com.cookpang.app.recipe.category.vo.RecipeCategoryVO;

public class PostReadOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		int postNumber = Integer.valueOf(req.getParameter("postNumber"));
//		int userNumber = Integer.valueOf(req.getParameter("userNumber"));
		
//		임시 게시물 번호 나중에 연결되면 바로 밑은 삭제, 위의 주석은 해제
		int postNumber = 8;
		
		PostDAO postDAO = new PostDAO();
		RecipeCategoryDAO recipeCategoryDAO = new RecipeCategoryDAO();
		
		postDAO.updatePostViewCount(postNumber);
		
		PostReadVO postReadVO = postDAO.postReadDefaultInfo(postNumber);
		List<RecipeCategoryVO> categoryList = recipeCategoryDAO.getRecipeCategories(postNumber);
		
		
//		List<PostFileDTO> files = new PostFileDAO().select(postNumber);
		
		
//		postReadVO.setFiles(files);
		
		req.setAttribute("post", postReadVO);
		req.setAttribute("categoryList", categoryList);
		
		req.getRequestDispatcher("/app/post/postRead.jsp").forward(req, resp);
		
		
	}
	
	
	
	
}
