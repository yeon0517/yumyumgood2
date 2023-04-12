package com.cookpang.app.user.profileImage;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
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
        int userNumber = 0;
        
        String uploadPath = req.getSession().getServletContext().getRealPath("/") + "upload/";
        int fileSize = 1024 * 1024 * 5; //5MB
        System.out.println(uploadPath);
        
        MultipartRequest request = new MultipartRequest(req, uploadPath, fileSize, "utf-8", new DefaultFileRenamePolicy());
        
        
        
        userNumber = profileImageDAO.getSequence();
        
        Enumeration<String> fileNames = request.getFileNames();         
//      이터레이터의 hasNex()
      while(fileNames.hasMoreElements()) {
//        이터레이터의 next()
         String name = fileNames.nextElement();
         
         String fileSystemName = request.getFilesystemName(name);
         String fileOriginalName = request.getOriginalFileName(name);
        
          System.out.println(fileSystemName);
          System.out.println(fileOriginalName);
         
         if(fileSystemName == null) {continue;}

         profileImageDTO.setUserProfileImageSystemName(fileSystemName);
         profileImageDTO.setUserProfileOriginalName(fileOriginalName);
         profileImageDTO.setUserNumber(userNumber);
   
         
         
         System.out.println(profileImageDTO);
         profileImageDAO.insertImg(profileImageDTO);
         
         
         
      }
//      null 값인 경우와 null 값이 아닌 경우를 나눠서 insert와 update를 따로 사용해 이미지를 넣어줌
      if(profileImageDAO.selectImage(userNumber)  != null) {            
//         전에 DTO에 있던 파일은 삭제하고 새로 받아오는 channelFileDTO에 넣은 이미지는 update해줌
          ProfileImageDTO profileImageDTO2 = profileImageDAO.selectImage(userNumber);
          File existFile = new File(uploadPath, profileImageDTO2.getUserProfileImageSystemName());
          existFile.delete();
          
          profileImageDAO.updateImg(profileImageDTO);
       }else {             
    	   profileImageDAO.insertImg(profileImageDTO);
     }      
      resp.sendRedirect("/user/profileEditUpdate.edit");
   }
//		req.getRequestDispatcher("/app/editProfile.jsp").forward(req, resp);
		  
	}


