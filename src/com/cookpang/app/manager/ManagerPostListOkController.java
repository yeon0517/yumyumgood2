/**
 * 
 */
package com.cookpang.app.manager;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookpang.app.Execute;
import com.cookpang.app.manager.dao.ManagerDAO;
import com.cookpang.app.post.vo.PostVO;
import com.cookpang.app.user.dto.UserDTO;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * @author gimdaeyeon
 *
 */
public class ManagerPostListOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ManagerDAO managerDAO = new ManagerDAO();
		
		int postTotal = managerDAO.getPostTotal();
		
		String postTemp = req.getParameter("postPage");
		
		int postPage = postTemp == null ? 1 : Integer.valueOf(postTemp);
		
//		한 페이지에 보여줄 게시물	 목록의 갯수 10개
		int rowCount = 10;
//				페이지 버튼 세트는? 5개씩
		int pageCount = 5;

//				0, 10 -> 1페이지
//				10, 10 -> 2페이지
//				20, 10 -> 3페이지
		int postStartRow = (postPage - 1) * rowCount;
		
//		Math.ceil() 올림처리
		int postEndPage = (int) (Math.ceil(postPage / (double) pageCount) * pageCount);

//		endPage는 페이지 세트 당 마지막 번호를 의미한다.

		int postStartPage = postEndPage - (pageCount - 1);

//		startPage는 페이지 세트 당 첫 번째 번호를 의미한다.

		int realPostEndPage = (int) Math.ceil(postTotal/ (double) rowCount);

//		realEndPage는 전체 페이 중 가장 마지막 번호를 의미한다.

		postEndPage = postEndPage > realPostEndPage ? realPostEndPage : postEndPage;

//		첫 번째 페이 세트가 1~5
//		두 번째 페이 세트가 6~10이어도
//		realEndPage가 7이라면 두번째 페이지 세트의 마지막 번호는 7이어야 한다.

		boolean postPrev = postStartPage > 1; // 이전버튼
		boolean postNext = postEndPage != realPostEndPage; // 다음버튼

		
		
//		게시물 페이징
		Map<String, Integer> postPageMap = new HashMap<>();
		postPageMap.put("postStartRow", postStartRow);
		postPageMap.put("rowCount", rowCount);
		
		List<PostVO> postsList = managerDAO.selectPostAll(postPageMap);
		
		
		Gson gson = new Gson();
		JsonObject postResult = new JsonObject();
		
		JsonArray postsJsonArray = gson.toJsonTree(postsList).getAsJsonArray();
		postResult.add("posts", postsJsonArray);
		
		postResult.addProperty("postPage", postPage);
		
		postResult.addProperty("postStartPage", postStartPage);
		
		postResult.addProperty("postEndPage", postEndPage);
		
		postResult.addProperty("postPrev", postPrev);
		
		postResult.addProperty("postNext", postNext);
		
		resp.setContentType("application/json");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		out.print(postResult.toString());
		out.close();
	}

}
