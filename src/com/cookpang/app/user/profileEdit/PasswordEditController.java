package com.cookpang.app.user.profileEdit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.jasper.compiler.Node.ForwardAction;

import com.cookpang.app.Execute;
import com.cookpang.app.user.dao.UserDAO;
import com.cookpang.app.user.dto.UserDTO;
import com.cookpang.app.user.profileEdit.dao.ProfileEditDAO;
import com.mysql.cj.Session;

public class PasswordEditController implements Execute{
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProfileEditDAO profileEditDAO = new ProfileEditDAO();
		UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO();
		UserDTO editDTO = null;
		
		int userNumber = (int)req.getSession().getAttribute("userNumber");
//		String userId = (String)req.getSession().getAttribute("userId");
		
		
		
//		String newPassword = userDTO.getUserPassword();
//		String newPassword = req.getParameter("userPassword");
//		if (newPassword != null) {
//		    // newPassword 값이 null이 아닐 때 실행할 코드
//			System.out.println("null이 아니지롱");
//			System.out.println(newPassword);
//		} else {
//		    // newPassword 값이 null일 때 실행할 코드
//			System.out.println("또 null이지롱");
//			System.out.println(newPassword);
//		}
		
//		String newPassword = req.getParameter("newPassword");
		
		userDTO.setUserPassword(req.getParameter("newPassword"));
		userDTO.setUserNumber(userNumber);
		
		
		profileEditDAO.editPassword(userDTO);
		
//		System.out.println(userDTO);
		
		req.setCharacterEncoding("utf-8");

		resp.sendRedirect("/user/login.us");
	}
}
