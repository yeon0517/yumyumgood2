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

public class MainOkController implements Execute{
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MainDAO mainDAO = new MainDAO();
		// 게시물 
		List<PostVO> postList = mainDAO.postAll(null);
		
		req.setAttribute("postList", postList);
		// 게시물
		
		//페이징처리
		int total = mainDAO.getTotal();
		

		String temp = req.getParameter("page");
		
		int page = temp == null ? 1 : Integer.valueOf(temp) ;
		
		int rowCount = 12;
		int pageCount = 5;
		
		int startRow = (page-1)*rowCount;
		
//		Math.ceil() 올림처리
		int endPage = (int)(Math.ceil(page/(double)pageCount)*pageCount);
		
		int startPage = endPage - (pageCount-1);
		
		int realEndPage = (int)Math.ceil(total/(double)rowCount);
		
		endPage = endPage > realEndPage ? realEndPage : endPage ;
		
		boolean prev = startPage > 1;
		boolean next = endPage != realEndPage;
		
		
		
		Map<String, Integer> pageMap  = new HashMap<>();
		pageMap.put("startRow", startRow);
		pageMap.put("rowCount", rowCount);
		
		List<PostVO> paging = mainDAO.postAll(pageMap);
		
		req.setAttribute("postList", paging);
		req.setAttribute("page", page);
		req.setAttribute("startPage", startPage);
		req.setAttribute("endPage", endPage);
		req.setAttribute("prev", prev);
		req.setAttribute("next", next);
		
		
		
		
		req.getRequestDispatcher("/app/main.jsp").forward(req, resp);
	}
}
