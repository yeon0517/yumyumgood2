package com.cookpang.app.user.profileEdit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
import com.cookpang.app.user.profileEdit.dao.ProfileEditDAO;
import com.cookpang.app.user.profileEdit.vo.ProfileEditVO;
import com.cookpang.app.user.vo.UserVO;

public class ProfileUpdateOkController implements Execute{
	 @Override
	   public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 HttpSession session = req.getSession();
		 ProfileEditDAO profileEditDAO = new ProfileEditDAO();
		ProfileEditVO profileEditVO = new ProfileEditVO();
//		UserVO userVO = new UserVO();
		int userNumber=(Integer)req.getSession().getAttribute("userNumber");
		
		 
		 System.out.println("Profile수정시이이이이작");
		 System.out.println(userNumber);
		 
		 profileEditVO.setUserName(req.getParameter("userName"));
		 profileEditVO.setUserNickname(req.getParameter("userNickname"));
		 profileEditVO.setUserSelfIntroduction(req.getParameter("userSelfIntroduction"));
		 profileEditVO.setUserPhoneNumber(req.getParameter("userPhoneNumber"));
		 profileEditVO.setUserEmail(req.getParameter("userEmail"));		
		 profileEditVO.setUserAddress(req.getParameter("userAddress"));

//		 userVO.setUserName(req.getParameter("userName"));
//		 userVO.setUserNickname(req.getParameter("userNickname"));
//		 userVO.setUserSelfIntroduction(req.getParameter("userSelfIntroduction"));
//		 userVO.setUserPhoneNumber(req.getParameter("userPhoneNumber"));
//		 userVO.setUserEmail(req.getParameter("userEmail"));		
//		 userVO.setUserAddress(req.getParameter("userAddress"));
	
		 
		 
		 profileEditDAO.updateUserProfileInfo(profileEditVO);

		 System.out.println("Profile수정완");
		 System.out.println(profileEditVO);
//		 profileEditVO.setUserNumber(2);
		 
		 resp.sendRedirect("/mypage/mypageOk.my");
//		resp.sendRedirect(req.getContextPath() + "/app/editProfile.jsp");	
	 	}
	 }
