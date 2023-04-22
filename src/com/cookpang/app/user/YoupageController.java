package com.cookpang.app.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
import com.cookpang.app.follow.dao.FollowDAO;
import com.cookpang.app.follow.dto.FollowDTO;
import com.cookpang.app.user.dao.UserDAO;
import com.cookpang.app.user.vo.UserVO;

public class YoupageController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("유페이지 진입 ");
		req.setCharacterEncoding("utf-8");
		HttpSession session = req.getSession();
		int userNumber = Integer.valueOf(req.getParameter("userNumber"));
	
		
		
		
		UserDAO userDAO = new UserDAO();
		UserVO userVO = null;
		userVO= userDAO.getProfileInfo(userNumber);
		
		
		//===========================
		FollowDAO followDAO = new FollowDAO();
		FollowDTO followDTO = new FollowDTO();
		
		int followNumber = (int)session.getAttribute("userNumber");
		int followingNumber =Integer.valueOf(req.getParameter("userNumber"));

		boolean followStatus = false;
		
		 followDTO.setFollowNumber(followNumber);
		 followDTO.setFollowingNumber(followingNumber);
		 
		 followStatus = followDAO.checkFollow(followDTO)==null?false:true;
		 req.setAttribute("followStatus", followStatus);
		//===========================

		System.out.println(userVO);
		
	    
		req.setAttribute("userVO", userVO);

		req.getRequestDispatcher("/app/youpage.jsp").forward(req, resp);
		
				
		
	}

}
