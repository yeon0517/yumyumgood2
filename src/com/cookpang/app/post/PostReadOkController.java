package com.cookpang.app.post;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
import com.cookpang.app.comment.dao.CommentDAO;
import com.cookpang.app.comment.vo.CommentVO;
import com.cookpang.app.post.dao.PostDAO;
import com.cookpang.app.post.file.dao.PostFileDAO;
import com.cookpang.app.post.file.dto.PostFileDTO;
import com.cookpang.app.post.like.dao.PostLikeDAO;
import com.cookpang.app.post.like.dto.PostLikeDTO;
import com.cookpang.app.post.read.vo.PostReadVO;
import com.cookpang.app.post.save.dao.PostSaveDAO;
import com.cookpang.app.post.save.dto.PostSaveDTO;
import com.cookpang.app.recipe.category.dao.RecipeCategoryDAO;
import com.cookpang.app.recipe.category.vo.RecipeCategoryVO;
import com.cookpang.app.recipe.ingredient.dao.RecipeIngredientDAO;
import com.cookpang.app.recipe.ingredient.vo.RecipeIngredientVO;

public class PostReadOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		boolean likeStatus = false;
		boolean saveStatus = false;
		int postNumber = Integer.valueOf(req.getParameter("postNumber"));
		int userNumber = (int)session.getAttribute("userNumber");
		
		
//		임시 게시물 번호 나중에 연결되면 바로 밑은 삭제, 위의 주석은 해제
//		int postNumber = 8;
		
		PostDAO postDAO = new PostDAO();
		RecipeCategoryDAO recipeCategoryDAO = new RecipeCategoryDAO();
		CommentDAO commentDAO = new CommentDAO();
		
		postDAO.updatePostViewCount(postNumber);
		
		PostReadVO postReadVO = postDAO.postReadDefaultInfo(postNumber);
		List<RecipeCategoryVO> categoryList = recipeCategoryDAO.getRecipeCategories(postNumber);
		List<CommentVO> commentList = commentDAO.getCommentList(postNumber);
		PostLikeDAO postLikeDAO = new PostLikeDAO();
		PostLikeDTO postLikeDTO = new PostLikeDTO();
		PostSaveDAO postSaveDAO = new PostSaveDAO();
		PostSaveDTO postSaveDTO = new PostSaveDTO();
		RecipeIngredientDAO recipeIngredientDAO = new RecipeIngredientDAO();
		PostFileDAO postFileDAO = new PostFileDAO(); 
		
		List<PostFileDTO> postFileList = postFileDAO.select(postNumber);
		System.out.println(postFileList);
		
		List<RecipeIngredientVO> ingredients = recipeIngredientDAO.getRecipeIngredients(postNumber);
		
		
		
		postLikeDTO.setPostNumber(postNumber);
		postLikeDTO.setUserNumber(userNumber);
		postSaveDTO.setPostNumber(postNumber);
		postSaveDTO.setUserNumber(userNumber);
		
		likeStatus = postLikeDAO.checkLike(postLikeDTO) ==null ? false : true;
		saveStatus = postSaveDAO.checkSave(postSaveDTO) ==null ? false : true;
		
//		postReadVO.setFiles(files);
		
		
		req.setAttribute("post", postReadVO);
		req.setAttribute("categoryList", categoryList);
		req.setAttribute("likeStatus", likeStatus);
		req.setAttribute("saveStatus", saveStatus);
		req.setAttribute("ingredients", ingredients);
		req.setAttribute("postFileList", postFileList);
//		req.setAttribute("commentList", commentList);
		
		req.getRequestDispatcher("/app/post/postRead.jsp").forward(req, resp);
		
		
	}
	
	
	
	
}
