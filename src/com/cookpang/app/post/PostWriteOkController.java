package com.cookpang.app.post;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.ingredient.dto.IngredientDTO;
import com.cookpang.app.post.dao.PostDAO;
import com.cookpang.app.post.dto.PostDTO;
import com.cookpang.app.post.file.dao.PostFileDAO;
import com.cookpang.app.post.file.dto.PostFileDTO;
import com.cookpang.app.recipe.category.dto.RecipeCategoryDTO;
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
	      RecipeCategoryDTO recipeCategoryDTO = new RecipeCategoryDTO();
	      IngredientDTO ingredientDTO = new IngredientDTO();
	      RecipeIngredientDTO recipeIngredientDTO = new RecipeIngredientDTO();
	      int postNumber = 0;
	     
//	      ServletRequest multipartRequest;
//		String[] ingredientTitles = multipartRequest.getParameterValues("ingredientTitle");
//	      for (String ingredientTitle : ingredientTitles) {
//	          RecipeIngredientDTO recipeIngredientDTO = new RecipeIngredientDTO();
//	          recipeIngredientDTO.setRecipeIngredientTitle(ingredientTitle);
//	      
//	      }

	      
	      String uploadPath = req.getSession().getServletContext().getRealPath("/") + "upload/";
	      int fileSize = 1024 * 1024 * 5; //5MB
	      System.out.println(uploadPath);
	     
	      MultipartRequest multipartRequest = new MultipartRequest(req, uploadPath, fileSize, "utf-8", new DefaultFileRenamePolicy());
	      
	      
	      postDTO.setPostTitle(multipartRequest.getParameter("postTitle"));
	      postDTO.setPostContent(multipartRequest.getParameter("postContent"));
//	      postDTO.setPostNumber(postNumber);
	      postDTO.setPostRecipeContent(multipartRequest.getParameter("postRecipeContent"));
//	      postDTO.setPostDate(multipartRequest.getParameter("postDate"));
	      postDTO.setUserNumber((Integer)req.getSession().getAttribute("userNumber"));
//	      postDTO.setPostViewCount((Integer)req.getSession().getAttribute("postViewCount"));
	      recipeCategoryDTO.setCategoryName(multipartRequest.getParameterValues("categorys"));
	    
	      recipeIngredientDTO.setRecipeIngredientTitle(multipartRequest.getParameterValues("ingredientTitle"));
	      recipeIngredientDTO.setRecipeIngredientName(multipartRequest.getParameterValues("ingredientName"));
	      recipeIngredientDTO.setRecipeIngredientQuantity(multipartRequest.getParameterValues("ingredientQuantity"));
	      
	      
	      postDAO.insert(postDTO);
	      
	      
	      

	      
	      postNumber = postDAO.getSequence();
	      
	      Enumeration<String> fileNames = multipartRequest.getFileNames();	      
//	      이터레이터의 hasNex()
	      while(fileNames.hasMoreElements()) {
//        	이터레이터의 next()
	    	  String name = fileNames.nextElement();
     
     String fileSystemName = multipartRequest.getFilesystemName(name);
     String fileOriginalName = multipartRequest.getOriginalFileName(name);
     
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
