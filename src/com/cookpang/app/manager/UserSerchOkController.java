package com.cookpang.app.manager;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
		
		System.out.println("여기 왜 안들어오냐");
		
		ManagerDAO managerDAO = new ManagerDAO();
		resp.setContentType("application/json");
		resp.setCharacterEncoding("utf-8");
		
		String userIdOrName = req.getParameter("userIdOrName");
		
		List<UserDTO> userSerchList = managerDAO.userSerch(userIdOrName);
		
		Gson gson = new Gson();
		JsonObject result = new JsonObject();
		
		JsonArray usersJsonArray = gson.toJsonTree(userSerchList).getAsJsonArray();
		result.add("users", usersJsonArray);
		
		
		
		PrintWriter out = resp.getWriter();
		out.print(result.toString());
		System.out.println(result.toString());
		out.close();
		
		
		
		
		
		
		
		
		
		
	}

}












