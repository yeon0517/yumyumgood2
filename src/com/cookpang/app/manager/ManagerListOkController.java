package com.cookpang.app.manager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.manager.dao.ManagerDAO;

public class ManagerListOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ManagerDAO managerDAO = new ManagerDAO();
		int total  = managerDAO.getUserTotal();
		
//		String temp
		
		
		
		
		
		
		
		
		
	}

}
