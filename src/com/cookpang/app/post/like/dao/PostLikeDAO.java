package com.cookpang.app.post.like.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class PostLikeDAO {

	public SqlSession sqlSession;
	
	public PostLikeDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
