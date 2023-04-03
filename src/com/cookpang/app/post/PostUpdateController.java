package com.cookpang.app.post;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.post.dao.PostDAO;

public class PostUpdateController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int postNumber = Integer.valueOf(req.getParameter("postNumber"));
		PostDAO postDAO = new PostDAO();
		
		req.setAttribute("post", postDAO.select(postNumber));

		req.getRequestDispatcher("/app/post/postRead.jsp").forward(req, resp);
		
	}
	
}
