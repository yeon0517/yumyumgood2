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
