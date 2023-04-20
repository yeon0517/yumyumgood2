package com.cookpang.app.payment;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
import com.cookpang.app.payment.dao.PaymentDAO;
import com.cookpang.app.post.dto.PostDTO;
import com.cookpang.app.recipe.ingredient.vo.RecipeIngredientVO;

public class PaymentMoController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		PaymentDAO paymentDAO = new PaymentDAO();

//		int postNumber = Integer.valueOf(req.getParameter("postNumber"));
		
		//이거 지우기
		int postNumber = 2;

		
		PostDTO payPost = paymentDAO.postPayment(postNumber);
		
		List<RecipeIngredientVO> recipeIngredientList =paymentDAO.postPaymentIngredient(postNumber);
		
		System.out.println("=============================");
		System.out.println(recipeIngredientList);
		System.out.println("=============================");
		req.setAttribute("ingredient", recipeIngredientList);
			
		req.setAttribute("payPost", payPost);

		req.getRequestDispatcher("/app/paymentModal.jsp").forward(req, resp);
//		resp.sendRedirect(null);

	}
}
