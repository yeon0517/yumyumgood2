package com.cookpang.app.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.user.dao.UserDAO;
import com.cookpang.app.user.dto.UserDTO;

public class LoginOkController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO();

		req.setCharacterEncoding("utf-8");
		
		userDTO.setUserId(req.getParameter("userId"));
		userDTO.setUserPassword(req.getParameter("userPassword"));
		
		
		
		
		System.out.println(userDAO.login(userDTO));
		resp.sendRedirect("/user/login.us");
		System.out.println("오류");
	
	}

}
