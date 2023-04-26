package com.cookpang.app.manager;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.manager.dao.ManagerDAO;
import com.cookpang.app.order.vo.OrderVO;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class OrderSerchOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ManagerDAO managerDAO = new ManagerDAO();
		
		
		Map<String, Object> orderPageMap = new HashMap<>();
		String serchKeyword = req.getParameter("serchKeyword");
		orderPageMap.put("serchKeyword", serchKeyword);
		
		int orderTotal = managerDAO.getOrderSerchTotal(orderPageMap);

		String orderTemp = req.getParameter("orderPage");

		int orderPage = orderTemp == null ? 1 : Integer.valueOf(orderTemp);

		int rowCount = 10;
		int pageCount = 5;

		int orderStartRow = (orderPage - 1) * rowCount;       

		int orderEndPage = (int) (Math.ceil(orderPage / (double) pageCount) * pageCount);

		int orderStartPage = orderEndPage - (pageCount - 1);

		int orderRealEndPage = (int) Math.ceil(orderTotal / (double) rowCount);

		orderEndPage = orderEndPage > orderRealEndPage ? orderRealEndPage : orderEndPage;

		boolean orderPrev = orderStartPage > 1; // 이전버튼
		boolean orderNext = orderEndPage != orderRealEndPage; // 다음버튼

		
		
		orderPageMap.put("orderStartRow", orderStartRow);
		orderPageMap.put("rowCount", rowCount);
		
		
		
		List<OrderVO> orderSerchList = managerDAO.orderSerch(orderPageMap);
		
		
		Gson gson = new Gson();
		JsonObject orderResult = new JsonObject();
		JsonArray ordersJsonArray = gson.toJsonTree(orderSerchList).getAsJsonArray();
		orderResult.add("orders", ordersJsonArray);
		
		orderResult.addProperty("orderPage", orderPage);
		orderResult.addProperty("orderStartPage", orderStartPage);
		orderResult.addProperty("orderEndPage", orderEndPage);
		orderResult.addProperty("orderPrev", orderPrev);
		orderResult.addProperty("orderNext", orderNext);
		
		resp.setContentType("application/json");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		
		out.print(orderResult.toString());
		out.close();
		
	}

}
