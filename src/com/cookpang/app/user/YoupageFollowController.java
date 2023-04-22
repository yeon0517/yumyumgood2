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

		if(followDAO.checkFollow(followDTO)==null) {
			followDAO.insertFollow(followDTO);
			out.print(true+ "," + followDAO.getFollowCount(followingNumber));
			System.out.println(followDAO.getFollowCount(followingNumber)+"추가");
		
			
		}else {
			followDAO.deleteFollow(followDTO);
			out.print(false+ "," + followDAO.getFollowCount(followingNumber));
			System.out.println(followDAO.getFollowCount(followingNumber)+"삭제");
		}
		out.close();
		

	
		
	}
		
}
