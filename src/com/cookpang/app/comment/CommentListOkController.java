package com.cookpang.app.comment;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
import com.cookpang.app.comment.dao.CommentDAO;
import com.cookpang.app.comment.vo.CommentVO;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class CommentListOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		HttpSession session = req.getSession();
		int userNumber = (int)session.getAttribute("userNumber");
		int postNumber = Integer.valueOf(req.getParameter("postNumber"));
//		임시 게시물 번호 나중에 연결되면 바로 밑은 삭제, 위의 주석은 해제
//		int postNumber = 8;
		
		CommentDAO commentDAO = new CommentDAO();
		
		List<CommentVO> commentList = commentDAO.getCommentList(postNumber);
		Gson gson = new Gson();
		JsonArray comments = new JsonArray();
		
		for (CommentVO comment : commentList) {
			String commentJson = gson.toJson(comment);
			
			comments.add(JsonParser.parseString(commentJson) );
		}
		
		
		resp.setContentType("application/json; charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print(comments.toString());
		out.close();
		
		
		
	}

}
