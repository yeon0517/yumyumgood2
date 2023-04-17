package com.cookpang.app.order.item;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.order.dao.OrderDAO;
import com.cookpang.app.order.dto.OrderDTO;
import com.cookpang.app.order.item.dao.OrderItemDAO;

public class orderItemController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////		총 금액, 주문수량,주문상품 
////		order_total_cost-- 총 주문 금액
////		userNumber 
//		
//		int userNumber = 15;
////		int userNumber = (Integer)req.getSession().getAttribute("userNumber");		
//		
//		OrderItemDAO orderItemDAO = new OrderItemDAO();
//		OrderDTO orderDTO = new OrderDTO();
//		req.setCharacterEncoding("utf-8");
//		
//		orderDTO.setOrderTotalCost(Integer.valueOf("orderTotalCost")); //총 금액 jsp에도 적혀있음
//		orderDTO.setUserNumber(Integer.valueOf("userNumber"));
//		
//		orderItemDAO.orderTotalCost(orderDTO);
//		
//		System.out.println("연결아이템");
//		resp.sendRedirect("/order/orderList.or");
		
	}

}
