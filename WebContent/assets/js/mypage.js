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
