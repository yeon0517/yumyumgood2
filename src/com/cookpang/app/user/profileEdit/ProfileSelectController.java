package com.cookpang.app.user.profileEdit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.user.dao.UserDAO;
import com.cookpang.app.user.profileEdit.vo.ProfileEditVO;

public class ProfileSelectController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDAO userDAO = new UserDAO();
//		UserDTO userDTO = new UserDTO();

//		ProfileEditVO profileVO = new ProfileEditVO();
//		ProfileEditVO profileEditVO = new ProfileEditVO();

		req.setCharacterEncoding("utf-8");
		int helpme = 1;

		ProfileEditVO profileVO = null;
		
//		userDTO.setUserId(req.getParameter("userId"));
//		userDTO.setUserPassword(req.getParameter("userPassword"));

		
		profileVO = userDAO.getUserProfileInfo(helpme);

		req.setAttribute("profileVO", profileVO);

		req.setAttribute("profileEditVO", profileVO);
		
		System.out.println(profileVO.toString());


		req.getRequestDispatcher("/app/editProfile.jsp").forward(req, resp);
	
	}
}
