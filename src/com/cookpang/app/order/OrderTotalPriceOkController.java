package com.cookpang.app.order;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.ingredient.dao.IngredientDAO;
import com.cookpang.app.recipe.ingredient.dto.RecipeIngredientDTO;

public class OrderTotalPriceOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("ajax연결 완료");

		int totalPrice = 0;
		
//		int postNumber = Integer.valueOf(req.getParameter("postNumber"));
		int postNumber = 2;
//		String[] checkedIngredient = req.getParameterValues(checkboxValues);
		
		IngredientDAO ingredientDAO = new IngredientDAO();
		RecipeIngredientDTO recipeIngredientDTO = new RecipeIngredientDTO();
		
		recipeIngredientDTO.setIngredientNumber(2);
		recipeIngredientDTO.setPostNumber(postNumber);
		
//		ingredientDAO.totalPrice(recipeIngredientDTO);
		
		
//		for (String ingreNumber : checkedIngredient) {
//
//			recipeIngredientDTO.setPostNumber(postNumber);
//			recipeIngredientDTO.setIngredientNumber(Integer.valueOf(ingreNumber));
//			
//			totalPrice += ingredientDAO.totalPrice(recipeIngredientDTO);
//		}
		
		System.out.println(ingredientDAO.totalPrice(recipeIngredientDTO));
		
//		utf-8설정
//		resp.setContentType();
		
		PrintWriter out = resp.getWriter();
	    out.print(totalPrice);
	    out.close();
	
		
	}

}



















