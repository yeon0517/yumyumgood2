package com.cookpang.app.post;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.ingredient.category.dao.IngredientCategoryDAO;
import com.cookpang.app.ingredient.category.dto.IngredientCategoryDTO;
import com.cookpang.app.ingredient.dto.IngredientDTO;
import com.cookpang.app.post.dao.PostDAO;
import com.cookpang.app.post.dto.PostDTO;
import com.cookpang.app.post.file.dao.PostFileDAO;
import com.cookpang.app.post.file.dto.PostFileDTO;
import com.cookpang.app.recipe.category.dao.RecipeCategoryDAO;
import com.cookpang.app.recipe.category.dto.RecipeCategoryDTO;
import com.cookpang.app.recipe.ingredient.dao.RecipeIngredientDAO;
import com.cookpang.app.recipe.ingredient.dto.RecipeIngredientDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class PostWriteOkController implements Execute {

	@Override
	   public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	      PostDAO postDAO = new PostDAO();
	      PostDTO postDTO = new PostDTO();
	      PostFileDAO postFileDAO = new PostFileDAO();
	      PostFileDTO postFileDTO = new PostFileDTO();
//	      RecipeCategoryDTO recipeCategoryDTO = new RecipeCategoryDTO();
	      RecipeCategoryDAO recipeCategoryDAO = new RecipeCategoryDAO();
	      IngredientDTO ingredientDTO = new IngredientDTO();
//	      RecipeIngredientDTO recipeIngredientDTO = new RecipeIngredientDTO();
	      RecipeIngredientDAO recipeIngredientDAO = new RecipeIngredientDAO();
	      IngredientCategoryDAO ingredientCategoryDAO = new IngredientCategoryDAO();
	      
	      
	      
	      int postNumber = 0;
	     
//	      ServletRequest multipartRequest;
//		String[] ingredientName = multipartRequest.getParameterValues("ingredientName");
//	      for (String IngredientName : ingredientName) {
//	          RecipeIngredientDTO recipeIngredientDTO = new RecipeIngredientDTO();
//	          recipeIngredientDTO.setRecipeIngredientName(IngredientName);
//	      }

	      
	      String uploadPath = req.getSession().getServletContext().getRealPath("/") + "upload/";
	      int fileSize = 1024 * 1024 * 5; //5MB
	      System.out.println(uploadPath);
	      
	      MultipartRequest Request = new MultipartRequest(req, uploadPath, fileSize, "utf-8", new DefaultFileRenamePolicy());
	      
	      String[] ingredientNumbers = Request.getParameterValues("ingredientNumber");
	      String[] ingredientQuantities = Request.getParameterValues("ingredientQuantity");

	      System.out.println(Arrays.toString(ingredientNumbers));
	      System.out.println(Arrays.toString(ingredientQuantities));

	      
	      
	      
	      postDTO.setPostTitle(Request.getParameter("postTitle"));
	      postDTO.setPostContent(Request.getParameter("postContent"));
//	      postDTO.setPostNumber(postNumber);
	      postDTO.setPostRecipeContent(Request.getParameter("postRecipeContent"));
//	      postDTO.setPostDate(multipartRequest.getParameter("postDate"));
	      postDTO.setUserNumber((Integer)req.getSession().getAttribute("userNumber"));
//	      postDTO.setPostViewCount((Integer)req.getSession().getAttribute("postViewCount"));

	    
			/*
			 * recipeIngredientDTO.setRecipeIngredientTitle(multipartRequest.
			 * getParameterValues("ingredientTitle"));
			 * recipeIngredientDTO.setRecipeIngredientName(multipartRequest.
			 * getParameterValues("ingredientName"));
			 * recipeIngredientDTO.setRecipeIngredientQuantity(multipartRequest.
			 * getParameterValues("ingredientQuantity"));
			 */
	      
	      
	      postDAO.insert(postDTO);
	      postNumber = postDAO.getSequence();
	      
	      
	      for (int i = 0; i < ingredientNumbers.length; i++) {
	          String ingredientNumber = ingredientNumbers[i];
	          String ingredientQuantity = ingredientQuantities[i];

	          RecipeIngredientDTO recipeIngredientDTO = new RecipeIngredientDTO();
//	          recipeIngredientDTO.setRecipeIngredientName(ingredientName);
	          recipeIngredientDTO.setIngredientNumber(Integer.parseInt(ingredientNumber));
	          recipeIngredientDTO.setRecipeIngredientQuantity(ingredientQuantity);
	          recipeIngredientDTO.setPostNumber(postNumber);
	          recipeIngredientDAO.insert(recipeIngredientDTO);
	      }
	      
	      
	      String[] recipeCategories = Request.getParameterValues("categorys");
	      System.out.println(Arrays.toString(recipeCategories));
	      
	      for(int i=0; i<recipeCategories.length; i++) {
	    	  String recipeCategory = recipeCategories[i];
	    	  RecipeCategoryDTO recipeCategoryDTO = new RecipeCategoryDTO();
	    	  recipeCategoryDTO.setCategoryNumber(Integer.parseInt(recipeCategory));
	    	  recipeCategoryDTO.setPostNumber(postNumber);
	    	  recipeCategoryDAO.insertC(recipeCategoryDTO);
	      }
	      
//	      
	      String[] ingredientCategoryNumbers = Request.getParameterValues("ingredientCategoryNumber");
	      String[] ingredientCategoryNames = Request.getParameterValues("ingredientCategoryName");
	      
//	      for(int i=0; i<ingredientCategoryNumbers.length; i++) {
//	    	  String ingredientCategoryNumber = ingredientCategoryNumbers[i];
//	    	  IngredientCategoryDTO ingredientCategoryDTO = new IngredientCategoryDTO();
//	    	  ingredientCategoryDTO.setIngredientCategoryNumber(Integer.parseInt(ingredientCategoryNumber));
//	    	
//	    	  ingredientCategoryDAO.getIngredientCategoryNumber();
//	      }
	      
	      
	      Enumeration<String> fileNames = Request.getFileNames();	      
//	      이터레이터의 hasNex()
	      while(fileNames.hasMoreElements()) {
//        	이터레이터의 next()
	    	  String name = fileNames.nextElement();
	    	  
	    	  String fileSystemName = Request.getFilesystemName(name);
	    	  String fileOriginalName = Request.getOriginalFileName(name);
	    	  
	    	  if(fileSystemName == null) {continue;}
	    	  
	    	  postFileDTO.setPostFileSystemName(fileSystemName);
	    	  postFileDTO.setPostFileOriginalName(fileOriginalName);
	    	  postFileDTO.setPostNumber(postNumber);
	    	  postFileDTO.setPostFileIndex(1);
	    	  
	    	  
	    	  System.out.println(postFileDTO);
	    	  postFileDAO.insert(postFileDTO);
	      }
	      
	      
	      resp.sendRedirect("/post/postListOk.po");
	      
	      
	      
	      
	    
	  
	      
	      
	      
	      
	      

	      
	      
	      
	      
	      
	      
	      

	   }
}
