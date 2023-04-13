package com.cookpang.app.post;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.ingredient.category.dao.IngredientCategoryDAO;
import com.cookpang.app.ingredient.dto.IngredientDTO;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class PostCategoryController implements Execute{
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IngredientCategoryDAO ingredientCategoryDAO = new IngredientCategoryDAO();
		int ingredientCategoryNumber = Integer.valueOf( req.getParameter("ingredientCategoryNumber"));
		
		System.out.println(ingredientCategoryNumber);
		List<IngredientDTO> cateList = ingredientCategoryDAO.getIngredientNumbers(ingredientCategoryNumber);
		Gson gson = new Gson();
		JsonArray jsonArr = new JsonArray();
		
		for(IngredientDTO cate : cateList) {
			String jsonString = gson.toJson(cate);
			
			jsonArr.add(JsonParser.parseString(jsonString));
		}
		
		resp.setContentType("application/json; charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		out.print(jsonArr.toString());
	}

}







