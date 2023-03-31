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

let $a = $('.user-page a');


console.log($a);



// Replace the existing event listener for pagination
$a.on("click", function(e) {
	e.preventDefault();
	let page = $(this).text().trim();
	console.log(page);

	// Fetch data for the selected page
	$.ajax({
		url: "/manager/managerListRest.manager",
		type: "GET",
		data: { page: page },
		dataType: "json",
		success: function(result) {
			console.log("성공!!");
			console.log(result);

			// Update the user list with new data
			updateUserList(result);
		},
		error: function(xhr, status, error) {
			console.log(error);
		},
	});
});

// Function to update the user list
function updateUserList(result) {
	// Clear the existing user list
	$(".member-table tbody tr:not(:first)").remove();

	// Loop through the users and add them to the table
	result.users.forEach((user) => {
		let userRow = `
      <tr>
        <td class="user-number">${user.userNumber}</td>
        <td class="user-Id"><a href="#">${user.userId}</a></td>
        <td class="user-name"><a href="#">${user.userName}</a></td>
        <td class="user-email">${user.userEmail}</td>
        <td class="user-phone-number">${user.userPhoneNumber}</td>
        <td class="user-gender">${user.userGender}</td>
        <td class="user-status">${user.userStatus}</td>
        <td><a href="#">수정</a></td>
        <td>
          <div class="checkbox-c">
            <a href="#"><input type="checkbox" name="user" class="user-check-box" value="${user.userNumber}" /></a>
          </div>
        </td>
      </tr>`;

		$(".member-table tbody").append(userRow);
	});

	// Update the pagination links
	let paginationHtml = "";
	if (result.prev) {
		paginationHtml += `<li><a href="#" data-page="${result.startPage - 1}" class="prev">&lt;</a></li>`;
	}

	for (let i = result.startPage; i <= result.endPage; i++) {
		paginationHtml += `<li><a href="#" data-page="${i}"${i === result.page ? ' class="active"' : ""}>${i}</a></li>`;
	}

	if (result.next) {
		paginationHtml += `<li><a href="#" data-page="${result.endPage + 1}" class="next">&gt;</a></li>`;
	}

	$(".user-page ul").html(paginationHtml);

	// Update the event listener for the new pagination links
	$a = $(".user-page a");
	$a.off("click").on("click", function(e) {
		e.preventDefault();
		let page = $(this).data("page");
		console.log(page);

		// Fetch data for the selected page
		$.ajax({
			url: "/manager/managerListRest.manager",
			type: "GET",
			data: { page: page },
			dataType: "json",
			success: function(result) {
				console.log("성공!!");
				console.log(result);

				// Update the user list with new data
				updateUserList(result);
			},
			error: function(xhr, status, error) {
				console.log(error);
			},
		});
	});

}



