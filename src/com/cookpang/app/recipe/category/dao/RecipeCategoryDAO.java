package com.cookpang.app.recipe.category.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.recipe.category.dto.RecipeCategoryDTO;
import com.cookpang.app.recipe.category.vo.RecipeCategoryVO;
import com.mybatis.config.MyBatisConfig;

public class RecipeCategoryDAO {

	public SqlSession sqlSession;
	
	public RecipeCategoryDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insertC(RecipeCategoryDTO recipeCategoryDTO ) {
		sqlSession.insert("recipeCategory.insertC", recipeCategoryDTO);
	}
	
	public List<RecipeCategoryVO> getRecipeCategories(int postNumber ) {
		return sqlSession.selectList("recipeCategory.getRecipeCategories", postNumber);
	}
	public void delete(int postNumber ) {
		 sqlSession.selectList("recipeCategory.delete", postNumber);
	}
}










