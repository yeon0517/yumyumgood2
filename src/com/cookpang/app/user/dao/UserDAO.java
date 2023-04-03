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



	 public String getUserId(int userNumber) {
		  return sqlSession.selectOne("user.getUserId", userNumber);
	}
	 
	 public int login(UserDTO UserDTO) {
	      return sqlSession.selectOne("User.login", UserDTO);
	}
	 
	 public boolean checkId(String userId) {
		 return (Integer)sqlSession.selectOne("user.checkId",userId) <1;
	 }
	 
	 
}
