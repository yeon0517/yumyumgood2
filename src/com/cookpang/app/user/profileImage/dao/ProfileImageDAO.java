package com.cookpang.app.user.profileImage.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class ProfileImageDAO {

	public SqlSession sqlSession;
	
	public ProfileImageDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
