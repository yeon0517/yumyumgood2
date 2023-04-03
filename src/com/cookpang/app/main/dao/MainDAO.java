package com.cookpang.app.main.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.post.vo.PostVO;
import com.mybatis.config.MyBatisConfig;

public class MainDAO {
	
public SqlSession sqlSession;
	
	public MainDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<PostVO> postAll(Map<String, Integer> pageMap){
		return sqlSession.selectList("post.postAll", pageMap);

	}
	
	public int getTotal() {
		return sqlSession.selectOne("post.getTotal");
	}
	
}
