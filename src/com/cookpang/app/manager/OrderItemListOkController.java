package com.cookpang.app.manager;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.order.item.dao.OrderItemDAO;
import com.cookpang.app.order.item.vo.OrderItemVO;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class OrderItemListOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int orderNumber = Integer.parseInt(req.getParameter("orderNumber"));
		
		OrderItemDAO orderItemDAO = new OrderItemDAO();
		
		List<OrderItemVO> orderItmeList = orderItemDAO.getOrderItems(orderNumber);
		
		System.out.println(orderItmeList);
		
		Gson gson = new Gson();
		JsonObject result = new JsonObject();
		
		JsonArray orderItemsJsonArray = gson.toJsonTree(orderItmeList).getAsJsonArray();
		result.add("orderItems", orderItemsJsonArray);
		
		
		resp.setContentType("application/json");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		out.print(result.toString());
		
		System.out.println(result.toString());
		out.close();
		
		
	}

}
