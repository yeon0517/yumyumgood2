package com.cookpang.app.user.profileEdit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
import com.cookpang.app.user.dao.UserDAO;
import com.cookpang.app.user.profileEdit.vo.ProfileEditVO;

public class ProfileSelectController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDAO userDAO = new UserDAO();
		ProfileEditVO profileVO = null;
		HttpSession session = req.getSession();
		Integer userNumber = (Integer)session.getAttribute("userNumber");

		System.out.println(userNumber);
		req.setCharacterEncoding("utf-8");

		profileVO = userDAO.selectMemberProfileInfo(userNumber);
		
		System.out.println("===============()()()()()============");
//		System.out.println(userDAO.getProfileInfo(userNumber));

		req.setAttribute("profileVO", profileVO);

		req.setAttribute("profileEditVO", profileVO);
		
		System.out.println("===========================");
		System.out.println(userNumber);
		System.out.println(profileVO);


		req.getRequestDispatcher("/app/editProfile.jsp").forward(req, resp);
	
	}
}
