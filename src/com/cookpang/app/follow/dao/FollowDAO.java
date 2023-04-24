package com.cookpang.app.follow.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.follow.dto.FollowDTO;
import com.cookpang.app.follow.vo.FollowVO;
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
	public Integer checkFollowing(FollowDTO followDTO) {
		return sqlSession.selectOne("follow.checkFollowing",followDTO);
	}
	public void insertFollowing(FollowDTO followDTO) {
		sqlSession.insert("follow.insertFollow",followDTO);
	}
	public void deleteFollowing(FollowDTO followDTO) {
		sqlSession.delete("follow.deleteFollowing", followDTO);
	}
	public List<FollowVO> userFollower(int followingNumber) {
		return sqlSession.selectList("follow.userFollower", followingNumber);
	}
	
}
