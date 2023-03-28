package com.cookpang.app.post.save.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class PostSaveDAO {

	public SqlSession sqlSession;
	
	public PostSaveDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
