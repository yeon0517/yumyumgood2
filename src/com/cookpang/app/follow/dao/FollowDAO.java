package com.cookpang.app.follow.dao;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.follow.dto.FollowDTO;
import com.cookpang.app.post.like.dto.PostLikeDTO;
import com.mybatis.config.MyBatisConfig;

public class FollowDAO {

	public SqlSession sqlSession;
	
	public FollowDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	public void delete(int userNumber) {
		sqlSession.delete("follow.delete",userNumber);
	}
	public Integer checkFollow(FollowDTO followDTO) {
		return sqlSession.selectOne("follow.checkFollow",followDTO);
	}
	public void insertFollow(FollowDTO followDTO) {
		sqlSession.insert("follow.insertFollow",followDTO);
	}
	public void deleteFollow(FollowDTO followDTO) {
		sqlSession.delete("follow.deleteFollow", followDTO);
	}
	public int getFollowCount(int followNumber) {
		return sqlSession.selectOne("follow.getFollowCount", followNumber);
	}
	public int getFollowingCount(int followingNumber) {
		return sqlSession.selectOne("follow.getFollowingCount", followingNumber);
	}
}
