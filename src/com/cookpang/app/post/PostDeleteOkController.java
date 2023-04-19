 package com.cookpang.app.post;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.comment.dao.CommentDAO;
import com.cookpang.app.post.dao.PostDAO;
import com.cookpang.app.post.file.dao.PostFileDAO;
import com.cookpang.app.post.file.dto.PostFileDTO;
import com.cookpang.app.post.like.dao.PostLikeDAO;
import com.cookpang.app.post.save.dao.PostSaveDAO;
import com.cookpang.app.recipe.category.dao.RecipeCategoryDAO;
import com.cookpang.app.recipe.ingredient.dao.RecipeIngredientDAO;

public class PostDeleteOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		CommentDAO commentDAO = new CommentDAO();	
		PostSaveDAO postSaveDAO = new PostSaveDAO();
		PostLikeDAO postLikeDAO = new PostLikeDAO();
		PostFileDAO postFileDAO = new PostFileDAO();
		PostDAO postDAO = new PostDAO();
		RecipeCategoryDAO recipeCategoryDAO = new RecipeCategoryDAO();
		RecipeIngredientDAO recipeIngredientDAO = new RecipeIngredientDAO();
		
		req.setCharacterEncoding("utf-8");
		
		int postNumber = Integer.valueOf(req.getParameter("postNumber"));
		
			postSaveDAO.deleteByPostNumber(postNumber);
			postLikeDAO.deleteByPostNumber(postNumber);
			commentDAO.deleteByPostNumber(postNumber);
			recipeIngredientDAO.delete(postNumber);
			recipeCategoryDAO.delete(postNumber);
			postFileDAO.delete(postNumber);
			postDAO.delete(postNumber);
		
		resp.sendRedirect("/mainOk.m");
	}

	
}
