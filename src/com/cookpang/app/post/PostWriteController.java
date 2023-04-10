package com.cookpang.app.post;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
import com.cookpang.app.ingredient.dao.IngredientDAO;
import com.cookpang.app.ingredient.dto.IngredientDTO;
import com.cookpang.app.user.dao.UserDAO;

public class PostWriteController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDAO userDAO = new UserDAO();
		IngredientDAO ingredientDAO = new IngredientDAO();
		HttpSession session = req.getSession();
		IngredientDTO ingredientNumber = (IngredientDTO)session.getAttribute("ingredientNumber");
		IngredientDTO ingredientName = (IngredientDTO)session.getAttribute("ingredientName");
		Integer userNumber = (Integer)session.getAttribute("userNumber");
		String path = null;
		
		if(userNumber == null) {
			path = "/app/user/login.jsp";
		}else {
			path = "/app/post/postWrite.jsp";
			req.setAttribute("userId", userDAO.getUserId(userNumber));
			req.setAttribute("ingredientList", ingredientDAO.getIngredientNumber());
			
		}
		
		req.getRequestDispatcher(path).forward(req, resp);
		
	}
	
}
