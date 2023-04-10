package com.cookpang.app.ingredient.dao;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.ingredient.dto.IngredientDTO;
import com.mybatis.config.MyBatisConfig;

public class IngredientDAO {

	public SqlSession sqlSession;
	
	public IngredientDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	

	
	public IngredientDTO getIngredientNumber(IngredientDTO ingredientDTO) {
		return sqlSession.selectOne("ingredient.getIngredientNumber", ingredientDTO);
	}
}
