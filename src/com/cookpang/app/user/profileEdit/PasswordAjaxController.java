package com.cookpang.app.user.profileEdit;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.user.dao.UserDAO;
import com.cookpang.app.user.dto.UserDTO;
import com.cookpang.app.user.profileEdit.dao.ProfileEditDAO;

public class PasswordAjaxController implements Execute{
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProfileEditDAO editDAO = new ProfileEditDAO();
		UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO();
		
		String password = req.getParameter("password");
		int userNumber = (Integer)req.getSession().getAttribute("userNumber");
		
		userDTO.setUserPassword(password);
		userDTO.setUserNumber(userNumber);
		
		
		int result = editDAO.passwordOk(userDTO);
		
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print(result);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
