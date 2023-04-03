package com.cookpang.app.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserFrontController extends HttpServlet{

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
		case "/user/join.us" :
			req.getRequestDispatcher("/app/user/join.jsp").forward(req, resp);
			break;
		case "/user/joinOk.us":
			new JoinOkController().execute(req, resp);
			break;
			
		case "/user/checkIdOk.us" :
			new CheckIdOkController().execute(req, resp);
			break;
			
		case "/user/login.us":
			new LoginController().execute(req, resp);
			break;				
		case "/user/loginOk.us":
			new LoginOkController().execute(req, resp);
			break;
		case "/user/logoutOk.us":
			new LogoutOkController().execute(req, resp);
			break;
		case "/user/findPasswordOk.us":
			new FindPasswordOkController().execute(req, resp);
			break;
			
			
		
		}
	}

}
