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

public class ManagerListRestController implements Execute{
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ManagerDAO managerDAO = new ManagerDAO();
		
		int total = managerDAO.getUserTotal();

		String temp = req.getParameter("page");

		int page = temp == null ? 1 : Integer.valueOf(temp);

//		한 페이지에 보여줄 회원 목록의 갯수 10개
		int rowCount = 10;
//				페이지 버튼 세트는? 5개씩
		int pageCount = 5;

//				0, 10 -> 1페이지
//				10, 10 -> 2페이지
//				20, 10 -> 3페이지
		int startRow = (page - 1) * rowCount;

//		Math.ceil() 올림처리
		int endPage = (int) (Math.ceil(page / (double) pageCount) * pageCount);
//		endPage는 페이지 세트 당 마지막 번호를 의미한다.

		int startPage = endPage - (pageCount - 1);
//		startPage는 페이지 세트 당 첫 번째 번호를 의미한다.

		int realEndPage = (int) Math.ceil(total / (double) rowCount);
//		realEndPage는 전체 페이 중 가장 마지막 번호를 의미한다.

		endPage = endPage > realEndPage ? realEndPage : endPage;
//		첫 번째 페이 세트가 1~5
//		두 번째 페이 세트가 6~10이어도
//		realEndPage가 7이라면 두번째 페이지 세트의 마지막 번호는 7이어야 한다.

		boolean prev = startPage > 1; // 이전버튼
		boolean next = endPage != realEndPage; // 다음버튼

		
		Map<String, Integer> pageMap = new HashMap<>();
		pageMap.put("startRow", startRow);
		pageMap.put("rowCount", rowCount);
		
		List<UserDTO> usersList = managerDAO.selectUserAll(pageMap);
		Gson gson = new Gson();
		JsonArray users = new JsonArray();
		
		
//		req.setAttribute("userList", users);
//		req.setAttribute("page", page);
//		req.setAttribute("startPage", startPage);
//		req.setAttribute("endPage", endPage);
//		req.setAttribute("prev", prev);
//		req.setAttribute("next", next);
		
		
		
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; utf-8");
		PrintWriter out = resp.getWriter();
		out.print("ㅎㅇ");
		out.close();
	}
}
