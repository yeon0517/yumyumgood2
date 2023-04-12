package com.cookpang.app.user.profileEdit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
import com.cookpang.app.user.dao.UserDAO;
import com.cookpang.app.user.profileEdit.dao.ProfileEditDAO;
import com.cookpang.app.user.vo.UserVO;

public class ProfileUpdateController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int userNumber = Integer.valueOf(req.getParameter("userNumber"));
	ProfileEditDAO profileEditDAO = new ProfileEditDAO();
	
	req.setAttribute("user", profileEditDAO);
	
		req.getRequestDispatcher("/app/editProfile.jsp").forward(req, resp);
	}

}
