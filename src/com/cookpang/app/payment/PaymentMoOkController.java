package com.cookpang.app.payment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.order.dto.OrderDTO;
import com.cookpang.app.order.item.dao.OrderItemDAO;
import com.cookpang.app.order.item.dto.OrderItemDTO;
import com.cookpang.app.payment.dao.PaymentDAO;
import com.cookpang.app.payment.dto.PaymentDTO;
import com.cookpang.app.user.dao.UserDAO;
import com.cookpang.app.user.dto.UserDTO;

public class PaymentMoOkController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int userNumber = (Integer)req.getSession().getAttribute("userNumber");	
		
		OrderItemDTO orderItemDTO = new OrderItemDTO();
		PaymentDAO paymentDAO = new PaymentDAO();
		OrderDTO orderDTO = new OrderDTO();
		req.setCharacterEncoding("utf-8");
		
		orderDTO.setOrderTotalCost(Integer.valueOf(req.getParameter("orderTotalCost")));
		orderDTO.setUserNumber(userNumber);
		
//		String items = Integer.valueOf(req.getParameter("orderItemNumber"))+" "+Integer.valueOf(req.getParameter("orderItemQuantity"));
		
		int number = (Integer)req.getSession().getAttribute("ingredientNumber");
		
		orderItemDTO.setIngredientNumber(number);
		orderItemDTO.setOrderItemNumber(Integer.valueOf(req.getParameter("orderItemNumber")));
		orderItemDTO.setOrderItemQuantity(Integer.valueOf(req.getParameter("orderItemQuantity")));
//		orderItemDTO.setOrderItemQuantity(Integer.valueOf(req.getParameter("orderItemQuantity")));
		
		paymentDAO.item(orderItemDTO);
		
		paymentDAO.orderTotalCost(orderDTO);

		resp.sendRedirect("/order/orderList.or");
		
		
	}
}


















