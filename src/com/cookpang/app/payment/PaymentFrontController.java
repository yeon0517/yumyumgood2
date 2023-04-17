package com.cookpang.app.payment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.user.JoinOkController;

public class PaymentFrontController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String target = req.getRequestURI().substring(req.getContextPath().length());
		System.out.println(target);

		switch(target) {
        case "/pay/paymentmo.pa" :
            new PaymentMoController().execute(req, resp);
            break;
        case "/pay/paymentOkmo.pa":
            new PaymentMoOkController().execute(req, resp);
            break;
        case "/pay/paymentItem.pa":
            new PaymentItemController().execute(req, resp);
            break;
			
		}
	}

}
