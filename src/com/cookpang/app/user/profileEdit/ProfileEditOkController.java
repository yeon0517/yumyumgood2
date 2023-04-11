package com.cookpang.app.user.profileEdit;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.user.profileEdit.dao.ProfileEditDAO;
import com.cookpang.app.user.profileEdit.vo.ProfileEditVO;
import com.cookpang.app.user.profileImage.dao.ProfileImageDAO;
import com.cookpang.app.user.profileImage.dto.ProfileImageDTO;

public class ProfileEditOkController implements Execute{
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
//		int userNumber=Integer.valueOf(req.getParameter("userNumber"));
//		ProfileEditDAO profileEditDAO = new ProfileEditDAO();
//		ProfileEditVO profileEditVO = new ProfileEditVO();
////		List<ProfileImageDTO> files = new ProfileImageDAO().select(userNumber);
//
//		System.out.println("profileEditOk컨트롤러~~");
//		System.out.println(req.getParameter("userName"));
//		
//		profileEditDAO.updateUserProfileInfo(userNumber);
//		
//		
////		profileImageDTO.setFiles(files);
//		
//		req.setAttribute("profileEditVO", profileEditVO);
//		
//		req.getRequestDispatcher("/app/mypage.jsp").forward(req, resp);
//	
//		
		
		
	}
}
