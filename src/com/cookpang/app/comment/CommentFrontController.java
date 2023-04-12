package com.cookpang.app.comment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.main.MainOkController;

public class CommentFrontController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String target = req.getRequestURI().substring(req.getContextPath().length());
		System.out.println(target);

		switch(target) {
		case "/comment/commentListOk.co" :
			new CommentListOkController().execute(req, resp);
			break;
		case "/comment/commentWriteOk.co" :
			new CommentWriteOkController().execute(req, resp);
			break;
		case "/comment/commentDeleteOk.co" :
			new CommentDeleteOkController().execute(req, resp);
			break;
		}
	}

}
