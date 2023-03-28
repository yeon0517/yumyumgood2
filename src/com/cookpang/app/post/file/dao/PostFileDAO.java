package com.cookpang.app.post.file.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class PostFileDAO {

	public SqlSession sqlSession;
	
	public PostFileDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
