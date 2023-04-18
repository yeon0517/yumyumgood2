package com.cookpang.app.user.mypage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cookpang.app.Execute;
import com.cookpang.app.post.save.dao.PostSaveDAO;
import com.cookpang.app.post.save.vo.PostSaveVO;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class MyPageLikeOkController implements Execute {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		int userNumber = Integer.valueOf(req.getParameter("userNumber"));
//		int userNumber = 1;
		
		
		PostSaveDAO postSaveDAO = new PostSaveDAO();
		
		int total = postSaveDAO.getSavePost(userNumber);
		// 처음 게시판 페이지에 진입하면 페이지에 대한 정보가 없다
		// 그러므로 temp에는 null이 들어가게 된다.
		String temp = req.getParameter("page");

		// null인 경우는 게시판에 처음 이동하는 것이므로 1페이지를 띄워주면 된다.
		int page = temp == null ? 1 : Integer.valueOf(temp);

		// 한 페이지에 몇 개의 게시물? 10개
		int rowCount = 9;
		// 페이지 버튼 세트는? 5개식
		int pageCount = 5;

		/*
		 * 0,10 -> 1페이지 10,10 -> 2페이지 20,10 -> 3페이지
		 */
		int startRow = (page - 1) * rowCount;

//		Math.ceil() 올림처리
		int endPage = (int) (Math.ceil(page / (double) pageCount) * pageCount);
//		endPage는 페이지 세트 당 마지막 번호를 의미한다.

		int startPage = endPage - (pageCount - 1);
//		startPage는 페이지 세트 당 첫 번째 번호를 의미한다.

		int realEndPage = (int) Math.ceil(total / (double) rowCount); // total : 게시글의 총 갯수
//		realEndPage는 전체 페이지 중 가장 마지막 번호를 의미한다.		

		endPage = endPage > realEndPage ? realEndPage : endPage;
//		첫 번째 페이지 세트가 1~5
//		두 번째 페이지 세트가 6~10 이어도
//		realEndPage가 7이라면 두 번째 페이지 세트의 마지막 번호는 7이어야 한다.

		boolean prev = startPage > 1;
		boolean next = endPage != realEndPage;

		
		System.out.println("!!!!!!!!!!!!!!!!!!11111");
		  System.out.println("total"+total); 
		  System.out.println("page"+page);
		  System.out.println("startRow"+startRow);
		  System.out.println("endPage"+endPage);
		  System.out.println("realEndPage"+realEndPage);
		 

		Map<String, Integer> pageMap = new HashMap();

		pageMap.put("startRow", startRow);
		pageMap.put("rowCount", rowCount);
		pageMap.put("userNumber", userNumber);

		List<PostSaveVO> savePosts = postSaveDAO.getPostAll(pageMap);
		System.out.println(savePosts);

		// Gson 객체를 생성하고, 이를 이용해 위에 설정한 리스트를 json 형태로 변환한다.
		Gson gson = new Gson();
		
		
//JsonArray 객체를 생성하고, 변수를 설정하여 할당한다. 
		JsonObject saveResult = new JsonObject();

		//여기
//		JsonArray postList = new JsonArray();
		JsonArray savePostList = gson.toJsonTree(savePosts).getAsJsonArray();
		System.out.println(savePostList);
		/*
		 * //DAO객체를 생성할 때 만든 리스트를 stream() 메소드를 이용해 순차적으로 처리하고, 각 요소를 gson::toJson()
		 * 메소드를 이용해 JSON형태로 변환한 후 JsonParser::parseString() 메소드를 이용해 JsonElement 형태로
		 * 파싱합니다. 마지막으로 JsonArray의 변수에 각 JsonElement를 add()메소드를 통해 추가한다.
		 */
		System.out.println("==============");

//		posts.stream()
//		.map(gson::toJson)
//		.map(JsonParser::parseString)
//		.forEach(postList::add);

		System.out.println("=====%%%=========");

		/*
		 * //JsonObject 객체를 생성하고 이를 이용해 JSON 형태의 결과값을 저장한다 result라는 객체에는 list,
		 * startPage, endPage, page , realEndPage라는 key와 그에 해당하는 값들이 저장된다.
		 */
		//여기
//		result.add("list", JsonParser.parseString(postList.toString()));
		saveResult.add("userSavePost", savePostList);
		
		saveResult.addProperty("startPage", startPage);
		saveResult.addProperty("endPage", endPage);
		saveResult.addProperty("page", page);
		saveResult.addProperty("realEndPage", realEndPage);

		
		System.out.println("*******************");
		System.out.println(saveResult);
		resp.setContentType("application/json; charSet=utf-8");

		/*
		 * //PrintWriter 객체를 생성하고, result 객체를 문자열로 변환한 후 print()메소드를 통해 결과값을 출력한다. 마지막으로
		 * close()메소드를 통해 출력 스트림을 닫습니다.
		 */
		PrintWriter out = resp.getWriter();
		out.print(saveResult.toString());
		System.out.println("==============");
		System.out.println(saveResult.toString());
		out.close();

//		req.getRequestDispatcher("/app/mypage.jsp").forward(req, resp);
	}

}
