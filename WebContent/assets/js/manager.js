let manageMember = document.querySelector(".memberM");
console.log(manageMember);

manageMember.addEventListener("click", function () {
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

managePost.addEventListener("click", function () {
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
managePay.addEventListener("click", function () {
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

chartTest.addEventListener("click", function () {
  let chartTest = document.querySelector("#myChart");
  console.dir(chartTest.style.display);
  if (chartTest.style.display == "block") {
  } else {
    chartTest.style.display = "block";
  }
});

let chartCata = document.querySelector(".chart");
console.log(chartCata);

chartCata.addEventListener("click", function () {
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



$a.on('click', function(e){
	e.preventDefault();
	let page = $(this).text().trim();
	
	console.log(page);
	
	$.ajax({
	url : '/manager/managerListRest.manager',
    type : 'GET',
    data : page,
	dataType : 'json',
    success : function(result){
        console.log('성공!!');
		console.log(result);
    },
    error : function(xhr, status, error){
              //실패시 수행할 코드
    }
		
	});
});










