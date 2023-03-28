package com.cookpang.app.recipe.ingredient.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class RecipeIngredientDAO {

	public SqlSession sqlSession;
	
	public RecipeIngredientDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
