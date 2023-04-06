package com.cookpang.app.recipe.category.dao;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.recipe.category.dto.RecipeCategoryDTO;
import com.mybatis.config.MyBatisConfig;

public class RecipeCategoryDAO {

	public SqlSession sqlSession;
	
	public RecipeCategoryDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insertC(RecipeCategoryDTO recipeCategoryDTO ) {
		sqlSession.insert("recipeCategory.insertC", recipeCategoryDTO);
	}
}
