<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>post_read</title>
   <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/postRead.css">
  <script src="https://kit.fontawesome.com/c6992f5b12.js" crossorigin="anonymous"></script>
  <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/font-applesdgothicneo@1.0/all.min.css">
 <!--게시글 글꼴-->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic&display=swap" rel="stylesheet">
</head>

<body>


  <div class="globar-wrap">

    <div class="container">

      <div class="read-box-wrap">

        <!-- 게시물 사진영역 -->

        <div class="read-imgs-container">

          <ul class="read-imgs">

            <li>
              <div class="read-img-box">
                <!-- 임시 이미지 -->
                <img
                  src="https://static.wtable.co.kr/image/production/service/recipe/1739/6692f01e-191c-4072-9481-43e6530bbcf8.jpg?size=1024x1024"
                  alt="" class="read-img">
              </div>
            </li>

          </ul>

          <div class="read-img-controller-box">
            <div class="read-box-imgs-prev">
              <button type="button" class="img-prev-next-button">
                <i class="fa-solid fa-circle-chevron-left"></i>
              </button>
            </div>

            <!-- 다음사진으로 넘기기  -->
            <div class="read-box-imgs-next">
              <button type="button" class="img-prev-next-button">
                <i class="fa-solid fa-circle-chevron-right"></i>
              </button>
            </div>
          </div>


        </div>


        <!-- 게시물 내용영역 -->

        <div class="read-content-wrap">

          <!-- 게시물 작성자 프로필 영역 -->
          <div class="writer-info-box">

            <!-- 임시 프로필사진 -->
            <div class="writer-profile">

              <!-- 작성자 페이지로 이동 -->
              <a href="#" class="writer-link">
                <img src="../img/test3.jpg" alt="프로필 이미지" class="writer-profile-img">
              </a>

            </div>

            <div class="writer-id">
              <a href="" class="writer-link">
                <!-- 임시 작성자 id -->
                <h4>id</h4>
              </a>

              <button class="more-btn">
                <i class="fa-solid fa-ellipsis"></i>
              </button>

            </div>


          </div>

          <!-- 작성된 내용 -->
          <div class="read-main-content">
            <div class="read-content-title">
              <!-- 임시 게시물 제목 -->
              <!-- 제목 최대 자릿수 44 -->
              <h3>게시물 제목</h3>

            </div>

            
            <div class="content-box">
              <div class="content-msg-box"><!--게시물내용 보이는곳-->
                게시글 내용 보이는곳
              </div>

              <div class="content-choice-box">
                <div class="ingredient-btn-box">

                  <!-- 재료, 레시피 아이콘 찾아보기 -->
                  <button class="ingredient-btn">
                    재료 보기 
                  </button>
                </div>
                <div class="recipe-btn-box">
                  <button class="recipe-btn">
                    레시피 보기
                  </button>
                </div>
  
              </div>

              <!-- 재료영역 -->
              <div class="ingredient-box js-contents">

                



                
                <!-- 재료 목록들 -->
                <ul class="ingredient-list">

                  <div class="ingredient-title">
                    <!-- 임시 재료묶음 제목 -->
                    기본재료
                  </div>

                  <li class="ingredient-info">
                    <div class="ingredient-name">
                      <!-- 임시 재료 이름 -->
                      삼겹살
                    </div>

                    <div class="ingredient-quantity">
                      <!-- 임시 재료 수량 -->
                      800g
                    </div>
                  </li>
                  <li class="ingredient-info">
                    <div class="ingredient-name">
                      <!-- 임시 재료 이름 -->
                      삼겹살
                    </div>

                    <div class="ingredient-quantity">
                      <!-- 임시 재료 수량 -->
                      800g
                    </div>
                  </li>
                  <li class="ingredient-info">
                    <div class="ingredient-name">
                      <!-- 임시 재료 이름 -->
                      삼겹살
                    </div>

                    <div class="ingredient-quantity">
                      <!-- 임시 재료 수량 -->
                      800g
                    </div>
                  </li>
                  <li class="ingredient-info">
                    <div class="ingredient-name">
                      <!-- 임시 재료 이름 -->
                      삼겹살
                    </div>

                    <div class="ingredient-quantity">
                      <!-- 임시 재료 수량 -->
                      800g
                    </div>
                  </li>




                </ul>






              </div>

              <!-- 레시피 내용, 카테고리 영역 -->
              <div class="recipe-container js-contents">
                <div class="recipe-category-wrap">

                  <!--a테그 : 해당 카테고리 누르면 검색화면으로 이동하고  -->
                  <!-- 그 카테고리가 검색된다.  -> 나중에 시간있으면-->
                  <ul class="categories">

                    <li class="category-list">
                      <a href="#">밑 반찬</a>
                    </li>
                    
                    <li class="category-list">
                      <a href="#">밥 요리</a>
                    </li>
                    <li class="category-list">
                      <a href="#">야식&술안주</a>
                    </li>
                    <li class="category-list">
                      <a href="#">구이</a>
                    </li>


                  </ul>




                </div>


                <div class="main-content">
                  <!-- 임시 내용 -->
                  step1
                  냄비에 물과 삶는 물 재료를 넣고 끓어오르면 삼겹살을 2등분해서 넣은 후 1시간 정도 삶아주세요.
                  <br><br>
                  step2
                  대파와 양파는 곱게 채를 썰고 부추는 4cm 길이로 썰어주세요. 묵은지는 물에 헹군 후 물기를 빼고 먹기 좋게 썰고 볼에 파무침 소스를 넣고 고루 섞어 소스를 만들어주세요.
                  
                  <br><br>
                  step3
                  팬에 조림장 재료를 넣고 팔팔 끓으면 삶은 삼겹살을 넣은 후 앞뒤로 뒤집어 가며 윤기나게 조려주세요.
                  
                  <br><br>
                  step4
                  고기를 먹기 좋게 한 입 크기로 썰어 접시에 담아주세요.
                  
                  <br><br>
                  step5
                  파채와 양파, 부추를 무침 소스를 넣어 가볍게 섞고 묵은지 또는 명이나물 등을 곁들여 맛있게 즐겨주세요.



                </div>



              </div>

              <!-- 댓글 리스트 영역 -->
              <div class="read-comment-container js-contents">
                
                <ul class="read-comment">

                  <li class="read-comment-box">

                    <div class="comment-writer-img-box">
                      <img src="../img/test2.jpg" alt="댓글작성자 프로필 사진" class="comment-writer-profile-img">
                    </div>

                    <div class="comment-content-box">
                      <!-- 임시 댓글작성자 아이디 -->
                      <div class="comment-writer-id">
                        dfdsfsf

                      </div>

                      <div class="read-comment-content">
                      <!-- 임시 댓글 내용 -->
                        맛있겠네용^^
                      </div>

                      <div class="read-comment-more">
                        <div class="comment-write-time">
                          2023-03-26 22:26:48 
                        </div>

                        <button type="button" class="comment-delete">
                          삭제하기
                        </button>

                      </div>

                    </div>

                  </li>


                </ul>
                



                </div>

              </div>


            </div>

            <div class="comment-form-container">
              <form class="comment-form">

                <!-- 게시물 번호 작성 -->
                <input type="hidden" name="postNumber" value="#">

                <section class="reader-act-section">

                  <span class="like-box">
                    <button class="like-btn" type="button">
                      <!-- 버튼을 누르면 색이 채워진 아이콘으로 변경 -->

                      <i class="fa-regular fa-heart like-f js-like-btn"></i>
                      <i class="fa-solid fa-he art like-t js-like-btn" style="color: red;"></i>
                    </button>
                  </span>

                  <span class="comment-btn-box">
                    <button class="comment-btn" type="button">
                      <i class="fa-regular fa-comment"></i>
                    </button>
                  </span>

                  <sapn class="buy-box">
                    <button class="buy-btn" type="button">
                      <i class="fa-solid fa-cart-shopping"></i>
                    </button>
                  </sapn>

                  <sapn class="save-box">
                    <button class="save-btn" type="button">
                      <!-- 버튼을 누르면 색이 채워진 아이콘으로 변경 -->
                      <i class="fa-regular fa-bookmark save-f"></i>
                      <!-- <i class="fa-solid fa-bookmark save-t"></i> -->
                    </button>
                  </sapn>


                </section>

                <div class="like-count-box">
                  <button class="like-count-btn">
                    <!-- 임시 좋아요 갯수 -->
                    좋아요 75개
                  </button>

                  <div class="post-view-count-box">
                    <i class="fa-regular fa-eye view-icon"></i>
                    <!-- 임시 조회수 -->
                    84
                  </div>

                </div>

                <div class="date-box">
                  <!-- 임시 게시일 -->
                  3월 22일, 2023년
                </div>


                <div class="comment-wrap">
               
                  <div class="comment-box">
                    <textarea name="readComment" class="comment-input" placeholder="댓글 달기.."></textarea>

                    <button type="button" class="comment-post-btn">
                      <h4>게시</h4>
                    </button>

                  </div>
                </div>
              </form>
            </div>


          </div>


        </div>


      </div>


    </div>


    <button class="close-btn">
      <!-- 이전 경로로 이동 -->
      <a href="#">
        <i class="fa-solid fa-x"></i>
      </a>
    </button>
  </div>



  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
  <script src="${pageContext.request.contextPath}/assets/js/postRead.js"></script>
  </body>

</html>