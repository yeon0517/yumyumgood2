package com.cookpang.app.user.dao;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.user.dto.UserDTO;
import com.mybatis.config.MyBatisConfig;

public class UserDAO {

	public SqlSession sqlSession;
	
	public UserDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void join(UserDTO userDTO) {
		sqlSession.insert("user.join", userDTO);
	}

	public int login(UserDTO userDTO) {
		return sqlSession.selectOne("user.login", userDTO);	
	}
}
