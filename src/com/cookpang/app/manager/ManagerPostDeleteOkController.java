package com.cookpang.app.manager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.comment.dao.CommentDAO;
import com.cookpang.app.manager.dao.ManagerDAO;
import com.cookpang.app.post.dao.PostDAO;
import com.cookpang.app.post.file.dao.PostFileDAO;
import com.cookpang.app.post.like.dao.PostLikeDAO;
import com.cookpang.app.post.save.dao.PostSaveDAO;
import com.cookpang.app.recipe.category.dao.RecipeCategoryDAO;
import com.cookpang.app.recipe.ingredient.dao.RecipeIngredientDAO;

public class ManagerPostDeleteOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ManagerDAO managerDAO = new ManagerDAO();
		CommentDAO commentDAO = new CommentDAO();	
		PostSaveDAO postSaveDAO = new PostSaveDAO();
		PostLikeDAO postLikeDAO = new PostLikeDAO();
		PostFileDAO postFileDAO = new PostFileDAO();
		PostDAO postDAO = new PostDAO();
		RecipeCategoryDAO recipeCategoryDAO = new RecipeCategoryDAO();
		RecipeIngredientDAO recipeIngredientDAO = new RecipeIngredientDAO();
		
		req.setCharacterEncoding("utf-8");
		
		String[]	postAr = req.getParameterValues("post");
		
		for (String postNumber : postAr) {
			postSaveDAO.deleteByPostNumber(Integer.valueOf(postNumber));
			postLikeDAO.deleteByPostNumber(Integer.valueOf(postNumber));
			commentDAO.deleteByPostNumber(Integer.valueOf(postNumber));
			recipeIngredientDAO.delete(Integer.valueOf(postNumber));
			recipeCategoryDAO.delete(Integer.valueOf(postNumber));
			postFileDAO.delete(Integer.valueOf(postNumber));
			postDAO.delete(Integer.valueOf(postNumber));
			
		}
		
		resp.sendRedirect("/manager/managerListOk.manager");
		
	}

}
