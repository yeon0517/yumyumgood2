package com.cookpang.app.payment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.payment.dao.PaymentDAO;
import com.cookpang.app.payment.dto.PaymentDTO;
import com.cookpang.app.user.dao.UserDAO;
import com.cookpang.app.user.dto.UserDTO;

public class PaymentMoOkController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		PaymentDAO paymentDAO = new PaymentDAO();
//		PaymentDTO paymentDTO = new PaymentDTO();
//
//		req.setCharacterEncoding("utf-8");

//		paymentDTO.setOrderNumber(Integer.valueOf(req.getParameter("orderNumber")));
//		paymentDTO.setPaymentNumber(Integer.valueOf(req.getParameter("paymentNumber")));
//		paymentDTO.setPaymentAmount(Integer.valueOf(req.getParameter("paymentAmount")));
//		paymentDTO.setPaymentDate(req.getParameter("paymentDate"));
//		paymentDTO.setPaymentMethod(req.getParameter("patmentMethod"));
//
//		
//		paymentDAO.payment(paymentDTO);
		
//		resp.sendRedirect("/pay/payment.pa");
		
	}
}


















