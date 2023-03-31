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

let $pageNum =$('.active').val();

console.log($a);

console.log($pageNum);


/*$a.on('click', function(){
	$.ajax({
	url : '요청 주소',
    type : 'GET',
    data : '전송할 데이터',
    contentType : '전송할 데이터 형식', (getParameter로 할거면 알아서 바꾸기 때문에 생략)
    dataType : '받을 데이터 형식',
    success : function(result){
                  //성공시 수행할 코드
    },
    error : function(xhr, status, error){
              //실패시 수행할 코드
    }
		
	});
});
*/









