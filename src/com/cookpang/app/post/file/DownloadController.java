package com.cookpang.app.post.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;

public class DownloadController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 String postFileSystemName = req.getParameter("postFileSystemName");
	      String postFileOriginalName = req.getParameter("postFileOriginalName");
	      String uploadPath = req.getSession().getServletContext().getRealPath("/") + "upload/";
	      
	      InputStream in = null;
	      OutputStream out = null;
	      
	      File postFile = new File(uploadPath, postFileSystemName);
	      
	      byte[] buffer = new byte[1024];
	      
//	      클라이언트에게 보내는 응답이 이전과 다르게 파일(이진) 데이터이므로 컨텐트 타입을 다르게 설정한다.
	      resp.setContentType("application/octet-stream");
	      resp.setHeader("Content-Length", postFile.length() + "");
	      resp.setHeader("Content-Disposition", "attachment; filename=" + postFileOriginalName);
	      
	      in = new FileInputStream(postFile);
	      out = resp.getOutputStream();
	      
	      
	      int readCnt = 0;
	      
	      while( (readCnt = in.read(buffer)) != -1) {
	         out.write(buffer, 0, readCnt);
	      }
	}
	
}
