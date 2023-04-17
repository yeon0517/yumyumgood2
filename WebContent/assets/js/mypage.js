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
window.addEventListener("click", function (event) {
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
window.addEventListener("click", function (event) {
  if (event.target == document.getElementById("myModal2")) {
    closeModal();
  }
});

// click 이벤트(게시물)
let manageMember = document.querySelector("#post1");
console.log(manageMember);

manageMember.addEventListener("click", function () {
  let memberMenu = document.querySelector("#bottom1");

  let isTrue = memberMenu.style.display == "block";

  hidden();
  active(this);
  if (isTrue) {
    $("#post1").show();
  } else {
    memberMenu.style.display = "block";
  }
});

function postListTable(result){
	console.log(result);
	$(".main-bottom test").html('');
	let text = '';
	for (let i = 0; i < result.list.length; i++) {


			if (i % 3 == 0) {
			text += (`	<div class="ccc">`)
			}

			text += (`
						<div class="bbb">
							<a href="#" class="go-post"> <img
								src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQSZRRqahUJnD6Ve1RMCmiHe4ABs5mUBJ33wg&usqp=CAU"
								class="thumbnail-img" />
							</a>
						</div>
							
							
							

		`);


			if (i % 3 == 2) {
				text += (`
				</div>
			`);
			}

			$(".main-bottom test").html(text);
	}

}

let thisPage = 1;
let realEndPage = $('.realEndPage').val();


$('.paging-btn next').on('click', function() {
	console.log('!!!!2343241342423!');

	if (thisPage != realEndPage) {


		$.ajax({
			url: '/mypage/mypageListOk.my',
			
			data: { page: thisPage + 1 },
			success: function(result) {
				postListTable(result);
				thisPage = result.page;
				console.log(thisPage);
			}
		});

	}

});



$('.paging-btn prev').on('click', function() {
	console.log('!!!!!');

	if (thisPage != 1) {

		$.ajax({
			url: '/mypage/mypageListOk.my',
			data: { page: thisPage - 1 },
			success: function(result) {
				postListTable(result);
				thisPage = result.page;
				console.log(thisPage);
			}
		});

	}

});


// click 이벤트(구매내역)
let managePost = document.querySelector("#post2");

managePost.addEventListener("click", function () {
  let memberPost = document.querySelector("#bottom2");
  let isTrue = memberPost.style.display == "block";
  hidden();
  active(this);
  if (isTrue) {
    $("#post2").show();
  } else {
    memberPost.style.display = "block";
  }
});

// click 이벤트(찜한레시피)
let managePay = document.querySelector("#post3");
managePay.addEventListener("click", function () {
  let memberPay = document.querySelector("#bottom3");
  let isTrue = memberPay.style.display == "block";
  hidden();
  active(this);
  if (isTrue) {
    $("#post3").show();
  } else {
    memberPay.style.display = "block";
  }
});

// 히든 주기
function hidden() {
  let $test = $(".test");
  $("#bottom1").hide();
  $test.hide();
}

// banner에 클릭 이벤트
// 클릭시 글 위에 border 생성
function active(target) {
  $("#post1").removeClass("active-banner");
  $("#post2").removeClass("active-banner");
  $("#post3").removeClass("active-banner");

  $(target).addClass("active-banner");
}

// 여기서부터
// 검색창
let $search = $(".find2");
$search.click(() => {
  console.log("click");

  $(".sub-find").toggleClass("sub-find__close");
  // $(".sub-find").stop().animate({ left: "toggle" });
});

$(function () {
  $(".left_sub_menu").hide();
  $(".has_sub").click(function () {
    $(".left_sub_menu").fadeToggle(300);
  });
  // 왼쪽메뉴 드롭다운
  $(".sub_menu ul.small_menu").hide();
  $(".sub_menu ul.big_menu").click(function () {
    $("ul", this).slideToggle(300);
  });
  // 외부 클릭 시 좌측 사이드 메뉴 숨기기
  $(".overlay").on("click", function () {
    $(".left_sub_menu").fadeOut();
    $(".hide_sidemenu").fadeIn();
  });
});

// 알림창
let $search2 = $(".alarmm");
$search2.click(() => {
  console.log("click");

  $(".sub-find2").toggleClass("sub-find2__close");
  // $(".sub-find").stop().animate({ left: "toggle" });
});

$(function () {
  $(".left_sub_menu").hide();
  $(".has_sub").click(function () {
    $(".left_sub_menu").fadeToggle(300);
  });
  // 왼쪽메뉴 드롭다운
  $(".sub_menu ul.small_menu").hide();
  $(".sub_menu ul.big_menu").click(function () {
    $("ul", this).slideToggle(300);
  });
  // 외부 클릭 시 좌측 사이드 메뉴 숨기기
  $(".overlay").on("click", function () {
    $(".left_sub_menu").fadeOut();
    $(".hide_sidemenu").fadeIn();
  });
});

// 여기까지


// postList 페이징 처리




















































































