package com.cookpang.app.category.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class CategoryDAO {

	public SqlSession sqlSession;
	
	public CategoryDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
