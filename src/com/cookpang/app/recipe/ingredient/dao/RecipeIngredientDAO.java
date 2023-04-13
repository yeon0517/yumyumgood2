package com.cookpang.app.recipe.ingredient.dao;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.recipe.ingredient.vo.RecipeIngredientVO;
import com.cookpang.app.user.dto.UserDTO;
import com.mybatis.config.MyBatisConfig;

public class RecipeIngredientDAO {

	public SqlSession sqlSession;
	
	public RecipeIngredientDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	  
}
