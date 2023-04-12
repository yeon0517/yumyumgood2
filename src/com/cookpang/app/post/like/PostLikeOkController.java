package com.cookpang.app.post.like;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.post.like.dao.PostLikeDAO;
import com.cookpang.app.post.like.dto.PostLikeDTO;
import com.mysql.cj.Session;

public class PostLikeOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PostLikeDAO postLikeDAO = new PostLikeDAO();
		PostLikeDTO postLikeDTO = new PostLikeDTO();
		PrintWriter out = resp.getWriter();
		
		resp.setContentType("text/html; charset=utf-8");
		
		
		postLikeDTO.setPostNumber(Integer.valueOf(req.getParameter("postNumber")));
		postLikeDTO.setUserNumber(Integer.valueOf(req.getParameter("userNumber")));
		
//		게시물 좋아요를 먼저 조회하고 
//		조회 결과가 있으면 delete, 결과가 없으면 insert
		if(postLikeDAO.checkLike(postLikeDTO)==null) {
			postLikeDAO.insertLike(postLikeDTO);
			out. print(true);
			System.out.println("추가");
		}else {
			postLikeDAO.deleteLike(postLikeDTO);
			out. print(false);
			System.out.println("삭제");
		}
		
		
		out.close();
	}

}
