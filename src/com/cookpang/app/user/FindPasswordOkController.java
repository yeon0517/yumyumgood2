package com.cookpang.app.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.startup.PasswdUserDatabase;

import com.cookpang.app.Execute;
import com.cookpang.app.user.dao.UserDAO;
import com.cookpang.app.user.dto.UserDTO;


public class FindPasswordOkController implements Execute {
    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDAO userDAO = new UserDAO();
        UserDTO userDTO = new UserDTO();

        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=utf-8");

        userDTO.setUserPhoneNumber(req.getParameter("userPhoneNumber"));
        userDTO.setUserEmail(req.getParameter("userEmail"));

        
         String password = userDAO.findPassword(userDTO);
//         String password = userDAO.findPassword(userDTO);
        System.out.println(password);
        PrintWriter out = resp.getWriter();
        out.print(password);
        out.close();
        
        
//        if (password == null) { // 비밀번호가 없을 경우
//            req.setAttribute("errorMsg", "일치하는 정보가 없습니다.");
//            req.getRequestDispatcher("/user/findPasswordOk.us").forward(req, resp);
//        } else { // 비밀번호가 있을 경우
//            req.setAttribute("password", password);
//            req.setAttribute("user", userDTO); // userDTO를 jsp에서 사용하기 위해 req.setAttribute()를 사용합니다.
//            req.getRequestDispatcher("/user/findPasswordOk.us").forward(req, resp);
//        }
//        
        

    }
}
