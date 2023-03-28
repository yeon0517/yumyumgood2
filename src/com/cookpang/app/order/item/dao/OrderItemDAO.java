package com.cookpang.app.order.item.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class OrderItemDAO {

	public SqlSession sqlSession;
	
	public OrderItemDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
