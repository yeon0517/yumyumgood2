let manageMember = document.querySelector(".memberM");
console.log(manageMember);

manageMember.addEventListener("click", function() {
	let memberMenu = document.querySelector("#member-Menu");

	let isTrue = memberMenu.style.display == "block";

	hidden();
	console.log(isTrue);
	if (isTrue) {
		$(".chart").show();
	} else {
		memberMenu.style.display = "block";
	}
});

let managePost = document.querySelector(".memberPost");

managePost.addEventListener("click", function() {
	let memberPost = document.querySelector("#member-post");
	let isTrue = memberPost.style.display == "block";
	hidden();
	if (isTrue) {
		$(".chart").show();
	} else {
		memberPost.style.display = "block";
	}
});

let managePay = document.querySelector(".memberPay");
managePay.addEventListener("click", function() {
	let memberPay = document.querySelector("#member-payment");
	let isTrue = memberPay.style.display == "block";
	hidden();
	if (isTrue) {
		$(".chart").show();
	} else {
		memberPay.style.display = "block";
	}
});

function hidden() {
	let $test = $(".test");
	$(".chart").hide();
	$test.hide();
}

let chartTest = document.querySelector(".chart");
console.log(chartTest);

chartTest.addEventListener("click", function() {
	let chartTest = document.querySelector("#myChart");
	console.dir(chartTest.style.display);
	if (chartTest.style.display == "block") {
	} else {
		chartTest.style.display = "block";
	}
});

let chartCata = document.querySelector(".chart");
console.log(chartCata);

chartCata.addEventListener("click", function() {
	let chartTestA = document.querySelector("#mycate");
	console.dir(chartTestA.style.display);
	if (chartTestA.style.display == "block") {
	} else {
		chartTestA.style.display = "block";
	}
});



//==========================
const chartData = [
	{ x: 10, y: 20, r: 5 },
	{ x: 20, y: 30, r: 10 },
	{ x: 30, y: 10, r: 15 },
	{ x: 40, y: 50, r: 20 },
	{ x: 50, y: 40, r: 25 },
];


// 사용자 목록과 페이지네이션을 업데이트하는 함수
function updateTable(result) {
	// 기존 사용자 목록을 지우기
	$(".member-table tbody tr:not(:first)").remove();

	// 사용자 데이터로 새로운 행을 추가
	result.users.forEach((user) => {
		$(".member-table tbody").append(`
      <tr>
        <td class="user-number">${user.userNumber}</td>
        <td class="user-Id"><a href="#">${user.userId}</a></td>
        <td class="user-name"><a href="#">${user.userName}</a></td>
        <td class="user-email">${user.userEmail}</td>
        <td class="user-phone-number">${user.userPhoneNumber}</td>
        <td class="user-gender">${user.userGender}</td>
        <td class="user-status">${user.userStatus}</td>
        <td><a href="#">수정</a></td>
        <td><div class="checkbox-c"><a href="#"><input type="checkbox" name="user" class="user-check-box" value="${user.userNumber}" /></a></div></td>
      </tr>`);
	});

	// 페이지네이션 링크를 생성하고 업데이트
	$(".user-page ul").html(`
    ${result.prev ? `<li><a href="#" data-page="${result.startPage - 1}" class="prev">&lt;</a></li>` : ""}
    ${Array.from({ length: result.endPage - result.startPage + 1 }, (_, i) => i + result.startPage).map(i => `<li><a href="#" data-page="${i}"${i === result.page ? ' class="active"' : ""}>${i}</a></li>`).join('')}
    ${result.next ? `<li><a href="#" data-page="${result.endPage + 1}" class="next">&gt;</a></li>` : ""}`);

	// 새 페이지네이션 링크에 이벤트 리스너를 업데이트
	$(".user-page a").off("click").on("click", function(e) {
		e.preventDefault();
		updatePage($(this).data("page"));
	});
}

// 페이지 업데이트를 위한 AJAX 요청을 수행하는 함수
function updatePage(page) {
	$.ajax({
		url: "/manager/managerListRest.manager",
		type: "GET",
		data: { page: page },
		dataType: "json",
		success: updateTable,
		error: (xhr, status, error) => console.log(error),
	});
}

// 초기 페이지네이션 링크에 클릭 이벤트 리스너를 추가
$(".user-page a").on("click", function(e) {
	e.preventDefault();
	updatePage($(this).text().trim());
});



$('.user-serch-btn').on('click', function() {
	let userIdOrName = $('#user-serch').val();
	console.log(userInfo);
	
	$.ajax({
		url: '/manager/userSerch.manager',
		type: 'POST',
		data: { userIdOrName: userIdOrName },
		dataType: 'json',
		success: updateTable,
		error: (xhr, status, error) => console.log(error),
	});



});























