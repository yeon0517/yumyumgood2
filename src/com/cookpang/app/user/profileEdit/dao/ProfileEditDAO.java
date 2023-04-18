package com.cookpang.app.user.profileEdit.dao;


import java.util.List;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.user.dto.UserDTO;
import com.cookpang.app.user.profileEdit.vo.ProfileEditVO;
import com.mybatis.config.MyBatisConfig;

public class ProfileEditDAO {
	 public SqlSession sqlSession;
	   
	   public ProfileEditDAO() {
	      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	   }
	   public void updateUserProfileInfo(UserDTO userDTO) {
		   sqlSession.update("user.updateUserProfileInfo",userDTO);
	   }
	 public ProfileEditVO select(int userNumber) {
		 return sqlSession.selectOne("user.select", userNumber);
	 }
	 
	 public void editPassword(UserDTO userDTO) {
		 sqlSession.update("user.editPassword", userDTO);
	 }
	 
	 public int passwordOk(UserDTO userDTO) {
		 return sqlSession.selectOne("user.passwordOk", userDTO);
	 }
	 
	 
	 

}
