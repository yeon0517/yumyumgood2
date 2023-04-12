package com.cookpang.app.comment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.comment.dao.CommentDAO;

public class CommentDeleteOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		new CommentDAO().deleteComment(Integer.valueOf(req.getParameter("commentNumber")));
		
	}

}
