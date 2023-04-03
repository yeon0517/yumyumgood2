package com.cookpang.app.post;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.post.dao.PostDAO;
import com.cookpang.app.post.file.dao.PostFileDAO;
import com.cookpang.app.post.file.dto.PostFileDTO;

public class PostDeleteOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PostDAO postDAO = new PostDAO();
		PostFileDAO postFileDAO = new PostFileDAO();
		
		int postNumber = Integer.valueOf(req.getParameter("postNumber"));
		
		System.out.println(postNumber);
		String uploadPath = req.getSession().getServletContext().getRealPath("/") + "upload/";
		List<PostFileDTO> files = postFileDAO.select(postNumber);
		
		files.stream().map(file->file.getPostFileSystemName())
		.map(name-> new File(uploadPath, name))
		.filter(tmp->tmp.exists())
		.forEach(tmp->tmp.delete());
		
		
		postFileDAO.delete(postNumber);
		postDAO.delete(postNumber);
		
		resp.sendRedirect("/post/postListOk.po");
		
	}

	
}
