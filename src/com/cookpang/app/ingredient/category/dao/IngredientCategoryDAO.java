package com.cookpang.app.ingredient.category.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cookpang.app.ingredient.category.dto.IngredientCategoryDTO;
import com.cookpang.app.ingredient.dto.IngredientDTO;
import com.mybatis.config.MyBatisConfig;

public class IngredientCategoryDAO {

	public SqlSession sqlSession;
	
	public IngredientCategoryDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public List<IngredientCategoryDTO> getIngredientCategoryNumber() {
		return sqlSession.selectList("ingredientCategory.getIngredientCategoryNumber");
	}
	
	public List<IngredientDTO> getIngredientNumbers(int ingredientCategoryNumber) {
		return sqlSession.selectList("ingredientCategory.getIngredientNumbers", ingredientCategoryNumber);
	}
}
