package com.cookpang.app.main;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.main.dao.MainDAO;
import com.cookpang.app.post.vo.PostVO;
import com.cookpang.app.user.profileEdit.vo.ProfileEditVO;

public class MainOkController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MainDAO mainDAO = new MainDAO();
		int total = 0;
		
		
		
		

		String temp = req.getParameter("page");

//		null인 경우는 게시판에 처음 이동하는 것이므로 1페이지를 띄워주면 된다.
		int page = temp == null ? 1 : Integer.valueOf(temp);

//		한 페이지에 몇 개의 게시물? 12개
		int rowCount = 12;
//		페이지 버튼 세트는? 5개씩
		int pageCount = 5;

		int startRow = (page - 1) * 12;

//		Math.ceil() 올림처리
		int endPage = (int) (Math.ceil(page / (double) pageCount) * pageCount);
//		endPage는 페이지 세트 당 마지막 번호를 의미한다.

		int startPage = endPage - (pageCount - 1);
//		staratPage는 페이지 세트 당 첫 번째 번호를 의미한다.

		List<PostVO> postList = null;

		Integer categoryNumber = null;
		try {
			categoryNumber = Integer.valueOf(req.getParameter("categoryNumber"));
		} catch (NumberFormatException e) {
			categoryNumber = 0;
		}

//		System.out.println(categoryNumber);
//		String postTitle;

		Map<String, Integer> pageMap = new HashMap<>();
		pageMap.put("startRow", startRow);
		pageMap.put("rowCount", rowCount);
		pageMap.put("categoryNumber", categoryNumber);
//		pageMap.put("postTitle", postTitle);

		if (categoryNumber == null || categoryNumber == 0) {
			postList = mainDAO.postAll(pageMap);
			total = mainDAO.getTotal();
		} else {
			postList = mainDAO.categoryList(pageMap);
			total = mainDAO.categoryTotal(categoryNumber);
		}

		int realEndPage = (int) Math.ceil(total / (double) rowCount);

		endPage = endPage > realEndPage ? realEndPage : endPage;

		boolean prev = startPage > 1;
		boolean next = endPage != realEndPage;
		
//		rank
		List<PostVO> rankTotal = mainDAO.rankTotal();
//		System.out.println(rankTotal);
		
		req.setAttribute("rankTotal", rankTotal);
//		rank
		
		
		req.setAttribute("postList", postList);
		req.setAttribute("categoryNumber", categoryNumber);
		req.setAttribute("page", page);
		req.setAttribute("startPage", startPage);
		req.setAttribute("endPage", endPage);
		req.setAttribute("prev", prev);
		req.setAttribute("next", next);

		req.getRequestDispatcher("/app/main.jsp").forward(req, resp);

	}
}
