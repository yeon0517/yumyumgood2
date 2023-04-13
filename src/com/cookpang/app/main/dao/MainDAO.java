package com.cookpang.app.main.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.post.vo.PostVO;
import com.cookpang.app.userList.vo.UserListVO;
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
	
	public List<PostVO> categoryList(Map<String, Integer> pageMap) {
		return sqlSession.selectList("category.categoryList", pageMap);
	}
	
	public int categoryTotal(int categoryNumber) {
		return sqlSession.selectOne("category.categoryTotal", categoryNumber);
	}
	
	public List<PostVO> rankTotal(){
		return sqlSession.selectList("postLike.rankTotal");
		
	}
	
	
	public List<UserListVO> findUser(String searchUser) {
		return sqlSession.selectList("user.findUser", searchUser);
	}
	
	public List<PostVO> postSelect(Map<String, Object> postTitle){
		return sqlSession.selectList("post.postSelect", postTitle);
	}
	
	public int searchTotal(String keyword) {
		return sqlSession.selectOne("post.searchTotal", keyword);
	}
	
}
