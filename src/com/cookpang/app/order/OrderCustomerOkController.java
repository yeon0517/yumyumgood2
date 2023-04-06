package com.cookpang.app.order;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.order.dao.OrderDAO;
import com.cookpang.app.order.dto.OrderDTO;

public class OrderCustomerOkController implements Execute {

	@Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 입력된 주문 정보를 받아옵니다.
        int userNumber = Integer.parseInt(req.getParameter("userNumber"));
        String orderDate = req.getParameter("orderDate");
        int orderZipCode = Integer.parseInt(req.getParameter("orderZipCode"));
        String orderAddress = req.getParameter("orderAddress");
        String orderMessage = req.getParameter("orderMessage");
        int orderTotalCost = Integer.parseInt(req.getParameter("orderTotalCost"));
        String orderStatus = req.getParameter("orderStatus");

        // 주문 정보 DTO에 저장합니다.
        OrderDTO order = new OrderDTO();
        order.setUserNumber(userNumber);
        order.setOrderDate(orderDate);
        order.setOrderZipCode(orderZipCode);
        order.setOrderAddress(orderAddress);
        order.setOrderMessage(orderMessage);
        order.setOrderTotalCost(orderTotalCost);
        order.setOrderStatus(orderStatus);

        // 주문 정보를 DB에 저장합니다.
        OrderDAO orderDAO = OrderDAO.getInstance();
        orderDAO.insertOrder(order);
System.out.println(order);
        // 주문 완료 페이지로 이동합니다.
        RequestDispatcher dispatcher = req.getRequestDispatcher("/");
        dispatcher.forward(req, resp);
        
	}

}
