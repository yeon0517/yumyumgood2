package com.cookpang.app.manager;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.comment.dao.CommentDAO;
import com.cookpang.app.follow.dao.FollowDAO;
import com.cookpang.app.manager.dao.ManagerDAO;
import com.cookpang.app.order.dao.OrderDAO;
import com.cookpang.app.post.dao.PostDAO;
import com.cookpang.app.post.file.dao.PostFileDAO;
import com.cookpang.app.post.like.dao.PostLikeDAO;
import com.cookpang.app.post.save.dao.PostSaveDAO;
import com.cookpang.app.recipe.category.dao.RecipeCategoryDAO;
import com.cookpang.app.recipe.ingredient.dao.RecipeIngredientDAO;
import com.cookpang.app.user.dao.UserDAO;
import com.cookpang.app.user.profileImage.dao.ProfileImageDAO;

public class ManagerUserDeleteOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ManagerDAO managerDAO = new ManagerDAO();
		FollowDAO followDAO = new FollowDAO();
		CommentDAO commentDAO = new CommentDAO();	
		PostSaveDAO postSaveDAO = new PostSaveDAO();
		PostLikeDAO postLikeDAO = new PostLikeDAO();
		OrderDAO orderDAO = new OrderDAO();
		ProfileImageDAO profileImageDAO = new ProfileImageDAO();
		PostFileDAO postFileDAO = new PostFileDAO();
		PostDAO postDAO = new PostDAO();
		UserDAO userDAO = new UserDAO();
		RecipeCategoryDAO recipeCategoryDAO = new RecipeCategoryDAO();
		RecipeIngredientDAO recipeIngredientDAO = new RecipeIngredientDAO();
		req.setCharacterEncoding("utf-8");
		
		String[]	userAr = req.getParameterValues("user");
		
		for (String userNumber : userAr) {
			
		List<Integer> postNumbers = postDAO.getPostNumberByUserNumber(Integer.valueOf(userNumber));
			
			followDAO.delete(Integer.valueOf(userNumber));
			commentDAO.delete(Integer.valueOf(userNumber));
			postSaveDAO.delete(Integer.valueOf(userNumber));
			postLikeDAO.delete(Integer.valueOf(userNumber));
			orderDAO.delete(Integer.valueOf(userNumber));
			profileImageDAO.delete(Integer.valueOf(userNumber));
			
			for (Integer postNumber : postNumbers) {
				postFileDAO.delete(postNumber);
				recipeCategoryDAO.delete(postNumber);
				recipeIngredientDAO.delete(postNumber);
			}
			
			postDAO.deleteUser(Integer.valueOf(userNumber));
			managerDAO.deleteUser(Integer.valueOf(userNumber) );
		}
		
		resp.sendRedirect("/manager/managerListOk.manager");
		
	}

}
