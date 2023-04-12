package com.cookpang.app.comment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
import com.cookpang.app.comment.dao.CommentDAO;
import com.cookpang.app.comment.dto.CommentDTO;

public class CommentWriteOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("댓글작성 ajax연결완료");
		 req.setCharacterEncoding("utf-8");
		 
		 CommentDTO commentDTO = new CommentDTO();
		 
		 HttpSession session = req.getSession();
		int userNumber = (int) session.getAttribute("userNumber");
		 
		 int postNumer = Integer.valueOf(req.getParameter("postNumber"));
		 String commentContent =req.getParameter("commentContent"); 
		 
		 commentDTO.setCommentContent(commentContent);
		 commentDTO.setUserNumber(userNumber);
		 commentDTO.setPostNumber(postNumer);
		 
		 new CommentDAO().commentPosting(commentDTO);
		 
		 
		 
		
	}

}
