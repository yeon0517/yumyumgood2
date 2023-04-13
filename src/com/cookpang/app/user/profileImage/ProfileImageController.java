package com.cookpang.app.user.profileImage;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
import com.cookpang.app.user.dto.UserDTO;
import com.cookpang.app.user.profileEdit.dao.ProfileEditDAO;
import com.cookpang.app.user.profileEdit.vo.ProfileEditVO;
import com.cookpang.app.user.profileImage.dao.ProfileImageDAO;
import com.cookpang.app.user.profileImage.dto.ProfileImageDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class ProfileImageController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		ProfileImageDAO profileImageDAO = new ProfileImageDAO();
		ProfileImageDTO profileImageDTO = new ProfileImageDTO();
		System.out.println("image컨트롤러 들어왔다!!");
		UserDTO userDTO = new UserDTO();
		ProfileEditDAO profileEditDAO = new ProfileEditDAO();
		ProfileEditVO profileEditVO = new ProfileEditVO();
		req.setCharacterEncoding("utf-8");
//		int userNumber=(Integer)req.getSession().getAttribute("userNumber");
		
		 
		int userNumber = 0;
		userNumber = (int)session.getAttribute("userNumber");
		
		
		String uploadPath = req.getSession().getServletContext().getRealPath("/") + "upload/";
		int fileSize = 1024 * 1024 * 5; // 5MB
		System.out.println(uploadPath);

		MultipartRequest request = new MultipartRequest(req, uploadPath, fileSize, "utf-8",
		new DefaultFileRenamePolicy());

		 userDTO.setUserNumber(userNumber);
		 userDTO.setUserName(request.getParameter("userName"));
		 userDTO.setUserNickname(request.getParameter("userNickname"));
		 userDTO.setUserSelfIntroduction(request.getParameter("userSelfIntroduction"));
		 userDTO.setUserPhoneNumber(request.getParameter("userPhoneNumber"));
		 userDTO.setUserEmail(request.getParameter("userEmail"));		
		 userDTO.setUserAddress(request.getParameter("userAddress")+request.getParameter("userAddressDetail"));
		 
		 profileEditDAO.updateUserProfileInfo(userDTO);

		 System.out.println("Profile데이터만  수정완");

		
		
		
		Enumeration<String> fileNames = request.getFileNames();
//      이터레이터의 hasNex()
		while (fileNames.hasMoreElements()) {
//        이터레이터의 next()
			String name = fileNames.nextElement();

			String fileSystemName = request.getFilesystemName(name);
			String fileOriginalName = request.getOriginalFileName(name);

			System.out.println(fileSystemName);
			System.out.println(fileOriginalName);

			
			if (fileSystemName == null) {
				continue;
			}

			profileImageDTO.setUserProfileImageSystemName(fileSystemName);
			profileImageDTO.setUserProfileOriginalName(fileOriginalName);
			profileImageDTO.setUserNumber(userNumber);
		
			System.out.println(profileImageDTO);
			System.out.println(userDTO);
		

		}
//      null 값인 경우와 null 값이 아닌 경우를 나눠서 insert와 update를 따로 사용해 이미지를 넣어줌
		if (profileImageDAO.selectImage(userNumber) != null) {
//         전에 DTO에 있던 파일은 삭제하고 새로 받아오는 channelFileDTO에 넣은 이미지는 update해줌
			ProfileImageDTO profileImageDTO2 = profileImageDAO.selectImage(userNumber);
			File existFile = new File(uploadPath, profileImageDTO2.getUserProfileImageSystemName());
//			existFile.delete();

			profileImageDAO.updateImg(profileImageDTO);
		} else {
			profileImageDAO.insertImg(profileImageDTO);
		}
		
		
		System.out.println("왜안대 ");  
		System.out.println(profileImageDTO);  
		 resp.sendRedirect("/mypage/mypageOk.my");

	}

}
