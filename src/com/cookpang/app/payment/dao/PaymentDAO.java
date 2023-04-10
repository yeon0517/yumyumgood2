package com.cookpang.app.payment.dao;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.payment.dto.PaymentDTO;
import com.cookpang.app.post.dto.PostDTO;
import com.mybatis.config.MyBatisConfig;

public class PaymentDAO {

	public SqlSession sqlSession;
	
	public PaymentDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
    public PostDTO postPayment(int postNumber) {
        return sqlSession.selectOne("payment.postPayment",postNumber);
    }
	
	
}
