package com.cookpang.app.order.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.order.dto.OrderDTO;
import com.cookpang.app.order.vo.OrderVO;
import com.cookpang.app.payment.dto.PaymentDTO;
import com.cookpang.app.user.dto.UserDTO;
import com.cookpang.app.userList.vo.UserListVO;
import com.mybatis.config.MyBatisConfig;

public class OrderDAO {

	public SqlSession sqlSession;

	public OrderDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

	  public UserDTO orderInfo(int userNumber) { 
		  // OrderVO의 mapper에 있는 id이름이 defaultOrderInfo(뽑는 값이 userNumber 이고 이거의 타입은 int)
		  return sqlSession.selectOne("order.orderInfo", userNumber);
		  // 값이 있으니 return을 쓰고 mapper의 제일 위 이름이 order이고 그 안에 이름이 defaultOrderInfo이며 , 그것의 userNumber을 뽑는다는 말 
	 }

	public static OrderDAO getInstance() { // 객체 반환 메서드
		return getInstance();
	}

	public void OrderInsert(OrderDTO orderDTO) {
		sqlSession.insert("order.orderInsert", orderDTO);
	}

//		public void orderCost(OrderDTO orderDTO) {
//			sqlSession.insert("order.orderCost", orderDTO);
//		}

	public void delete(int userNumber) {
		sqlSession.delete("order.delete", userNumber);
	}

	public List<OrderVO> defaultOrderInfo(int orderNumber) {
		return sqlSession.selectList("order.defaultOrderInfo", orderNumber);
	}
	
	  public OrderDTO cost(int orderNumber) { 
		  return sqlSession.selectOne("order.cost", orderNumber);
	 }
	  
	  public void orderpay(PaymentDTO paymentDTO) {
		  sqlSession.insert("order.orderpay", paymentDTO);
	  }

	
	public int getSequnce() {
		return sqlSession.selectOne("order.getSequnce");
	}

	public void orderUpdate(OrderDTO orderDTO) {
	sqlSession.update("order.orderUpdate", orderDTO);
		
	}

}
