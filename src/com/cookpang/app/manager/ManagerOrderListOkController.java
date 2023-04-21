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

public class ManagerOrderListOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ManagerDAO managerDAO = new ManagerDAO();
		
		int orderTotal = managerDAO.getOrderTotal();
		
		System.out.println("여기인가?");
		String orderTemp = req.getParameter("orderPage");
		System.out.println(orderTemp);
		
		int orderPage = orderTemp == null ? 1 : Integer.valueOf(orderTemp);
		
//		한 페이지에 보여줄 게시물	 목록의 갯수 10개
		int rowCount = 10;
//				페이지 버튼 세트는? 5개씩
		int pageCount = 5;

//				0, 10 -> 1페이지
//				10, 10 -> 2페이지
//				20, 10 -> 3페이지
		int orderStartRow = (orderPage - 1) * rowCount;
		
//		Math.ceil() 올림처리
		int orderEndPage = (int) (Math.ceil(orderPage / (double) pageCount) * pageCount);

//		endPage는 페이지 세트 당 마지막 번호를 의미한다.

		int orderStartPage = orderEndPage - (pageCount - 1);

//		startPage는 페이지 세트 당 첫 번째 번호를 의미한다.

		int realOrderEndPage = (int) Math.ceil(orderTotal/ (double) rowCount);

//		realEndPage는 전체 페이 중 가장 마지막 번호를 의미한다.

		orderEndPage = orderEndPage > realOrderEndPage ? realOrderEndPage : orderEndPage;

//		첫 번째 페이 세트가 1~5
//		두 번째 페이 세트가 6~10이어도
//		realEndPage가 7이라면 두번째 페이지 세트의 마지막 번호는 7이어야 한다.

		boolean orderPrev = orderStartPage > 1; // 이전버튼
		boolean orderNext = orderEndPage != realOrderEndPage; // 다음버튼

		
		
//		게시물 페이징
		Map<String, Integer> orderPageMap = new HashMap<>();
		orderPageMap.put("orderStartRow", orderStartRow);
		orderPageMap.put("rowCount", rowCount);
		
		List<OrderVO> ordersList = managerDAO.selectOrderAll(orderPageMap);
		
		Gson gson = new Gson();
		JsonObject orderResult = new JsonObject();
		
		JsonArray ordersJsonArray = gson.toJsonTree(ordersList).getAsJsonArray();
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
		System.out.println(orderResult.toString());
		out.close();
		
		
		
		
	}

}
