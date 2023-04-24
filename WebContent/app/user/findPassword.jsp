<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
 <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/findPassword.css">
  <script src="https://code.jquery.com/jquery-latest.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
  <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap" rel="stylesheet">
  
 
  
</head>
<body>
  <div class="wrapper">
    <img src="" alt="">
    
    <div class="form-group">
    <h1>CookPang</h1>
    <br>
    <h4>로그인에 문제가 있나요?</h4>
    <!-- <h5>회원 가입시 입력하신 이메일 주소를 입력하시면</h5><br>
    <h5>비밀번호 변경 링크를 보내드립니다.</h5> -->
  </div>
    <form action="#">
      <div class="form-group">
        <label for="user-password">이메일</label>
        <input type="email" id="email" name="memberEmail" placeholder="이메일을 입력하세요." required />
          <span class="check-msg" id="check-email-msg"></span>
          <label for="user-password">핸드폰 번호</label>
          <input type="phoneNumber" id="phone" name="memberNumber" placeholder="핸드폰 번호를 입력하세요." required />
          <span class="check-msg" id="check-phone-msg"></span>
      <!-- 이메일 입려 조건에 어긋나면 메세지가 나타난다. 이건 백엔드 작업에서 바꿔야됨.. -->
      <button type="submit" id ="password" >비밀번호 찾기</button>
      
        <div class="input-group" id="input-line">
          <div class="line"></div>
          <div class="or">또는</div>
          <div class="line"></div>
        </div>
        
        
        
        <div class="member">
          <a href="${pageContext.request.contextPath}/user/join.us">
            새 계정 만들기
          </a>
        </div>


      </div>
      
    </form>

    <p class="success">${user.getUserPassword()}</p>
  </div>
  <div class="bottom">
    <div class="returnLogin">
          <a href="${pageContext.request.contextPath}/user/login.us">
            로그인으로 돌아가기
          </a>
      </div>
    </div>
    
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script src="https://code.jquery.com/jquery-3.6.3.js" integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM=" crossorigin="anonymous"></script>
	<script>
		$(document).ready(function() {
			var $errorMsg = $('#check-msg');
			var $successMsg = $('.success');
			console.log('디버깅 메시지');
			$('#password').click(function() {
				var phone = $('#phone').val();
				var email = $('#email').val();

				$.ajax({
					url : '/user/findPasswordOk.us',
					type : 'POST',
					data : {
						userPhoneNumber : phone,
						userEmail : email
					},
					success : function(response) {
						if (response == "0") {
							$successMsg.html('<p style="color:red"> 일치하는 회원이 없습니다.</p>')
						} else {
						 $successMsg.html('<p style="color:green"> 당신의 비밀번호는 : ' + (response) +' 입니다 </p>'); 
						}
					},
					error : function(jqXHR, textStatus, errorThrown) {
					}
				});
			});
		});
	</script>
</body>
</html>
























