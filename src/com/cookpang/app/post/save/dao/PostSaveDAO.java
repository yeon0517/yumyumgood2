package com.cookpang.app.post.save.dao;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.post.save.dto.PostSaveDTO;
import com.mybatis.config.MyBatisConfig;

public class PostSaveDAO {

	public SqlSession sqlSession;
	
	public PostSaveDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	public void delete(int userNumber) {
		sqlSession.delete("postSave.delete",userNumber);
	}
	

	public Integer checkSave(PostSaveDTO postSaveDTO) {
		return sqlSession.selectOne("postSave.checkSave", postSaveDTO);
	}
	public void insertSave(PostSaveDTO postSaveDTO) {
		sqlSession.insert("postSave.insertSave", postSaveDTO);
	}
	public void deleteSave(PostSaveDTO postSaveDTO) {
		sqlSession.delete("postSave.deleteSave", postSaveDTO);
	}

}
