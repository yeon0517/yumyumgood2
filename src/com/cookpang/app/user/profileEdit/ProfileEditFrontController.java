package com.cookpang.app.user.profileEdit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileEditFrontController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(req, resp);
		
//		req.setAttribute("userId",req.getParameter("userId"));
//		req.setAttribute("userId",req.getParameter("userId"));
//		req.setAttribute("userId",req.getParameter("userId"));
//		req.setAttribute("userId",req.getParameter("userId"));
//		req.setAttribute("userId",req.getParameter("userId"));
//		req.setAttribute("userId",req.getParameter("userId"));
//		req.setAttribute("userId",req.getParameter("userId"));
//		req.setAttribute("userId",req.getParameter("userId"));
//		req.setAttribute("userId",req.getParameter("userId"));
		
		//req.getRequestDispatcher("#").forward(req, resp);
		
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
		
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String target = req.getRequestURI().substring(req.getContextPath().length());
		System.out.println(target);
		
		switch(target) {
		case "/cookpang/profileEdit.edit" : 
//			req.getRequestDispatcher("/app/editProfile.jsp").forward(req, resp);
			new ProfileSelectController().execute(req, resp);
			System.out.println("target");
			break;
		}
	}
}

