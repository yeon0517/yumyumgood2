package com.cookpang.app.user.profileImage.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.user.profileImage.dto.ProfileImageDTO;
import com.mybatis.config.MyBatisConfig;

public class ProfileImageDAO {

	public SqlSession sqlSession;
	
	public ProfileImageDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}	
	
	public void insertImg(ProfileImageDTO profileImageDTO) {
		sqlSession.insert("profileImage.insertImg", profileImageDTO);
	}
	
	public ProfileImageDTO selectImage(int userNumber) {
		return sqlSession.selectOne("profileImage.selectImage", userNumber);
	}
	public List<ProfileImageDTO>select(int userNumber) {
		return sqlSession.selectList("profileImage.select", userNumber);
		
	}
	
	public void updateImg(ProfileImageDTO profileImageDTO) {
		sqlSession.update("profileImage.updateImg",profileImageDTO);
	}
	
	public void delete(int userNumber) {
		sqlSession.delete("profileImage.delete",userNumber);
	}
	public int getSequence() {
		return sqlSession.selectOne("profileImage.getSequence");
		
	}

	
}
