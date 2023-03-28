package com.cookpang.app.ingredient.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class IngredientDAO {

	public SqlSession sqlSession;
	
	public IngredientDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
