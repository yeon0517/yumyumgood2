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

public class YoupageLikeController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean followStatus = false;
		FollowDAO followDAO = new FollowDAO();
		FollowDTO followDTO = new FollowDTO();
		HttpSession session = req.getSession();
		PrintWriter out = resp.getWriter();
		
		
		resp.setContentType("text/html; charset=utf-8");
		
		followDTO.setFollowNumber(Integer.valueOf(req.getParameter("followNumber")));
		followDTO.setFollowingNumber(Integer.valueOf(req.getParameter("followingNumber")));
		int userNumber =(int)session.getAttribute("userNumber");
		
		
		followStatus = followDAO.checkFollow(followDTO) ==null ? false : true;
		req.setAttribute("followStatus", followStatus);
		
		
		if(followDAO.checkFollow(followDTO)==null) {
			followDAO.insertFollow(followDTO);
			out. print(true+ "," + followDAO.getFollowCount(Integer.valueOf(req.getParameter("followNumber"))));
			System.out.println("팔로워 추가");
		
			
		}else {
			followDAO.deleteFollow(followDTO);
			out.print(false+ "," + followDAO.getFollowCount(Integer.valueOf(req.getParameter("followNumber"))));
			System.out.println("팔로워 삭제");
		}
		out.close();
//		
//		if(followDAO.checkFollow(followDTO)==null) {
//			followDAO.insertFollow(followDTO);
//			out. print(true+ "," + followDAO.getFollowingCount(Integer.valueOf(req.getParameter("followingNumber"))));
//			System.out.println("팔로잉 추가");
//		
//			
//		}else {
//			followDAO.deleteFollow(followDTO);
//			out.print(false+ "," + followDAO.getFollowingCount(Integer.valueOf(req.getParameter("followingNumber"))));
//			System.out.println("팔로잉 삭제");
//		}
//		
//	
		
	}
		
}
