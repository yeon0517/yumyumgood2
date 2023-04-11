// 모달 열기 함수
function openModal() {
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

// 소개글 아래에 숫자 늘어나는거
const myTextarea = document.getElementById("myTextarea");
const charCount = document.getElementById("charCount");

myTextarea.addEventListener("input", function () {
  const currentLength = myTextarea.value.length;
  const maxLength = myTextarea.getAttribute("maxlength");
  charCount.textContent = currentLength + " / " + maxLength;
});


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



// 이미지 선택 시 실행되는 메소드
function onFileInputChange(e) {
    var files = e.target.files;
    readImages(files);
}

// 이미지 읽기 메소드
function readImages(files) {
    for (var i = 0; i < files.length; i++) {
        if (files[i].type.startsWith("image/")) {
            var reader = new FileReader();
            reader.readAsDataURL(files[i]);
            reader.onload = (function (theFile) {
                return function (e) {
                    images.push(e.target.result);
                    updateImagePreview();
                };
            })(files[i]);
        }
}
}