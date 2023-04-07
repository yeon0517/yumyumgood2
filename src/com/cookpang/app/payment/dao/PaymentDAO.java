package com.cookpang.app.payment.dao;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.payment.dto.PaymentDTO;
import com.mybatis.config.MyBatisConfig;

public class PaymentDAO {

	public SqlSession sqlSession;
	
	public PaymentDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
//	public void payment(PaymentDTO paymentDTO) {
//		sqlSession.insert("pay.payment" , paymentDTO);
//	}
//	
//   
//    // 결제 정보 조회
//    public PaymentDTO getPayment(int paymentNumber) {
//        // 데이터베이스에서 결제 정보를 조회하는 로직
//        // 조회된 정보를 PaymentDTO 객체로 매핑하여 반환
//    	
//    	return null;
//    }
//
//    // 결제 정보 수정
//    public void updatePayment(PaymentDTO paymentDTO) {
//        // 데이터베이스의 결제 정보를 수정하는 로직
//    }
//
//    // 결제 정보 삭제
//    public void deletePayment(int paymentNumber) {
//        // 데이터베이스의 결제 정보를 삭제하는 로직
//    }
	
	
}
