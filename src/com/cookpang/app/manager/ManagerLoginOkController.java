package com.cookpang.app.manager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
import com.cookpang.app.manager.dao.ManagerDAO;
import com.cookpang.app.user.dto.UserDTO;

public class ManagerLoginOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ManagerDAO managerDAO = new ManagerDAO();
		UserDTO userDTO = new UserDTO();
		UserDTO managerDTO = null;

		int managerNumber = 0;
		String path = null;

		HttpSession session = req.getSession();
		String remember = req.getParameter("remember");
		String managerId = req.getParameter("managerId");
		String managerPassword = req.getParameter("managerPassword");

		req.setCharacterEncoding("utf-8");

		userDTO.setUserId(managerId);
		userDTO.setUserPassword(managerPassword);

		
		
		try {
	        managerDTO = managerDAO.managerLogin(userDTO);

	        if (managerDTO == null) {
	            path = "/manager/managerLogin.manager?login=fail";
	        } else if (managerDTO.getUserStatus().equals("user")) {
	            path = "/user/login.us";
	        } else if (managerDTO.getUserStatus().equals("manager")) {
	            managerNumber = managerDTO.getUserNumber();
	            path = "/manager/managerListOk.manager"; // 관리자페이지로 이동
	            session.setAttribute("managerNumber", managerNumber);
	            session.setAttribute("userNumber", managerNumber);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }


		
		resp.sendRedirect(path);

	}

}
