package com.cookpang.app.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.main.dao.MainDAO;
import com.cookpang.app.user.profileEdit.vo.ProfileEditVO;
import com.cookpang.app.userList.vo.UserListVO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class MainAjaxOkController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MainDAO mainDAO = new MainDAO();
		String findUser = req.getParameter("input");
		
		
		
		List<UserListVO> users = mainDAO.findUser(findUser);
		
		Gson gson = new GsonBuilder().serializeNulls().create();

		JsonArray userList = new JsonArray();
		
		System.out.println(users);
		
		for(UserListVO user : users) {
			String jsonString = gson.toJson(user);
			userList.add(JsonParser.parseString(jsonString));
		}
		
//		users.stream()
//	    .map(gson::toJson)
//	    .map(JsonParser::parseString)
//	    .forEach(userList::add);
		 
		System.out.println(userList.toString());
		
		resp.setContentType("application/json; charSet=utf-8");
		
		PrintWriter out = resp.getWriter();
	    out.print(userList.toString());
	    out.close();
	}
}
