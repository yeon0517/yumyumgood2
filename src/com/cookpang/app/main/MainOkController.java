package com.cookpang.app.main;

import java.io.IOException;
import java.util.List;

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
		List<PostVO> postList = mainDAO.postAll();
		
		req.setAttribute("postList", postList);
		
		req.getRequestDispatcher("/app/main.jsp").forward(req, resp);
	}
}
