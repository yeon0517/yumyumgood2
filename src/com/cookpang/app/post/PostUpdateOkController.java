package com.cookpang.app.post;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.post.dao.PostDAO;
import com.cookpang.app.post.dto.PostDTO;
import com.cookpang.app.post.file.dao.PostFileDAO;
import com.cookpang.app.post.file.dto.PostFileDTO;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.Part;

public class PostUpdateOkController implements Execute {

	@Override
	   public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	      PostDAO postDAO = new PostDAO();
	      PostDTO postDTO = new PostDTO();
	      PostFileDAO postFileDAO = new PostFileDAO();
	      PostFileDTO postFileDTO = new PostFileDTO();
	      int postNumber = 0;
	      
	      System.out.println("writeOk컨트롤러 들어왔다!!!");
	      System.out.println(req.getParameter("boardTitle"));
	      
	      String uploadPath = req.getSession().getServletContext().getRealPath("/") + "upload/";
	      int fileSize = 1024 * 1024 ; //5MB
	      System.out.println(uploadPath);
	      
//	      하나의 input에 multiple 속성을 사용하여 여러 파일을 전달하는 경우 아래 코드를 사용한다.
//	      =======================================

	      MultipartParser parser = new MultipartParser(req, fileSize);
	      parser.setEncoding("utf-8");
	      
	      while(true) {
//	         MultipartParser객체는 여러 폼데이터를 part객체로 분리할 수 있다.
	         Part part = parser.readNextPart();
	         
	         if(part == null) {break; }
	         String postFileSystemName = null;
	         String postFileOriginalName = null;
	         
//	         part객체가 파일 데이터를 가진 경우
	         if(part.isFile()) {
	            FilePart filePart = (FilePart)part;
	            
	            filePart.setRenamePolicy(new DefaultFileRenamePolicy());
	            postFileOriginalName = filePart.getFileName();
	            
	            if(postFileOriginalName != null) {
//	               파일을 저장하기 위한 정보를 가진 객체를 만든다.
	               File file = new File(uploadPath, postFileOriginalName);
//	               파일을 저장한다.
	               filePart.writeTo(file);
//	               저장 후 파일 이름을 다시 뽑으면 저장될 때의 이름이 나온다.
	              postFileSystemName = filePart.getFileName();
	               
	              postFileDTO.setPostFileSystemName(postFileSystemName);
	              postFileDTO.setPostFileOriginalName(postFileOriginalName);
	              postFileDTO.setPostNumber(postNumber);
	               
	              postFileDAO.insert(postFileDTO);
	            }
	            
	         }else {
//	            part객체가 문자열 데이터를 가진 경우
	            ParamPart paramPart  = (ParamPart)part;
	            String paramName = paramPart.getName();
	            String paramValue = paramPart.getStringValue();
	            
	            if(paramName.equals("postTitle")) {
	               postDTO.setPostTitle(paramValue);
	            }else if(paramName.equals("postContent")) {
	               postDTO.setPostContent(paramValue);
	            }else if(paramName.equals("postRecipeContent")) {
	            	postDTO.setPostRecipeContent(paramValue);
	            }else if(paramName.equals("postNumber")) {
	                postNumber = Integer.parseInt(paramValue);
	                postDTO.setPostNumber(postNumber);
	             }
	            
	            if(postDTO.getPostTitle() == null || postDTO.getPostContent() == null) { continue; }
	            
	            postDTO.setUserNumber((Integer)req.getSession().getAttribute("userNumber"));
	            postDAO.update(postDTO);
	            
	            
	            List<PostFileDTO> files = postFileDAO.select(postNumber);
	            
	            files.stream().map(file -> file.getPostFileSystemName())
	            .map(name -> new File(uploadPath, name))
	            .filter(tmp -> tmp.exists())
	            .forEach(tmp -> tmp.delete());
	            
	            postFileDAO.delete(postNumber);
	            
	         }
	      }
	      
	      
	      
	      resp.sendRedirect("/post/postListOk.po");
	      
	      
	      
	      
	      
	      
	      
	      
	      

	   }
	}
