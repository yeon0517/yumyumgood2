package com.cookpang.app.order;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
import com.cookpang.app.order.dao.OrderDAO;
import com.cookpang.app.user.dao.UserDAO;
import com.cookpang.app.user.dto.UserDTO;

public class OrderOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		OrderDAO orderDAO = new OrderDAO();
		UserDAO userDAO = new UserDAO();
		
//		로그인을 했을때 userNumber -> OderOk에 userNumber를 보낼수는 없나?
		
//		UserDTO userDTO = new UserDTO();
//		
//		userDTO.getUserNumber();
		HttpSession session = req.getSession();
		int userNumber = (int) session.getAttribute("userNumber");
		
		System.out.println(userNumber);
//		주문고객
		// 로그인 연결되면 여기 지우고 위에 userNumber로 교체
		int number = 16;
		
		
		UserDTO order = orderDAO.defaultOrderInfo(number);
		System.out.println(order);
		
		req.setAttribute("order", order);
//		주문고객
		
		
		req.getRequestDispatcher("/app/payment.jsp").forward(req, resp);
	}
}
