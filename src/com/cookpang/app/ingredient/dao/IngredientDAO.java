package com.cookpang.app.ingredient.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.ingredient.dto.IngredientDTO;
import com.mybatis.config.MyBatisConfig;

public class IngredientDAO {

	public SqlSession sqlSession;
	
	public IngredientDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	

	
	public List<IngredientDTO> getIngredientNumber() {
		return sqlSession.selectList("ingredient.getIngredientNumber");
	}
}
