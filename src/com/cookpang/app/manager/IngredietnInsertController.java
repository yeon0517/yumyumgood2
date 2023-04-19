package com.cookpang.app.manager;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.ingredient.category.dao.IngredientCategoryDAO;
import com.cookpang.app.ingredient.category.dto.IngredientCategoryDTO;

public class IngredietnInsertController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		IngredientCategoryDTO ingredientCategoryDTO = new IngredientCategoryDTO(); 
		IngredientCategoryDAO ingredientCategoryDAO = new IngredientCategoryDAO();
		
		List<IngredientCategoryDTO> categoryList =  ingredientCategoryDAO.getIngredientCategoryNumber();
		
		System.out.println(categoryList.toString());
		
		
		req.setAttribute("categoryList", categoryList);
		
		
		req.getRequestDispatcher("/app/manager/ingredientInsert.jsp").forward(req, resp);
	}
}
