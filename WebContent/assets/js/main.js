// 여기서부터
// 검색창
let $search = $(".find2");
$search.click(() => {
	console.log("click");

	$(".sub-find").toggleClass("sub-find__close");
	// $(".sub-find").stop().animate({ left: "toggle" });
});

$(function() {
	$(".left_sub_menu").hide();
	$(".has_sub").click(function() {
		$(".left_sub_menu").fadeToggle(300);
	});
	// 왼쪽메뉴 드롭다운
	$(".sub_menu ul.small_menu").hide();
	$(".sub_menu ul.big_menu").click(function() {
		$("ul", this).slideToggle(300);
	});
	// 외부 클릭 시 좌측 사이드 메뉴 숨기기
	$(".overlay").on("click", function() {
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

$(function() {
	$(".left_sub_menu").hide();
	$(".has_sub").click(function() {
		$(".left_sub_menu").fadeToggle(300);
	});
	// 왼쪽메뉴 드롭다운
	$(".sub_menu ul.small_menu").hide();
	$(".sub_menu ul.big_menu").click(function() {
		$("ul", this).slideToggle(300);
	});
	// 외부 클릭 시 좌측 사이드 메뉴 숨기기
	$(".overlay").on("click", function() {
		$(".left_sub_menu").fadeOut();
		$(".hide_sidemenu").fadeIn();
	});
});

// 여기까지

// ================================================검색 Ajax==================================================== //

/*function searchUser() {
  // 검색어 가져오기
  var findUser = document.getElementById("search-input").value;
  if (findUser.trim() == "") return;*/


/*let findUrl = '';*/
$('.search-btn').on('click', function() {
	let searchCate = $('.drop-down').val();

	if (searchCate == 'user') {
		$.ajax({
			url: '/mainAjaxOk.m',
			type: 'get',
			data: { input: $('.find-btn').val().trim() },
			dataType: 'json',
			success: function(result) {
				console.log(result);
				addUserInfo(result);
				//$('.find-btn').val('');
			},
			error: function(a, b, c) {
				console.log(c);
			}
		});
	} else {
		findPost($('.find-btn').val().trim());
	}
});
// ================================================검색 Ajax==================================================== //

function findPost(keyword) {
	let form = document.createElement('form');
	form.setAttribute('charset', 'utf-8');
	form.setAttribute('method', 'get');
	form.setAttribute('action', '/mainSearch.m');

	var hiddenField = document.createElement("input");
	hiddenField.setAttribute("type", "hidden");
	hiddenField.setAttribute("name", "keyword");
	hiddenField.setAttribute("value", keyword);
	form.appendChild(hiddenField);
	
	document.body.appendChild(form);
	form.submit();
}

/* $( document ).ready( function() {
    var hClass = $( 'h1' ).attr( 'class' );
    $( 'span' ).text( hClass );
   } );
*/
/*온클릭 속성을 삭제*/
/*$("").removeAttr("onclick"); 
*/
/*온클릭 속성을 다시 부여*/
/*$("").attr("onclick", 주소?)

속성값 추가
$$( '.direction' ).attr( href, '${pageContext.request.contextPath}/mainSearch.m?page=${startPage - 1}' );

$('.content').hide();*/
/*클릭 이벤트*/

/*검색 페이징 처리 -> 키워드가 있는지 없는지 검사 -> 메인 페이지로 이동할 때 키워드를 들고온게 있는지 없는 지 검사
empty 키워드 
*/

/*$('.search-btn').click(function(){
  $( '.paging-button' ).attr( 'href', '${pageContext.request.contextPath}/mainSearch.m?page=${startPage - 1}' );
});*/



function addUserInfo(result) {
	
	
	let text = '';

	result.forEach(info => {
		text += `
			<div class="search-man">
				<div class="man-left">
					<a href="#"> <img
						src="" alt="#"
						class="man-img" /> <!-- </a> -->
					</a>
				</div>
				<div class="man-right">
					<div class="man-id">
						<a href="#"> ${info.userNickName} </a>
						<!-- <a href="#" class="man-id2">hot_boy</a> -->
					</div>
					<div class="man-name">
						${info.userName}
					</div>
				</div>
				
			</div>
		`;
	});

	$('.recent-searches-box').html(text);
}


/* 검색한 회원 옆에 삭제 버튼 마지막 </div> 바로 위에 복사
<div class="delete-btn">
					<div class="delete-btn2">
						<button class="alarm-btn">삭제</button>
					</div>
				</div>*/









