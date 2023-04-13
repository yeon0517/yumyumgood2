package com.cookpang.app.post.save;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.post.save.dao.PostSaveDAO;
import com.cookpang.app.post.save.dto.PostSaveDTO;

public class PostSaveOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PostSaveDAO postSaveDAO = new PostSaveDAO();
		PostSaveDTO postSaveDTO = new PostSaveDTO();
		PrintWriter out = resp.getWriter();

		boolean saveStatus = false;
		
		resp.setContentType("text/html; charset=utf-8");
		
		postSaveDTO.setPostNumber(Integer.valueOf(req.getParameter("postNumber")));
		postSaveDTO.setUserNumber(Integer.valueOf(req.getParameter("userNumber")));
		
//		게시물 저장을 먼저 조회하고 
//		조회 결과가 있으면 delete, 결과가 없으면 insert
		if(postSaveDAO.checkSave(postSaveDTO)==null) {
			postSaveDAO.insertSave(postSaveDTO);
			saveStatus = true;
			System.out.println("추가");
		}else {
			postSaveDAO.deleteSave(postSaveDTO);
			saveStatus = false;
			System.out.println("삭제");
		}
		
		out. print(saveStatus);
		out.close();

		
	}

}










