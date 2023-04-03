<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/join.css">
  <script src="https://code.jquery.com/jquery-latest.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
  <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap" rel="stylesheet">
  
 <script>
    window.onload = function(){
        document.getElementById("address_kakao").addEventListener("click", function(){ //주소입력칸을 클릭하면
            //카카오 지도 발생
            new daum.Postcode({
                oncomplete: function(data) { //선택시 입력값 세팅
                    document.getElementById("address_kakao").value = data.address; // 주소 넣기
                    document.querySelector("input[name=address_detail]").focus(); //상세입력 포커싱
                }
            }).open();
        });
    }
  </script> 
  
</head>
<body>
 <div class="wrapper">
    <img src="" alt="">
    
    <div class="form-group">
    <h1>CookPang</h1>
    <h5>환영합니다!</h5>
  </div>
  
    <form action="joinOk.us" method="POST">
      <div class="form-group">
        <label for="id">아이디</label>
        <input type="text" id="id" name= "userId" placeholder="아이디를 입력하세요." required/>
        <span class="check-msg" id="check-id-msg"></span>
      </div>

      <div class="form-group">
        <label for="password">비밀번호</label>
        <input type="password" id="password" name="userPassword" placeholder="비밀번호를 입력하세요" required />
        <span class="check-msg" id="check-pw-msg"></span>
      </div>
      
      <div class="form-group">
        <label for="name">이름</label>
        <input type="text" id="name"  name="userName" placeholder="이름을 입력하세요." required/>
      </div> 
      
      <div class="form-group">
        <label for="nick-name">닉네임</label>
        <input type="text" id="nick-name" name="userNickName" placeholder="닉네임을 입력하세요." required/>
        <span class="check-msg" id="check-nick-msg"></span>
      </div>

      <div class="form-group">
        <label for="phone-number">핸드폰</label>
        <input type="text" id="phone-number" name="userPhoneNumber" placeholder="핸드폰 번호를 입력하세요." required/>
        <span class="check-msg" id="check-phone-msg"></span>
      </div>
        
      
      <div class="form-group">
        <label>성별</label>
        <div>
          <input type="radio" id="none" name="userGender" value="N" checked />
          <label for="none">선택안함</label>
          <input type="radio" id="male" name="userGender" value="M" />
          <label for="male">남성</label>
          <input type="radio" id="female" name="userGender" value="F" />
          <label for="female">여성</label>
        </div>

        <div class="form-group">
          <label for="email">이메일</label>
          <input type="email" id="email" name="userEmail" placeholder="yumyumgood@cookpang.kr" required />
          <span class="check-msg" id="check-email-msg"></span>
        </div>

        <div class="form-group">
          <label for="address_kakao">주소</label>
          <input type="text" id="address_kakao" name="address" placeholder="주소를 입력해 주세요." readonly />
         </div> 
          
         <div class="form-group"></div>
          <label for="address">상세 주소</label>
          <input id="address" type="text" placeholder="상세주소를 입력해 주세요." name="addressDetail" required/>
        </div>

       

        <div class="form-group">
          <div class="agree-wrap">
            <label for="agree">회원 가입 약관에 동의합니다.
              <a href="#">약관 자세히 보기</a>
            </label>
            <input type="checkbox" id="agree" name="agree"/>
          </div>
        </div>
        <button type="submit">회원 가입</button>
        
        <div class="member">
          이미 회원이신가요? 
          <a href="${pageContext.request.contextPath}/user/loginOk.us">
            로그인하기
          </a>
        </div>
    </form>
    
</div>

<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/join.js"></script>
<script>
	console.log('asdf')
</script>
</body>
</html>
