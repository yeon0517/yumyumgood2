package com.cookpang.app.payment.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

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
}
