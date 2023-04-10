package com.cookpang.app.payment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
import com.cookpang.app.payment.dao.PaymentDAO;
import com.cookpang.app.payment.dto.PaymentDTO;
import com.cookpang.app.post.dto.PostDTO;

public class PaymentController implements Execute {
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		PaymentDAO paymentDAO = new PaymentDAO();

//		int postNumber = (int) session.getAttribute("postNumber");
		
		
		//이거 지우기
		int postNumber = 1;

		PostDTO payPost = paymentDAO.postPayment(postNumber);

		req.setAttribute("payPost", payPost);
		req.getRequestDispatcher("/app/paymentModal.jsp").forward(req, resp);

	}
}
