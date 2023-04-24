package com.cookpang.app.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
import com.cookpang.app.follow.dao.FollowDAO;
import com.cookpang.app.follow.vo.FollowVO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class YoupageFollowingController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FollowDAO followDAO = new FollowDAO();
//		FollowVO followVO = new FollowVO();
		HttpSession session = req.getSession();
//		int followingNumber = (int)session.getAttribute("userNumber");
		int followingNumber = Integer.parseInt(req.getParameter("userNumber"));
//		int followNumber = Integer.parseInt(req.getParameter("userNumber"));
//		int followingNumber =Integer.valueOf(req.getParameter("userNumber"));
		
		System.out.println(followingNumber);
		System.out.println("ㅇㅇㅇㅇㅇㅇㅇ");
		
		List<FollowVO> users = followDAO.userFollowing(followingNumber); //DAO
	
		Gson gson = new GsonBuilder().serializeNulls().create();
		
		JsonArray userList = new JsonArray();
		JsonObject test = new JsonObject();
		
		test.add("followingList", userList);
		
		
//		users.stream()
//		.map(gson::toJson)
//		.map(JsonParser::parseString)
//		.forEach(userList::add);
		
		System.out.println(users);
		System.out.println(userList);
		
		
		
		for(FollowVO user : users) {
			String jsonString = gson.toJson(user);
			userList.add(JsonParser.parseString(jsonString));
		}
		
			resp.setContentType("application/json; charSet=utf-8");
		
			PrintWriter out = resp.getWriter();
		    out.print(userList.toString());
		    System.out.println(userList.toString());
		    out.close();
		
	}

}
