package com.cookpang.app.post.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.post.dto.PostDTO;
import com.cookpang.app.post.read.vo.PostReadVO;
import com.mybatis.config.MyBatisConfig;

public class PostDAO {

	public SqlSession sqlSession;
	
	public PostDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List <PostReadVO> selectAll(Map<String, Integer>pageMap) {
		return sqlSession.selectList("post.postAll", pageMap);
		
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
	
	public PostReadVO select(int postNumber) {
		return sqlSession.selectOne("post.select", postNumber);
	}
	
	public void delete(int postNumber) {
		sqlSession.delete("post.delete", postNumber);
	}

	public void updatePostViewCount(int postNumber) {
		sqlSession.update("post.updatePostViewCount", postNumber);
	}
	
	
	public void update(PostDTO postDTO) {
		sqlSession.update("post.update", postDTO);
	}
	

}
