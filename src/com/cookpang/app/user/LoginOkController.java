package com.cookpang.app.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
import com.cookpang.app.user.dao.UserDAO;
import com.cookpang.app.user.dto.UserDTO;

public class LoginOkController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO();
		int userNumber = 0;
		req.setCharacterEncoding("utf-8");
		
		
		String userId = req.getParameter("userId");
		String userPassword = req.getParameter("userPassword");
		String remember = req.getParameter("remember");
		
		String path = null;
		HttpSession session = req.getSession();
		
		userDTO.setUserId(userId);
		userDTO.setUserPassword(userPassword);

		
		try {
			userNumber = userDAO.login(userDTO);
			path = "/"; //마이페이지..? 경로 잡기
			session.setAttribute("userNumber", userNumber);
		} catch (NullPointerException e) {
			path = "/user/login.us?login=fail"; 
//			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(remember);
		System.out.println(userId);
		
		if(remember != null) {
			Cookie cookie= new Cookie("userId" , userId);
			cookie.setMaxAge(60*60*24);
			resp.addCookie(cookie);
		}
		
//		System.out.println(userDAO.login(userDTO));
//		resp.sendRedirect("/user/login.us");
		resp.sendRedirect(path);
		System.out.println("오류");
		
	
	}

}
