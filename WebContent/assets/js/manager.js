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

let searchMode = false;

function updatePage(page) {
	if (searchMode) {
		let userIdOrName = $('#user-serch').val();
		$.ajax({
			url: '/manager/userSerch.manager',
			type: 'GET',
			data: { userIdOrName: userIdOrName, page: page },
			dataType: 'json',
			success: updateTable,
			error: (xhr, status, error) => console.log(error),
		});
	} else {
		$.ajax({
			url: "/manager/managerListRest.manager",
			type: "GET",
			data: { page: page },
			dataType: "json",
			success: updateTable,
			error: (xhr, status, error) => console.log(error),
		});
	}
}

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

// 초기 페이지네이션 링크에 클릭 이벤트 리스너를 추가
$(".user-page a").on("click", function(e) {
	e.preventDefault();
	updatePage($(this).text().trim());
});

$('.user-serch-btn').on('click', function() {
	let userIdOrName = $('#user-serch').val();
	let gapCheck = $('#user-serch').val().trim();
	console.log(userIdOrName);

	if (gapCheck === '' || gapCheck.length === 0) {
		searchMode = false;
		updatePage(1);
	} else {
		searchMode = true;
		updatePage(1);
	}
});


// 게시물 리스트부분
let postSearchMode = false;

function updatePostPage(postPage) {
	if (postSearchMode) {
		let postSearch = $('#post-search').val();
		$.ajax({
			url: '/manager/postSearch.manager',
			type: 'GET',
			data: { postSearch: postSearch, postPage: postPage },
			dataType: 'json',
			success: updatePostTable,
			error: (xhr, status, error) => console.log(error),
		});
	} else {
		$.ajax({
			url: "/manager/managerPostOk.manager",
			type: "GET",
			data: { postPage: postPage },
			dataType: "json",
			success: updatePostTable,
			error: (xhr, status, error) => console.log(error),
		});
	}
}

function updatePostTable(postResult) {
	$(".post-table tbody tr:not(:first)").remove();

	postResult.posts.forEach((post) => {
		$(".post-table tbody").append(`
      <tr>
        <td class="post-number">${post.postNumber}</td>
        <td class="post-title"><a href="#">${post.postTitle}</a></td>
        <td class="post-user-Id"><a href="#">${post.userId}</a></td>
        <td class="post-view-count">${post.postViewCount}</td>
        <td class="post-date">${post.postDate}</td>
		<td><a href="#">수정</a></td>
        <td><div class="checkbox-c"><a href="#"><input type="checkbox" name="post" class="post-check-box" value="${post.postNumber}" /></a></div></td>
      </tr>`);
	});

	$(".post-page ul").html(`
    	${postResult.postPrev ? `<li><a href="#" data-postPage="${postResult.postStartPage - 1}" class="prev">&lt;</a></li>` : ""}
    	${Array.from({ length: postResult.postEndPage - postResult.postStartPage + 1 }, (_, j) => j + postResult.postStartPage).map(j => `<li><a href="#" data-postPage="${j}"${j === postResult.postPage ? ' class="active"' : ""}>${j}</a></li>`).join('')}
    	${postResult.postNext ? `<li><a href="#" data-postPage="${postResult.postEndPage + 1}" class="next">&gt;</a></li>` : ""}`);

	$(".post-page a").off("click").on("click", function(e) {
		e.preventDefault();
		updatePostPage($(this).data("postPage"));
	});
	
}


$(".post-page a").on("click", function(e) {
	e.preventDefault();
	updatePostPage($(this).text().trim());
});

$('.post-serch button').on('click', function() {
	let postSearch = $('#post-search').val();
	let gapCheck = $('#post-search').val().trim();

	if (gapCheck === '' || gapCheck.length === 0) {
		postSearchMode = false;
		updatePostPage(1);
	} else {
		postSearchMode = true;
		updatePostPage(1);
	}
});



