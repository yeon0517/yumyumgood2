package com.cookpang.app.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
import com.cookpang.app.follow.dao.FollowDAO;
import com.cookpang.app.follow.dto.FollowDTO;

public class YoupageFollowController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		boolean followStatus = false;
		
		
		
		FollowDAO followDAO = new FollowDAO();
		FollowDTO followDTO = new FollowDTO();
		HttpSession session = req.getSession();
		PrintWriter out = resp.getWriter();
		
		
		resp.setContentType("text/html; charset=utf-8");
		
//		int userNumber =(int)session.getAttribute("userNumber");
		System.out.println("ajax연결 완료");
		
		int followNumber = (int)session.getAttribute("userNumber");
		int followingNumber =Integer.valueOf(req.getParameter("userNumber"));

		System.out.println(followNumber);
		System.out.println(followingNumber);
		
		 followDTO.setFollowNumber(followNumber);
		 followDTO.setFollowingNumber(followingNumber);
		 
		 
		 followStatus = followDAO.checkFollow(followDTO) == null ? false : true;
		 
		 System.out.println("!!!!!!!!!!!!!!!!!!!");
		 System.out.println(followStatus);
		 
		 
		 req.setAttribute("followStatus", followStatus);
		 
		 System.out.println("@@@@@@@@@@@@");
		 System.out.println(followStatus);

//		 int followCount = followDAO.getFollowCount(followNumber); // 현재 팔로워 수 가져오기
		 // followCount 누적이 안됨 쿼리 다시 고쳐야됨 팔로우수에서 누적되게 해야댐  
		if(followDAO.checkFollow(followDTO)==null) {
			followDAO.insertFollow(followDTO);
//			 followCount++; 
			out.print(true+ "," + followDAO.getFollowCount(followingNumber));
			System.out.println(followDAO.getFollowCount(followingNumber));
		
			
		}else {
			followDAO.deleteFollow(followDTO);
//			followCount--; 
			out.print(false+ "," + followDAO.getFollowCount(followingNumber));
			System.out.println(followDAO.getFollowCount(followingNumber));
		}
		out.close();
		

	
		
	}
		
}
