package com.cookpang.app.user.profileEdit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
import com.cookpang.app.user.dao.UserDAO;
import com.cookpang.app.user.dto.UserDTO;
import com.cookpang.app.user.profileEdit.dao.ProfileEditDAO;
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
		
////		여기서부터 비밀번호 변경 코드
//		ProfileEditDAO profileEditDAO = new ProfileEditDAO();
////		UserDAO userDAO = new UserDAO();
//		UserDTO userDTO = new UserDTO();
//		
////		int userNumbers = (Integer)req.getSession().getAttribute("userNumber");
//		
//		
//		
//		userDTO.setUserPassword(req.getParameter("userPassword"));
//		userDTO.setUserNumber(userNumber);
//		
//		System.out.println(userDTO);
//		profileEditDAO.editPassword(userDTO);
//		
//		System.out.println(userNumber);
//		System.out.println("이러다 다~~~ 죽어~~!!");
//		req.setCharacterEncoding("utf-8");


		req.getRequestDispatcher("/app/editProfile.jsp").forward(req, resp);
	
	}
}
