package com.cookpang.app.ingredient.image.dao;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.ingredient.image.dto.IngredientImageDTO;
import com.mybatis.config.MyBatisConfig;

public class IngredientImageDAO {

	public SqlSession sqlSession;
	
	public IngredientImageDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insert(IngredientImageDTO ingredientImageDTO) {
		sqlSession.insert("ingredientImage.insert",ingredientImageDTO);
	}
	
	
}
