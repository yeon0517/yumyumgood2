package com.cookpang.app.payment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.order.dto.OrderDTO;
import com.cookpang.app.order.item.dao.OrderItemDAO;
import com.cookpang.app.order.item.dto.OrderItemDTO;
import com.cookpang.app.payment.dao.PaymentDAO;

public class PaymentMoOkController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int userNumber = (Integer)req.getSession().getAttribute("userNumber");	
		int orderNumber = 0;
		
		OrderItemDTO orderItemDTO = new OrderItemDTO();
		OrderDTO orderDTO = new OrderDTO();
		OrderItemDAO orderItemDAO = new OrderItemDAO();
		req.setCharacterEncoding("utf-8");
		
		orderDTO.setOrderTotalCost(Integer.valueOf(req.getParameter("orderTotalCost")));
		orderDTO.setUserNumber(userNumber);
		
		orderItemDAO.orderTotalCost(orderDTO);
		orderNumber = orderItemDAO.getSequnce();
		
		System.out.println(orderNumber);
		
		String[] ingredientNumbers = req.getParameterValues("ingredientNumber");
		
		for (int i = 0; i < ingredientNumbers.length; i++) {
			System.out.println(ingredientNumbers[i]);
		}
		
		for (String ingredientNumber : ingredientNumbers) {
			
			System.out.println("ingredientNumber :"+ingredientNumber);
			
			orderItemDTO.setOrderNumber(orderNumber);
			orderItemDTO.setIngredientNumber(Integer.valueOf(ingredientNumber));
			orderItemDTO.setOrderItemQuantity(Integer.valueOf(req.getParameter("orderItemQuantity")));
			
			System.out.println(orderItemDTO);
			
			orderItemDAO.item(orderItemDTO);
		}
		
		resp.sendRedirect("/order/orderList.or");
		
	}
}


















