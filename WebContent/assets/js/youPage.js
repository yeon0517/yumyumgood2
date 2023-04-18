//팔로우 숫자 늘리기
$('.profile-btn').on('click', '.profile-btn2', function() {
	followAjax();
});
function followAjax() {
	$.ajax({
		url: '/user/youPageLike.us',
		type: 'get',
		data: {
			userNumber: userNumber,
			followNumber: followNumber
		},
		success: function(result) {
			showFollow(result);


		},
		error: (xhr, status, error) => console.log(error),
	});
}

function showFollow(result) {
	let results = result.trim().split(",");
	let followTF = results[0];
	let followCount = parseInt(results[1]);

	console.log(followTF);

	if (followTF === "true") {

		$('.profile-btn2').html(
			`
		 <i class="fas fa-user-plus like-t js-like-btn"
          style="color: red;"></i>
			`
		)
	} else if (followTF === "false") {
		$('.profile-btn2').html(
			`<i class="far fa-user-plus like-f js-like-btn"></i>
			`
		)
	}

	$('.cnt').text(followCount);

}
//===================##===================




// 모달 열기 함수
// 팔로워 모달창
function openModal() {
	console.log("click");
	document.getElementById("myModal").style.display = "block";
}

// 모달 닫기 함수
function closeModal() {
	document.getElementById("myModal").style.display = "none";
}

// 모달 닫기 버튼에 클릭 이벤트 추가
document.querySelector(".close").addEventListener("click", closeModal);

// 모달 창 외부를 클릭하면 모달 창이 닫히도록 추가
window.addEventListener("click", function(event) {
	if (event.target == document.getElementById("myModal")) {
		closeModal();
	}
});

// 팔로잉 모달창
// 모달 열기 함수
function openModal2() {
	console.log("click");
	document.getElementById("myModal2").style.display = "block";
}

// 모달 닫기 함수
function closeModal2() {
	document.getElementById("myModal2").style.display = "none";
}

// 모달 닫기 버튼에 클릭 이벤트 추가
document.querySelector(".close2").addEventListener("click", closeModal2);

// 모달 창 외부를 클릭하면 모달 창이 닫히도록 추가
window.addEventListener("click", function(event) {
	if (event.target == document.getElementById("myModal2")) {
		closeModal();
	}
});
