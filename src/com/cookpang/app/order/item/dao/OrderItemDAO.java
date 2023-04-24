package com.cookpang.app.order.item.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.order.dto.OrderDTO;
import com.cookpang.app.order.item.dto.OrderItemDTO;
import com.cookpang.app.order.item.vo.OrderItemVO;
import com.mybatis.config.MyBatisConfig;

public class OrderItemDAO {

	public SqlSession sqlSession;
	
	public OrderItemDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	public void item(OrderItemDTO orderItemDTO) {
		sqlSession.insert("orderItem.item", orderItemDTO);
	}
	public int getSequnce() {
		return sqlSession.selectOne("orderItem.getSequnce");
	}
	
    public void orderTotalCost(OrderDTO orderDTO) {
		sqlSession.insert("orderItem.orderTotalCost", orderDTO);
	}
    public List<OrderItemVO> getOrderItems(int orderNumber) {
    	return sqlSession.selectList("orderItem.getOrderItems", orderNumber);
    }
    
	
	

}
