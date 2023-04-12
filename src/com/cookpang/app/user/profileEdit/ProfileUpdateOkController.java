package com.cookpang.app.user.profileEdit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
import com.cookpang.app.user.dto.UserDTO;
import com.cookpang.app.user.profileEdit.dao.ProfileEditDAO;
import com.cookpang.app.user.profileEdit.vo.ProfileEditVO;

public class ProfileUpdateOkController implements Execute{
	 @Override
	   public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 HttpSession session = req.getSession();
		 ProfileEditDAO profileEditDAO = new ProfileEditDAO();
		ProfileEditVO profileEditVO = new ProfileEditVO();
		UserDTO userDTO = new UserDTO();
		req.setCharacterEncoding("utf-8");

		int userNumber=(Integer)req.getSession().getAttribute("userNumber");
		
		 
		 System.out.println("Profile수정시이이이이작");
		 System.out.println(userNumber);
		 
		 
		 userDTO.setUserNumber(userNumber);
		 userDTO.setUserName(req.getParameter("userName"));
		 userDTO.setUserNickname(req.getParameter("userNickname"));
		 userDTO.setUserSelfIntroduction(req.getParameter("userSelfIntroduction"));
		 userDTO.setUserPhoneNumber(req.getParameter("userPhoneNumber"));
		 userDTO.setUserEmail(req.getParameter("userEmail"));		
		 userDTO.setUserAddress(req.getParameter("userAddress")+req.getParameter("userAddressDetail"));
		 
		 
		 System.out.println("++++++++");
		 System.out.println(req.getParameter("userName"));
		 System.out.println(req.getParameter("userNickname"));
		 System.out.println(req.getParameter("userSelfIntroduction"));
		 System.out.println(req.getParameter("userPhoneNumber"));
		 System.out.println(req.getParameter("userEmail"));
		 System.out.println(req.getParameter("userAddress")+req.getParameter("userAddressDetail"));
		 
		 
		 System.out.println(userDTO);
		 
		 
		 profileEditDAO.updateUserProfileInfo(userDTO);

		 System.out.println("Profile수정완");
//		 profileEditVO.setUserNumber(2);
		 resp.sendRedirect("/mypage/mypageOk.my");
//		 req.getRequestDispatcher("/profileImage/profileEditUpdateImg.pr").forward(req, resp);
//		 req.getRequestDispatcher("/mypage/mypageOk.my").forward(req, resp);
//		resp.sendRedirect(req.getContextPath() + "/app/editProfile.jsp");	
	 	}
	 }
