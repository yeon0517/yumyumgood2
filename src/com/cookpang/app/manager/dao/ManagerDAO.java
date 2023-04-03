package com.cookpang.app.manager.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.user.dto.UserDTO;
import com.mybatis.config.MyBatisConfig;

public class ManagerDAO {

	public SqlSession sqlSession;
	
	public ManagerDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<UserDTO> selectUserAll(Map<String, Integer> pageMap){
		
		return sqlSession.selectList("manager.selectUserAll", pageMap);
	}
	
	public int getUserTotal() {
		return sqlSession.selectOne("manager.getUserTotal");
	}
	
	public void deleteUser(int userNumber) {
		 sqlSession.delete("manager.deleteUser", userNumber);
	}
	
	public UserDTO managerLogin(UserDTO userDTO) {
		return sqlSession.selectOne("manager.managerLogin", userDTO);
	}
	
	
	
	
	
}
