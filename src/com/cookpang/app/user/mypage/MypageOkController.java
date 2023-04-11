package com.cookpang.app.user.mypage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
import com.cookpang.app.user.dao.UserDAO;
import com.cookpang.app.user.mypage.dao.MypageDAO;
import com.cookpang.app.user.profileImage.dao.ProfileImageDAO;
import com.cookpang.app.user.profileImage.dto.ProfileImageDTO;
import com.cookpang.app.user.vo.UserVO;

public class MypageOkController implements Execute{
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		HttpSession session = req.getSession();
		int userNumber =(int)session.getAttribute("userNumber");
	
		
		UserDAO userDAO = new UserDAO();
		MypageDAO mypageDAO= new MypageDAO();
		UserVO userVO = null;
//		ProfileImageDTO profileImage = new ProfileImageDTO();
//		ProfileImageDAO profileImageDAO = new ProfileImageDAO();
		
		userVO= mypageDAO.getProfileInfo(userNumber);
		
		
		
		System.out.println(userVO);
		
//	      ProfileImageDTO profileImage = new ProfileImageDAO().select(userNumber);
//	      profileImage = ProfileImageDAO.select(int userNumber);
//	      req.setAttribute("profileImage", profileImage);
		
	      
	    		  
	      
		req.setAttribute("userInfo", userVO);

			
			

//		resp.sendRedirect(path);
		req.getRequestDispatcher("/app/mypage.jsp").forward(req, resp);
	}
}
