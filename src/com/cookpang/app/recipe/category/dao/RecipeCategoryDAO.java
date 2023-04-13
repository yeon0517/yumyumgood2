package com.cookpang.app.recipe.category.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.recipe.category.vo.RecipeCategoryVO;
import com.mybatis.config.MyBatisConfig;

public class RecipeCategoryDAO {

	public SqlSession sqlSession;
	
	public RecipeCategoryDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insertC(int postNumber ) {
		sqlSession.insert("recipeCategory.insertC", postNumber);
	}
	
	public List<RecipeCategoryVO> getRecipeCategories(int postNumber ) {
		return sqlSession.selectList("recipeCategory.getRecipeCategories", postNumber);
	}
}










