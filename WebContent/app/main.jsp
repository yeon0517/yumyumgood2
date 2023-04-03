<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>cookpang</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/main.css" />
<link rel="icon"
	href="${pageContext.request.contextPath}/assets/img/main/cookpang.png"
	type="image/x-icon" />
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Josefin+Slab:ital@1&display=swap"
	rel="stylesheet" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2001@1.1/GmarketSansMedium.woff" />
<link
	href="https://fonts.googleapis.com/css2?family=Nanum+Gothic+Coding:wght@400;700&family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap"
	rel="stylesheet" />
<script src="https://kit.fontawesome.com/9416f63361.js"
	crossorigin="anonymous"></script>

</head>
<body>
	<div id="body-main">
		<div id="main-header"></div>
		<div id="main-body">
			<div class="body-main-page">
				<div class="main-body-header">

					<div class="main-header-rank">
						<div class="tropy-img">
							<img
								src="${pageContext.request.contextPath}/assets/img/main/trophy.PNG"
								alt="" style="max-width: 100%; max-height: 100%;">
						</div>
						<div class="rank-round">
							<div class="rank-img">
								<img src="./img/20210826140223-17XU3.jpg" alt="">
							</div>
							<span class="number">1</span>
						</div>

						<div class="rank-round">
							<div class="rank-img">
								<img
									src="https://2bob.co.kr/data/recipe/20210304174955-ZE7O3.jpg"
									alt="">
							</div>
							<span class="number">2</span>
						</div>

						<div class="rank-round">
							<div class="rank-img">
								<img
									src="https://2bob.co.kr/data/recipe/20210304154326-2QD8M.jpg"
									alt="">
							</div>
							<span class="number">3</span>
						</div>

						<div class="rank-round">
							<div class="rank-img">
								<img
									src="https://2bob.co.kr/data/recipe/20210218140828-NDJUY.jpg"
									alt="">
							</div>
							<span class="number">4</span>
						</div>

						<div class="rank-round">
							<div class="rank-img">
								<img
									src="https://2bob.co.kr/data/recipe/20210923170425-BIXZO.jpg"
									alt="">
							</div>
							<span class="number">5</span>
						</div>

						<div class="rank-round">
							<div class="rank-img">
								<img
									src="
                    https://2bob.co.kr/data/recipe/20210826165658-WNVO3.jpg"
									alt="">
							</div>
							<span class="number">6</span>
						</div>

						<div class="rank-round">
							<div class="rank-img">
								<img
									src="https://2bob.co.kr/data/recipe/20210923153812-924SC.jpg"
									alt="">
							</div>
							<span class="number">7</span>
						</div>

						<div class="rank-round">
							<div class="rank-img">
								<img
									src="https://2bob.co.kr/data/recipe/20210826151005-V9DSL.jpg"
									alt="">
							</div>
							<span class="number">8</span>
						</div>


					</div>

				</div>
				<div class="main-body-bottom">
					<ul class="category-menu">
						<li class="category-box"><a class="recipe-category" href="">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_1_off.jpg"
								alt="" class="category-img">
								<p class="category-name">밥요리</p>
						</a></li>
						<li class="category-box"><a class="recipe-category" href="">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_2_off.jpg"
								alt="" class="category-img">
								<p class="category-name">국&탕</p>

						</a></li>
						<li class="category-box"><a class="recipe-category" href="">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_3_off.jpg"
								alt="" class="category-img">
								<p class="category-name">찌개&전골</p>


						</a></li>
						<li class="category-box"><a class="recipe-category" href="">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_4_off.jpg"
								alt="" class="category-img">
								<p class="category-name">밑반찬</p>

						</a></li>
						<li class="category-box"><a class="recipe-category" href="">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_5_off.jpg"
								alt="" class="category-img" id="category-img1">
								<p class="category-name">볶음요리</p>

						</a></li>
						<li class="category-box"><a class="recipe-category" href="">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_6_off.jpg"
								alt="" class="category-img">
								<p class="category-name">구이(고기/생선)</p>

						</a></li>
						<li class="category-box"><a class="recipe-category" href="">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_7_off.jpg"
								alt="" class="category-img">
								<p class="category-name">찜&조림</p>

						</a></li>
						<li class="category-box"><a class="recipe-category" href="">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_12_off.jpg"
								alt="" class="category-img">
								<p class="category-name">튀김</p>

						</a></li>
						<!-- <br> -->
						<li class="category-box"><a class="recipe-category" href="">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_13_off.jpg"
								alt="" class="category-img">
								<p class="category-name">국수</p>

						</a></li>
						<li class="category-box"><a class="recipe-category" href="">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_15_off.jpg"
								alt="" class="category-img">
								<p class="category-name">김밥&초밥</p>

						</a></li>
						<li class="category-box"><a class="recipe-category" href="">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_16_off.jpg"
								alt="" class="category-img">
								<p class="category-name">야식&술안주</p>

						</a></li>
						<li class="category-box"><a class="recipe-category" href="">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_17_off.jpg"
								alt="" class="category-img">
								<p class="category-name">스파게티</p>

						</a></li>
						<li class="category-box"><a class="recipe-category" href="">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_18_off.jpg"
								alt="" class="category-img">
								<p class="category-name">간식&분식</p>

						</a></li>
						<li class="category-box"><a class="recipe-category" href="">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_21_off.jpg"
								alt="" class="category-img">
								<p class="category-name">디저트</p>

						</a></li>
						<li class="category-box"><a class="recipe-category" href="">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_14_off.jpg"
								alt="" class="category-img">
								<p class="category-name">샐러드</p>

						</a></li>
						<li class="category-box"><a class="recipe-category" href="">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_19_off.jpg"
								alt="" class="category-img">
								<p class="category-name">토스트&샌드위치</p>

						</a></li>

					</ul>
				</div>

				<c:choose>
					<c:when test="${not empty postList}">
						<!-- 빠른 for문 -->
						<div class="aaa">
							<c:forEach var="post" items="${postList}">

								<div class="bbb">
									<img src="${post.getFiles()}" class="main-img" />
									<!-- <img
										src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR04JlroqrWnZpJunUNp4esFmT_qjuYd9WKoh0Lvj0&s"
										class="main-img" /> -->
									<div class="text-box">
										<a href="#" class="text-nick">${post.getUserNickName()}</a><br>
										<a href="#" class="text-title">${post.getPostTitle()}</a>
									</div>
								</div>

							</c:forEach>
						</div>
					</c:when>
					<c:otherwise>
						<tr>
							<!-- 테이블에서 여러 칼럼을 합칠때 쓰는거 colspan -->
							<td colspan="3" align="center">.</td>
						</tr>
					</c:otherwise>
				</c:choose>




				<div class="paging">
					<p class="paging-btn">
						<c:if test="${prev}">
							<a
								href="${pageContext.request.contextPath}/main?page=${startPage - 1}">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/paging_prev.jpg"
								alt="" class="direction">
							</a>
						</c:if>
					</p>
					<p class="paging-num">
						<c:forEach var="q" begin="${startPage}" end="${endPage}">
							<c:choose>
								<c:when test="${!(q == page)}">
									<a href="${pageContext.request.contextPath}/main?page=${q}">
										<c:out value="${q}" />
									</a>
								</c:when>
								<c:otherwise>
									<a href="#" class="btnColor"> 
										<c:out value="${q}" />
									</a>
								</c:otherwise>
							</c:choose>
						</c:forEach>
						

					</p>
					<p class="paging-btn">
						<c:if test="${next}">
							<a
								href="${pageContext.request.contextPath}/main?page=${endPage + 1}">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/paging_next.jpg"
								alt="다음으로">
							</a>
						</c:if>
					</p>
					<!-- <p class="paging-btn" id="paging-last">
						<a href="#"> <img
							src="https://2bob.co.kr/skin/nodskin_argio/images/paging_d_next.jpg"
							alt="마지막으로">
						</a>
					</p> -->
				</div>



			</div>
			<div class="body-side-bar">
				<div class="sidebar-menu">
					<li class="sidebar-name"><a href="#">CookPang</a></li>
					<ul class="sidebar-ul">
						<li class="sidebar-li">
							<div class="li-box">
								<!-- <img
                    src="../img/managerImg/home.png"
                    alt=""
                    class="sidebar-img"
                  /> -->
								<i class="fa-solid fa-house"></i> <a href="#">홈</a>
							</div>
						</li>
						<li class="sidebar-li">
							<div class="li-box">
								<!-- <img
                    src="../img/managerImg/h.png"
                    alt=""
                    class="sidebar-img"
                  /> -->
								<i class="fa-solid fa-magnifying-glass"></i> <a href="#">검색</a>
							</div>
						</li>
						<li class="sidebar-li">
							<div class="li-box">
								<!--  <img
                    src="../img/managerImg/heart.png"
                    alt=""
                    class="sidebar-img"
                  /> -->
								<i class="fa-regular fa-heart"></i> <a href="#">알림</a>
							</div>
						</li>
						<li class="sidebar-li">
							<div class="li-box">
								<!--  <img
                    src="../img/managerImg/plus.png"
                    alt=""
                    class="sidebar-img"
                  /> -->
								<i class="fa-regular fa-square-plus"></i> <a href="#">만들기</a>
							</div>
						</li>
						<li class="sidebar-li">
							<div class="li-box">
								<!-- <img
                    src="../img/managerImg/backet.png"
                    alt=""
                    class="sidebar-img"
                  /> -->
								<i class="fa-regular fa-bookmark"></i> <a href="#">찜한 레시피</a>
							</div>
						</li>
						<li class="sidebar-li">
							<div class="li-box">
								<!-- <img
                    src="../img/managerImg/pro.png"
                    alt=""
                    class="sidebar-img"
                  /> -->
								<i class="fa-regular fa-user"></i> <a href="#">프로필</a>
							</div>
						</li>
					</ul>
					<li class="sidebar-login"><a href="#">로그인</a></li>
				</div>
			</div>
			<div id="main-footer">
				<footer>
					<div>
						<div class="footer-content">
							<h3>Cook Pang</h3>
							<p>콘텐츠의 저작권은 제공처 또는 코리아IT아카데미 에 있으며, 이를 무단 이용하는 경우 저작권법 등에 따라
								법적책임을 질 수 있습니다.</p>
						</div>
						<div class="footer-bottom">
							<p>
								copyright © <a href="#">Cookpang</a>
							</p>
							<div class="footer-menu">
								<ul class="f-menu">
									<li><a
										href="${pageContext.request.contextPath}/assets/html/termsOfUse.html">이용약관</a></li>
									<li><a href="">About</a></li>
									<li><a href="">Contact</a></li>
									<li><a href="">Blog</a></li>
								</ul>
							</div>
						</div>
					</div>
				</footer>
			</div>
		</div>
		<script src="https://code.jquery.com/jquery-3.6.3.js"
			integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM="
			crossorigin="anonymous"></script>
</body>
</html>