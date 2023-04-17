package com.cookpang.app.order.item;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.order.dao.OrderDAO;
import com.cookpang.app.order.dto.OrderDTO;
import com.cookpang.app.order.item.dao.OrderItemDAO;
import com.cookpang.app.order.item.dto.OrderItemDTO;
import com.cookpang.app.post.dao.PostDAO;

public class orderItemOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		int userNumber = 15;
////		int userNumber = (Integer)req.getSession().getAttribute("userNumber");		
//		
//		System.out.println("일단 연결까진 됨");
//		
//		OrderDTO orderDTO = new OrderDTO();
//		OrderDAO orderDAO = new OrderDAO();
//		OrderItemDTO orderItemDTO = new OrderItemDTO();
//		OrderItemDAO orderItemDAO = new OrderItemDAO();
//		req.setCharacterEncoding("utf-8");
//		
//		orderDTO.setOrderTotalCost(Integer.valueOf("totalPrice")); //총 금액 jsp에도 적혀있음
//		orderDTO.setUserNumber(Integer.valueOf("userNumber"));
//		System.out.println("강승연");
//		System.out.println(orderDTO);
//		System.out.println("개 ㅄ");
//		
//		orderItemDTO.setIngredientNumber(Integer.valueOf(req.getParameter("ingredientNumber")));
//		orderItemDTO.setOrderItemNumber(Integer.valueOf(req.getParameter("orderItemNumber")));
//		orderItemDTO.setOrderItemQuantity(Integer.valueOf(req.getParameter("orderItemQuantity")));
//		orderItemDTO.setOrderNumber(new PostDAO().getSequence());
//
//		
//		orderDAO.orderCost(orderDTO);
//		orderItemDAO.item(orderItemDTO);
//		
////		req.getRequestDispatcher("/app/paymentModal.jsp");
//		resp.sendRedirect("/order/orderList.or");
		
	}

}
