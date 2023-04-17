package com.cookpang.app.user.dao;



import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.user.dto.UserDTO;
import com.cookpang.app.user.profileEdit.vo.ProfileEditVO;
import com.cookpang.app.user.vo.UserVO;
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
	
	public String getUserId(int userNumber) {
		return sqlSession.selectOne("user.getUserId" , userNumber);
	}
	 
	 public boolean checkId(String userId) {
		 return (Integer)sqlSession.selectOne("user.checkId",userId) <1;
	 }
	 
	 public String findPassword(UserDTO userDTO) {
		 return sqlSession.selectOne("user.findPassword",userDTO) ;
	 }
	 
	 public ProfileEditVO selectMemberProfileInfo(int userNumber) {
		   return sqlSession.selectOne("user.selectMemberProfileInfo",userNumber);
	   }
	 
//	 public ProfileEditVO getProfileInfo(int userNumber) {
//		   return sqlSession.selectOne("user.getProfileInfo",userNumber);
//	   }
	 public void delete(int userNumber) {
			sqlSession.delete("user.delete",userNumber);
		}
	 public UserVO getProfileInfo(int userNumber) {
			return sqlSession.selectOne("user.getProfileInfo", userNumber);	
		}
		
}
