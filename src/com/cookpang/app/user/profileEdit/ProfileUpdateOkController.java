package com.cookpang.app.user.profileEdit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.user.profileEdit.dao.ProfileEditDAO;
import com.cookpang.app.user.profileEdit.vo.ProfileEditVO;
import com.cookpang.app.user.profileImage.dao.ProfileImageDAO;
import com.cookpang.app.user.profileImage.dto.ProfileImageDTO;

public class ProfileUpdateOkController implements Execute{
	 @Override
	   public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  
		 ProfileEditDAO profileEditDAO = new ProfileEditDAO();
//		 ProfileEditVO profileEditVO = new ProfileEditVO();
		 ProfileImageDAO profileImageDAO = new ProfileImageDAO();
		ProfileImageDTO profileImageDTO = new ProfileImageDTO();
	
		 
		 System.out.println("Profile수정시이이이이작");
		 System.out.println(req.getParameter("userNumber"));
	
		 int userNumber = Integer.parseInt(req.getParameter("userNumber"));
	      String userName = req.getParameter("userName");
		 String userId = req.getParameter("userId");
		 String userNickName = req.getParameter("userNickName");
		 String userPhoneNumber = req.getParameter("userPhoneNumber");
		 String userEmail = req.getParameter("userEmail");
		 String userAddress = req.getParameter("userAddress");
		 String userSelfIntroduction = req.getParameter("userSelfIntroduction");
		 
		 
		 
//	List<FileDTO> files = fileDAO.select(boardNumber);
//    
//    files.stream().map(file -> file.getFileSystemName())
//    .map(name -> new File(uploadPath, name))
//    .filter(tmp -> tmp.exists())
//    .forEach(tmp -> tmp.delete());
//    
//    fileDAO.delete(boardNumber);
		 
//			req.getRequestDispatcher("/app/editProfile.jsp").forward(req, resp);
		resp.sendRedirect(req.getContextPath() + "/app/editProfile.jsp");	
	 	}
	 }
