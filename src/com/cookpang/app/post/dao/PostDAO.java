package com.cookpang.app.post.dao;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.post.dto.PostDTO;
import com.mybatis.config.MyBatisConfig;

public class PostDAO {

	public SqlSession sqlSession;
	
	public PostDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public int getTotal() {
		return sqlSession.selectOne("post.getTotal");
	}
	
	public void insert(PostDTO postDTO) {
		sqlSession.insert("post.insert", postDTO);
	}
	
	public int getSequence() {
		return sqlSession.selectOne("post.getSequence");
		
	}
//	
//	public PostVO select(int boardNumber) {
//		return sqlSession.selectOne("board.select", boardNumber);
//	}
	
	public void delete(int postNumber) {
		sqlSession.delete("post.delete", postNumber);
	}

	public void updatePostViewCount(int postNumber) {
		sqlSession.update("post.updatePostViewCount", postNumber);
	}
	
	public void update(PostDTO postDTO) {
		sqlSession.update("post.update", postDTO);
	}
	
//	public void select(int postNumber) {
//		return sqlSession.selectOne("post.select", postNumber);
//	}
}
