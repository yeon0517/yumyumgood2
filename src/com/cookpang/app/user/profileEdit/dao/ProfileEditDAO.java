package com.cookpang.app.user.profileEdit.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.user.profileEdit.vo.ProfileEditVO;

import com.mybatis.config.MyBatisConfig;

public class ProfileEditDAO {
	 public SqlSession sqlSession;
	   
	   public ProfileEditDAO() {
	      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	   }
	   public void updateUserProfileInfo(ProfileEditVO profileEditVO) {
		   sqlSession.update("user.updateUserProfileInfo",profileEditVO);
	   }
	   
	   
		   

}
