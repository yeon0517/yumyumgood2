package com.cookpang.app.ingredient.image.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class IngredientImageDAO {

	public SqlSession sqlSession;
	
	public IngredientImageDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
