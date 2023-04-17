package com.cookpang.app.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
import com.cookpang.app.user.dao.UserDAO;
import com.cookpang.app.user.vo.UserVO;

public class YoupageController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("유페이지 진입 ");
		req.setCharacterEncoding("utf-8");
		HttpSession session = req.getSession();
		int userNumber =(int)session.getAttribute("userNumber");
	
		
		UserDAO userDAO = new UserDAO();
		UserVO userVO = null;
		userVO= userDAO.getProfileInfo(userNumber);
		

		System.out.println(userVO);
		
	    System.out.println("으디야");
		req.setAttribute("userVO", userVO);

		req.getRequestDispatcher("/app/youpage.jsp").forward(req, resp);
		
				
		
	}

}
