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
import com.cookpang.app.payment.dao.PaymentDAO;
import com.cookpang.app.payment.dto.PaymentDTO;
import com.cookpang.app.recipe.ingredient.vo.RecipeIngredientVO;
import com.cookpang.app.user.dao.UserDAO;
import com.cookpang.app.user.dto.UserDTO;

public class OrderOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		OrderDAO orderDAO = new OrderDAO();
		UserDAO userDAO = new UserDAO();
		
		OrderDTO orderDTO = new OrderDTO();
		PaymentDAO paymentDAO = new PaymentDAO();
		PaymentDTO paymentDTO = new PaymentDTO();
		
		req.setCharacterEncoding("utf-8");
		
//		String orderAddress = req.getParameter("address")+" "+req.getParameter("addressDetail");
//		System.out.println(orderAddress);
//		
//		orderDTO.setOrderRecipient(req.getParameter("orderRecipient"));
//		orderDTO.setOrderAddress(orderAddress);
//		orderDTO.setOrderMessage(req.getParameter("orderMessage"));
//
//		orderDAO.OrderInsert(orderDTO);
		
//		req.getRequestDispatcher("/app/payment.jsp");
		
		
		
		paymentDTO.setPaymentAmount(0);
//		paymentDTO.set
		
		
		
		
		
		
		
		
		
		
		
		
		resp.sendRedirect("/mainOk.m");
		
	}
}
