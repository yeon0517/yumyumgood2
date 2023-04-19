<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>비밀번호 찾기</title>
<script src="https://code.jquery.com/jquery-latest.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap"
	rel="stylesheet">

<style>
body {
	background-color: #f9f9f9;
	font-family: Arial, Helvetica, sans-serif;
}

.container {
	background-color: #fff;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
	margin: 20px auto;
	padding: 20px;
	max-width: 400px;
	text-align: center;
	margin-top: 120px;
}

h2 {
	color: #2d2d2d;
	font-size: 1.5rem;
	margin-bottom: 20px;
}

form {
	display: flex;
	flex-direction: column;
	align-items: center;
	margin-top: 20px;
}

button, input[type="text"], input[type="tel"], input[type="email"] {
	border-radius: 5px;
	border: 1px solid #ccc;
	padding: 10px;
	margin-bottom: 10px;
	width: 100%;
	box-sizing: border-box;
}

button, input[type="submit"] {
	background-color: #4caf50;
	color: white;
	border-radius: 5px;
	padding: 10px 20px;
	border: none;
	cursor: pointer;
	transition: all 0.3s ease-in-out;
}

button, input[type="submit"]:hover {
	background-color: #3e8e41;
}

button {
	width: 136px;
	margin-top: 17px;
}

a {
	color: #4caf50;
	text-decoration: none;
}

a:hover {
	text-decoration: underline;
}

.error-msg {
	color: red;
}

.error {
	color: red;
	margin-bottom: 10px;
}

.success {
	color: green;
	margin-bottom: 10px;
}

input:focus::placeholder {
	color: transparent;
}
</style>


</head>
<body>
	<div class="container">
		<h2>비밀번호 찾기</h2>

		<form action="#" method="post">
			<!-- <label for="name">이름</label>
        <input
          type="text"
          id="name"
          name="name"
          placeholder="ex) 홍길동"
          required
        /> -->

			<label for="phone">핸드폰 번호</label> <input type="tel" id="phone"
				name="userPhoneNumber" placeholder="ex) 010-1234-1234" required />
			<label for="email">이메일 주소</label> <input type="email" id="email"
				name="userEmail" placeholder="ex) sbsItAcademy@Academy.com" required />



			<button type="button" id="password">비밀번호 찾기</button>

		</form>

		<div>
			<a href="${pageContext.request.contextPath}/user/login.us">로그인</a>
		</div>
		<div>
			<a href="${pageContext.request.contextPath}/user/join.us">회원가입하기</a>
		</div>

		<p class="success">${user.getUserPassword()}</p>
	</div>
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script>
		$(document).ready(function() {
			var $errorMsg = $('#error-msg');
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
























