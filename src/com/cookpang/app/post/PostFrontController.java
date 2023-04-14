package com.cookpang.app.post;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostFrontController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String target = req.getRequestURI().substring(req.getContextPath().length());
		System.out.println(target);
		System.out.println("프론트 컨트롤러 잘 탄당!!");

		switch(target) {
		case "/post/postListOk.po":		
		new PostListOkController().execute(req,resp);
		break;
			
		case "/post/postReadOk.po":
		new PostReadOkController().execute(req, resp);
		break;
			
		case "/post/postWrite.po":		
		new PostWriteController().execute(req,resp);
		break;
		
		case "/post/postWriteOk.po":
		new PostWriteOkController().execute(req,resp);
		break;
		
		case "/post/postDeleteOk.po":
		new PostDeleteOkController().execute(req,resp);
		break;
		
		
		case "/post/postUpdate.po":
		new PostUpdateController().execute(req,resp);
		break;
		
		case "/post/postUpdateOk.po":
		new PostUpdateOkController().execute(req,resp);
		break;
		
		case "/post/postCategory.po":
			new PostCategoryController().execute(req, resp);
			break;
		}
		
		
	}

}
