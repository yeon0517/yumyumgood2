package com.cookpang.app.user.mypage.dao;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.user.vo.UserVO;
import com.mybatis.config.MyBatisConfig;

public class MypageDAO {
	 public SqlSession sqlSession;
	   
	   public MypageDAO() {
	      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	   }
	   
	   public UserVO getProfileInfo(int userNumber) {
			return sqlSession.selectOne("user.getProfileInfo", userNumber);	
		}
}
