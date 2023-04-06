package com.cookpang.app.post;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.category.dto.CategoryDTO;
import com.cookpang.app.post.dao.PostDAO;
import com.cookpang.app.post.dto.PostDTO;
import com.cookpang.app.post.file.dao.PostFileDAO;
import com.cookpang.app.post.file.dto.PostFileDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class PostWriteOkController implements Execute {

	@Override
	   public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	      PostDAO postDAO = new PostDAO();
	      PostDTO postDTO = new PostDTO();
	      PostFileDAO postFileDAO = new PostFileDAO();
	      PostFileDTO postFileDTO = new PostFileDTO();
	      CategoryDTO categoryDTO = new CategoryDTO();
	      int postNumber = 0;
	      
	      String uploadPath = req.getSession().getServletContext().getRealPath("/") + "upload/";
	      int fileSize = 1024 * 1024 * 5; //5MB
	      System.out.println(uploadPath);
	     
	      MultipartRequest multipartRequest = new MultipartRequest(req, uploadPath, fileSize, "utf-8", new DefaultFileRenamePolicy());
	      
    
	      boardDTO.setBoardTitle(multipartRequest.getParameter("boardTitle"));
	      boardDTO.setBoardContent(multipartRequest.getParameter("boardContent"));
      boardDTO.setMemberNumber((Integer)req.getSession().getAttribute("memberNumber"));
    
     boardDAO.insert(boardDTO);
	      boardNumber = boardDAO.getSequence();
      
	      System.out.println(boardNumber);
	      

	      Enumeration<String> fileNames = multipartRequest.getFileNames();/	      
//	      이터레이터의 hasNex()
	      while(fileNames.hasMoreElements()) {
//	         이터레이터의 next()
	         String name = fileNames.nextElement();
	         
	         String fileSystemName = multipartRequest.getFilesystemName(name);
	         String fileOriginalName = multipartRequest.getOriginalFileName(name);
	         
	         if(fileSystemName == null) {continue;}
	         
	         fileDTO.setFileSystemName(fileSystemName);
	         fileDTO.setFileOriginalName(fileOriginalName);
	         fileDTO.setBoardNumber(boardNumber);
	         
	         System.out.println(fileDTO);
	         fileDAO.insert(fileDTO);
	      }
	      
	      
	      resp.sendRedirect("/post/postListOk.po");
	      
	      
	      
	      
	      
	      
	      
	      
	      

	   }
	}
