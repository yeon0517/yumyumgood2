package com.cookpang.app.manager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.manager.dao.ManagerDAO;
import com.cookpang.app.order.dto.OrderDTO;

public class OrderStatusUpdateOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ManagerDAO managerDAO = new ManagerDAO();
		OrderDTO orderDTO = new OrderDTO(); 
		
		int orderNumber = Integer.valueOf(req.getParameter("orderNumber"));
		String orderStatus = req.getParameter("orderStatus");
		
		orderDTO.setOrderNumber(orderNumber);
		orderDTO.setOrderStatus(orderStatus);
		
		managerDAO.orderStatusUpdate(orderDTO);
		
	}

}
