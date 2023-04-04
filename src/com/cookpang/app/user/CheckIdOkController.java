package com.cookpang.app.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.user.dao.UserDAO;
import com.cookpang.app.user.dto.UserDTO;


public class CheckIdOkController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	UserDAO userDAO = new UserDAO();
	
	boolean isTrue = userDAO.checkId(req.getParameter("userId"));
	resp.setContentType("text/html; charset=utf-8");
	PrintWriter out = resp.getWriter();
	
	out.print(isTrue ? 1 : 0);
	out.close();
	}
}
