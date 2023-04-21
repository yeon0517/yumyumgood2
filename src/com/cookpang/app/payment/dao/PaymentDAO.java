package com.cookpang.app.payment.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.payment.vo.PaymentVO;
import com.cookpang.app.post.dto.PostDTO;
import com.cookpang.app.recipe.ingredient.vo.RecipeIngredientVO;
import com.mybatis.config.MyBatisConfig;

public class PaymentDAO {

	public SqlSession sqlSession;
	
	public PaymentDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
    public PostDTO postPayment(int postNumber) {
        return sqlSession.selectOne("payment.postPayment",postNumber);
    }
	
    public List<RecipeIngredientVO> postPaymentIngredient(int postNumber) { 
		  return sqlSession.selectList("recipeIngredient.postPaymentIngredient", postNumber);
	 }
    
    public List<PaymentVO> paymentList(Map<String, Integer>pageMap){
    	return sqlSession.selectList("payment.paymentList", pageMap);
    }
    
    public int getTotalList() {
		return sqlSession.selectOne("payment.getTotalList");
	}
    
}
