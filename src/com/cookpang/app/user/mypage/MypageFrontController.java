package com.cookpang.app.user.mypage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.post.PostListOkController;

public class MypageFrontController extends HttpServlet{
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

		switch(target) {
		case "/mypage/mypageOk.my" :
			new MypageOkController().execute(req, resp);
			break;
		
		case "/mypage/mypageLikeOk.myAjax" :
			new MyPageLikeOkController().execute(req, resp);
			break;
			
		case "/mypage/paymentListOk.myAjax" :
			new PaymentListOkController().execute(req, resp);
			break;
			
		case "/mypage/mypageListOk.my" :
			new MyPageListOkController().execute(req, resp);
			break;
		
		
		}
	}
}
