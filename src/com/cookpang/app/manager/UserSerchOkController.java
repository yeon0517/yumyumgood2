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
import com.cookpang.app.user.dto.UserDTO;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class UserSerchOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ManagerDAO managerDAO = new ManagerDAO();
		
		int total = managerDAO.getUserTotal();

		String temp = req.getParameter("page");

		int page = temp == null ? 1 : Integer.valueOf(temp);

		int rowCount = 10;
		int pageCount = 5;

		int startRow = (page - 1) * rowCount;

		int endPage = (int) (Math.ceil(page / (double) pageCount) * pageCount);

		int startPage = endPage - (pageCount - 1);

		int realEndPage = (int) Math.ceil(total / (double) rowCount);

		endPage = endPage > realEndPage ? realEndPage : endPage;

		boolean prev = startPage > 1; // 이전버튼
		boolean next = endPage != realEndPage; // 다음버튼

		String userIdOrName = req.getParameter("userIdOrName");
		
		Map<String, Object> pageMap = new HashMap<>();
		pageMap.put("startRow", startRow);
		pageMap.put("rowCount", rowCount);
		pageMap.put("userIdOrName", userIdOrName);
		
		
		
		
		System.out.println(userIdOrName);
		
		
		List<UserDTO> userSerchList = managerDAO.userSerch(pageMap);
		
		
		Gson gson = new Gson();
		JsonObject result = new JsonObject();
		JsonArray usersJsonArray = gson.toJsonTree(userSerchList).getAsJsonArray();
		result.add("users", usersJsonArray);
		
		result.addProperty("page", page);
		result.addProperty("startPage", startPage);
		result.addProperty("endPage", endPage);
		result.addProperty("prev", prev);
		result.addProperty("next", next);
		
		resp.setContentType("application/json");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		out.print(result.toString());
		out.close();
		
		
		
		
		
		
	}

}












