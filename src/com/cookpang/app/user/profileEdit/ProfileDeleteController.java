package com.cookpang.app.user.profileEdit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
import com.cookpang.app.comment.dao.CommentDAO;
import com.cookpang.app.comment.dto.CommentDTO;
import com.cookpang.app.follow.dao.FollowDAO;
import com.cookpang.app.follow.dto.FollowDTO;
import com.cookpang.app.order.dao.OrderDAO;
import com.cookpang.app.order.dto.OrderDTO;
import com.cookpang.app.post.dao.PostDAO;
import com.cookpang.app.post.dto.PostDTO;
import com.cookpang.app.post.like.dao.PostLikeDAO;
import com.cookpang.app.post.like.dto.PostLikeDTO;
import com.cookpang.app.post.save.dao.PostSaveDAO;
import com.cookpang.app.post.save.dto.PostSaveDTO;
import com.cookpang.app.user.dao.UserDAO;
import com.cookpang.app.user.dto.UserDTO;
import com.cookpang.app.user.profileImage.dao.ProfileImageDAO;
import com.cookpang.app.user.profileImage.dto.ProfileImageDTO;

public class ProfileDeleteController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();
		String path = null;
		System.out.println("회원탈퇴 컨트롤러 들어왔다!");
		int userNumber = (int)session.getAttribute("userNumber");

		System.out.println(userNumber );
		FollowDAO followDAO = new FollowDAO();
		CommentDAO commentDAO = new CommentDAO();
		PostSaveDAO postSaveDAO = new PostSaveDAO();
		PostLikeDAO postLikeDAO = new PostLikeDAO();
		OrderDAO orderDAO = new OrderDAO();
		ProfileImageDAO profileImageDAO = new ProfileImageDAO();
		PostDAO postDAO = new PostDAO();
		UserDAO userDAO = new UserDAO();

		followDAO.delete(userNumber);
		commentDAO.delete(userNumber);
		postSaveDAO.delete(userNumber);
		postLikeDAO.delete(userNumber);
		orderDAO.delete(userNumber);
		profileImageDAO.delete(userNumber);
		postDAO.deleteUser(userNumber);
		userDAO.delete(userNumber);
		req.getSession().invalidate();
		
		resp.sendRedirect("/user/logoutOk.us");
	
	}

}
