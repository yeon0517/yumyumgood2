package com.cookpang.app.post.file.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.post.file.dto.PostFileDTO;
import com.mybatis.config.MyBatisConfig;


public class PostFileDAO {

	public SqlSession sqlSession;
	
	public PostFileDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insert(PostFileDTO postFileDTO) {
		sqlSession.insert("postFile.insert", postFileDTO);
	}
	
	public List<PostFileDTO> select(int postNumber) {
		return sqlSession.selectList("postFile.select", postNumber);
	}
	
	public void delete(int postNumber) {
		sqlSession.delete("postFile.delete", postNumber);
	}
}
