package com.cookpang.app.main.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.post.vo.PostVO;
import com.mybatis.config.MyBatisConfig;

public class MainDAO {
	
public SqlSession sqlSession;
	
	public MainDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<PostVO> postAll(){
		return sqlSession.selectList("post.postAll");
	}
	
}
