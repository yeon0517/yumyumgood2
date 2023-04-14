package com.cookpang.app.ingredient.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;


import com.cookpang.app.ingredient.dto.IngredientDTO;

import com.cookpang.app.recipe.ingredient.dto.RecipeIngredientDTO;

import com.mybatis.config.MyBatisConfig;

public class IngredientDAO {

	public SqlSession sqlSession;
	
	public IngredientDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	
	public List<IngredientDTO> getIngredientNumber() {
		return sqlSession.selectList("ingredient.getIngredientNumber");
	}
	
	public int totalPrice(RecipeIngredientDTO recipeIngredientDTO){
		return sqlSession.selectOne("ingredient.totalPrice" , recipeIngredientDTO);
		
	}
}
