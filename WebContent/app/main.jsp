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
						<c:forEach var="rank" begin="1" end="8">
							<c:choose>
								<c:when test="${not empty rankTotal}">
									<div class="rank-round">
										<a href="#" class="rank-a">
											<div class="rank-img">
											<%-- ${post.getFiles()} 이미지에 넣는거--%>
												<img src="https://cdn-bastani.stunning.kr/prod/users/3dbbdc56-858d-4d0e-b467-1463957476e3/avatar/ZQdoCULUEydS7bnM.image.jpg.small?q=60&t=crop&s=300x300"
													alt="${post.getPostFileSystemName()}">

											</div>
										</a> <span class="number">${rank}</span>
									</div>

								</c:when>
							</c:choose>
						</c:forEach>
						<!-- <div class="rank-round">
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
						</div> -->


					</div>

				</div>

				<!-- 카테고리 -->
				<%-- <c:forEach var="category" items="${categories}">
					<li><a href="category.jsp?id=${category.id}">${category.name}</a></li>
				</c:forEach> --%>

				<div class="main-body-bottom">
					<ul class="category-menu">
						<li class="category-box"><a class="recipe-category"
							href="${pageContext.request.contextPath}/mainOk.m?categoryNumber=1">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_1_off.jpg"
								alt="" class="category-img">
								<p class="category-name">밥요리</p>
						</a></li>
						<li class="category-box"><a class="recipe-category"
							href="${pageContext.request.contextPath}/mainOk.m?categoryNumber=2">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_2_off.jpg"
								alt="" class="category-img">
								<p class="category-name">국&탕</p>

						</a></li>
						<li class="category-box"><a class="recipe-category"
							href="${pageContext.request.contextPath}/mainOk.m?categoryNumber=3">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_3_off.jpg"
								alt="" class="category-img">
								<p class="category-name">찌개&전골</p>


						</a></li>
						<li class="category-box"><a class="recipe-category"
							href="${pageContext.request.contextPath}/mainOk.m?categoryNumber=5">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_4_off.jpg"
								alt="" class="category-img">
								<p class="category-name">밑반찬</p>

						</a></li>
						<li class="category-box"><a class="recipe-category"
							href="${pageContext.request.contextPath}/mainOk.m?categoryNumber=4">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_5_off.jpg"
								alt="" class="category-img" id="category-img1">
								<p class="category-name">볶음요리</p>

						</a></li>
						<li class="category-box"><a class="recipe-category"
							href="${pageContext.request.contextPath}/mainOk.m?categoryNumber=15">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_6_off.jpg"
								alt="" class="category-img">
								<p class="category-name">구이(고기/생선)</p>

						</a></li>
						<li class="category-box"><a class="recipe-category"
							href="${pageContext.request.contextPath}/mainOk.m?categoryNumber=6">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_7_off.jpg"
								alt="" class="category-img">
								<p class="category-name">찜&조림</p>

						</a></li>
						<li class="category-box"><a class="recipe-category"
							href="${pageContext.request.contextPath}/mainOk.m?categoryNumber=11">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_12_off.jpg"
								alt="" class="category-img">
								<p class="category-name">튀김</p>

						</a></li>
						<br>
						<li class="category-box"><a class="recipe-category"
							href="${pageContext.request.contextPath}/mainOk.m?categoryNumber=8">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_13_off.jpg"
								alt="" class="category-img">
								<p class="category-name">국수</p>

						</a></li>
						<li class="category-box"><a class="recipe-category"
							href="${pageContext.request.contextPath}/mainOk.m?categoryNumber=10">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_15_off.jpg"
								alt="" class="category-img">
								<p class="category-name">김밥&초밥</p>

						</a></li>
						<li class="category-box"><a class="recipe-category"
							href="${pageContext.request.contextPath}/mainOk.m?categoryNumber=7">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_16_off.jpg"
								alt="" class="category-img">
								<p class="category-name">야식&술안주</p>

						</a></li>
						<li class="category-box"><a class="recipe-category"
							href="${pageContext.request.contextPath}/mainOk.m?categoryNumber=12">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_17_off.jpg"
								alt="" class="category-img">
								<p class="category-name">스파게티</p>

						</a></li>
						<li class="category-box"><a class="recipe-category"
							href="${pageContext.request.contextPath}/mainOk.m?categoryNumber=13">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_18_off.jpg"
								alt="" class="category-img">
								<p class="category-name">간식&분식</p>

						</a></li>
						<li class="category-box"><a class="recipe-category"
							href="${pageContext.request.contextPath}/mainOk.m?categoryNumber=14">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_21_off.jpg"
								alt="" class="category-img">
								<p class="category-name">디저트</p>

						</a></li>
						<li class="category-box"><a class="recipe-category"
							href="${pageContext.request.contextPath}/mainOk.m?categoryNumber=9">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_14_off.jpg"
								alt="" class="category-img">
								<p class="category-name">샐러드</p>

						</a></li>
						<li class="category-box"><a class="recipe-category"
							href="${pageContext.request.contextPath}/mainOk.m?categoryNumber=16">
								<img
								src="https://2bob.co.kr/skin/nodskin_argio/images/tag_icon_19_off.jpg"
								alt="" class="category-img">
								<p class="category-name">토스트&샌드위치</p>

						</a></li>

					</ul>
				</div>
				<!-- 카테고리 -->


				<c:choose>
					<c:when test="${not empty postList}">
						<!-- 빠른 for문 -->
						<div class="aaa">
							<c:forEach var="post" items="${postList}">


								<div class="bbb">
								<%-- ${post.getFiles()} 이미지코드에 넣기--%>
									<a href="#"> <img src="https://img.insight.co.kr/static/2023/02/24/700/img_20230224130814_f2w78110.webp" class="main-img" />
									</a>
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
								href="${pageContext.request.contextPath}/mainOk.m?page=${startPage - 1}&categoryNumber=${categoryNumber}">
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
									<a
										href="${pageContext.request.contextPath}/mainOk.m?page=${q}&categoryNumber=${categoryNumber}">
										<c:out value="${q}" />
									</a>
								</c:when>
								<c:otherwise>
									<a href="#" class="btnColor"> <c:out value="${q}" />
									</a>
								</c:otherwise>
							</c:choose>
						</c:forEach>


					</p>
					<p class="paging-btn">
						<c:if test="${next}">
							<a
								href="${pageContext.request.contextPath}/mainOk.m?page=${endPage + 1}&categoryNumber=${categoryNumber}">
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
								<i class="fa-solid fa-house"></i> <a
									href="${pageContext.request.contextPath}/mainOk.m">홈</a>
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
								<i class="fa-regular fa-square-plus"></i> <a href="${pageContext.request.contextPath}/post/postWrite.po">만들기</a>
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

					<div class="btn-group">
						<li class="sidebar-login"><c:choose>
								<c:when test="${empty sessionScope.userNumber}">
									<a href="${pageContext.request.contextPath}/user/login.us">로그인</a></li>
						</c:when>
						<c:otherwise>
							<a href="${pageContext.request.contextPath}/user/logoutOk.us">로그아웃</a>
						</c:otherwise>
						</c:choose>
					</div>

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