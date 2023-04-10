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
import com.cookpang.app.post.vo.PostVO;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class PostSerchOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ManagerDAO managerDAO = new ManagerDAO();
		
		
		Map<String, Object> postPageMap = new HashMap<>();
		String postTitle = req.getParameter("postTitle");
		postPageMap.put("postTitle", postTitle);
		
		int postTotal = managerDAO.getPostSerchTotal(postPageMap);

		String postTemp = req.getParameter("postPage");

		int postPage = postTemp == null ? 1 : Integer.valueOf(postTemp);

		int rowCount = 10;
		int pageCount = 5;

		int postStartRow = (postPage - 1) * rowCount;       

		int postEndPage = (int) (Math.ceil(postPage / (double) pageCount) * pageCount);

		int postStartPage = postEndPage - (pageCount - 1);

		int postRealEndPage = (int) Math.ceil(postTotal / (double) rowCount);

		postEndPage = postEndPage > postRealEndPage ? postRealEndPage : postEndPage;

		boolean postPrev = postStartPage > 1; // 이전버튼
		boolean postNext = postEndPage != postRealEndPage; // 다음버튼

		
		
		postPageMap.put("postStartRow", postStartRow);
		postPageMap.put("rowCount", rowCount);
		
		
		
		List<PostVO> postSerchList = managerDAO.postSerch(postPageMap);
		
		
		Gson gson = new Gson();
		JsonObject postResult = new JsonObject();
		JsonArray postsJsonArray = gson.toJsonTree(postSerchList).getAsJsonArray();
		postResult.add("posts", postsJsonArray);
		
		postResult.addProperty("postPage", postPage);
		postResult.addProperty("postStartPage", postStartPage);
		postResult.addProperty("postEndPage", postEndPage);
		postResult.addProperty("postPrev", postPrev);
		postResult.addProperty("postNext", postNext);
		
		resp.setContentType("application/json");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		
		out.print(postResult.toString());
		out.close();
		
	}
}
