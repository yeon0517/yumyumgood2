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

public class PostReadOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int postNumber = Integer.valueOf(req.getParameter("postNumber"));
		PostDAO postDAO = new PostDAO();
		
		List<PostFileDTO> files = new PostFileDAO().select(postNumber);
		
		postDAO.updatePostViewCount(postNumber);
		
		req.getRequestDispatcher("/app/post/postRead.jsp").forward(req, resp);
		
		
	}
	
	
	
	
}
