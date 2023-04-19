package com.cookpang.app.order;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
import com.cookpang.app.order.dao.OrderDAO;
import com.cookpang.app.order.dto.OrderDTO;
import com.cookpang.app.order.item.dao.OrderItemDAO;
import com.cookpang.app.order.vo.OrderVO;
import com.cookpang.app.user.dao.UserDAO;
import com.cookpang.app.user.dto.UserDTO;
import com.cookpang.app.userList.vo.UserListVO;

public class OrderController implements Execute{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		OrderDAO orderDAO = new OrderDAO();
		UserDTO userDTO = new UserDTO();
		UserDAO userDAO = new UserDAO();
		OrderItemDAO orderItemDAO = new OrderItemDAO();
		OrderDTO orderDTO = new OrderDTO();
	
		int userNumber = (int) session.getAttribute("userNumber");
		int orderNumber = 0;
		
		System.out.println(userNumber);
//		주문고객
		// 로그인 연결되면 여기 지우고 위에 userNumber로 교체
		int number = userNumber ;
		
		OrderVO orderVO = new OrderVO();
		UserDTO order =  orderDAO.orderInfo(number);
		
//		int order = orderVO.getOrderNumber();

		orderNumber = Integer.parseInt(req.getParameter("orderNumber")) ;
		System.out.println(orderNumber);
		
		OrderDTO cost = orderDAO.cost(orderNumber);
		List<OrderVO> test = orderDAO.defaultOrderInfo(orderNumber);
		System.out.println("=============================");
		System.out.println(number);
		System.out.println(test);
		System.out.println(cost);
		
		
//		OrderVO defaultOrderInfoList = orderDAO.defaultOrderInfo(number);
		
//		UserDTO order = orderDAO.defaultOrderInfo(number);
//		System.out.println(order);
		
		req.setAttribute("order", order);
		req.setAttribute("test", test);
		req.setAttribute("cost", cost);
		
		
//		여기에 orderList를 뽑아 와야함.
//		orderDetail
		
		
		
//		System.out.println(orderDetail);
		
//		${order.getIngredientNumber()}
		
//		req.getRequestDispatcher("/app/payment.jsp");
//		resp.sendRedirect("/order/orderListOk.or");
		req.getRequestDispatcher("/app/payment.jsp").forward(req, resp);
	}
	
}














