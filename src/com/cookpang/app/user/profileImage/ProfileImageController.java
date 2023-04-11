package com.cookpang.app.user.profileImage;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.user.profileImage.dao.ProfileImageDAO;
import com.cookpang.app.user.profileImage.dto.ProfileImageDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class ProfileImageController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
        
          
         
         if(fileSystemName == null) {continue;}

         profileImageDTO.setUserProfileImageSystemName(fileSystemName);
         profileImageDTO.setUserProfileOriginalName(fileOriginalName);
         profileImageDTO.setUserNumber(userNumber);
   
         
         
         System.out.println(profileImageDTO);
         profileImageDAO.insertImg(profileImageDTO);
         
      }
      
      resp.sendRedirect("/profileImage/profileImage.pr");
//		req.getRequestDispatcher("/app/editProfile.jsp").forward(req, resp);
		  }
		}
