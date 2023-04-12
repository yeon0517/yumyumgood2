package com.cookpang.app.user.profileEdit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.user.profileImage.ProfileImageController;

public class ProfileEditFrontController extends HttpServlet{

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
		case "/user/profileEdit.edit" : 
			new ProfileSelectController().execute(req, resp);
			System.out.println("프로필 편집 불러오기 ");
			break;
			
//		case "/user/profileEditUpdate.edit" : 
//			new ProfileUpdateController().execute(req, resp);
//			System.out.println("프로필 업데이트");
//			break;
		case "/user/profileEditUpdateOK.edit" : 
			new ProfileUpdateOkController().execute(req, resp);
			System.out.println("프로필 업데이트Ok");
			break;
		case "/profileImage/profileEditUpdateImg.pr" : 
			new ProfileImageController().execute(req, resp);
			System.out.println("프로필 이미지 업데이트");
			break;
			
		
			
			
		
		}
	}
}

