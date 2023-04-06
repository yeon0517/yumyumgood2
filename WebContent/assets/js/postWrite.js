/**
 * 
 */

// 카테고리 선택시(체크박스) 스타일변경으로 표시
$(document).ready(function () {
    $('.category').on('click', function () {
        if ($(this).is(':checked')) {
            $(this)
                .closest('.category-list')
                .css('background-color', 'rgba(120, 119, 119, 0.9)');
            $(this)
                .closest('.category-list')
                .css('color', 'white');
        } else {
            $(this)
                .closest('.category-list')
                .css('background-color', 'transparent');
            $(this)
                .closest('.category-list')
                .css('color', 'rgb(62, 62, 62)');
        }
    });
});

//파일이 추가되면 미리보기 띄우기
const $fileInput = $(".file-input");
const $imageUploadWrap = $(".image-upload-wrap");
const $imagePreviewWrap = $(".image-preview-wrap");
const $previewImage = $(".preview-image");
const $nextButton = $(".wirte-box-imgs-next button");
const $prevButton = $(".wirte-box-imgs-prev button");
const $shareButton = $(".share-button");
const $form = $(".writet-box-form");

let images = [];
let currentIndex = 0;

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

// 이미지 미리보기 업데이트 메소드
function updateImagePreview() {
    $imageUploadWrap.css("display", "none");
    $imagePreviewWrap.css("display", "flex");
    $previewImage.attr("src", images[currentIndex]);
    $prevButton.css(
        "display",
        currentIndex === 0
            ? "none"
            : "block"
    );
    $nextButton.css(
        "display",
        currentIndex === images.length - 1
            ? "none"
            : "block"
    );
}

// 미리보기 이미지 삭제 메소드
function deleteImage(index) {
    images.splice(index, 1);

    if (images.length === 0) {
        $imageUploadWrap.css("display", "flex");
        $imagePreviewWrap.css("display", "none");
    } else {
        currentIndex = Math.max(0, Math.min(currentIndex, images.length - 1));
        updateImagePreview();
    }
}

// 체크박스가 선택되어있는지 여부 확인 메소드
function noneChecked() {
    let noneChecked = true;
    $('.category').each(function () {
        if ($(this).is(':checked')) {
            noneChecked = false;
            return false;
        }
    });

    return noneChecked;
}

// 이벤트 리스너 설정 메소드
function setupEventListeners() {
    $fileInput.on("change", onFileInputChange);

    $nextButton.on("click", function () {
        if (currentIndex < images.length - 1) {
            currentIndex++;
            updateImagePreview();
        }
    });

    $prevButton.on("click", function () {
        if (currentIndex > 0) {
            currentIndex--;
            updateImagePreview();
        }
    });

    $shareButton.on("click", function (event) {

        let hasEmptyInput = false;
        $('input[type="text"]').each(function () {
            if ($(this).val().trim() === '') {
                hasEmptyInput = true;
                return false;
            }
        });

        if (hasEmptyInput) {
            event.preventDefault();
            alert('내용을 모두 작성해 주세요!');
        } else if (images.length === 0) {
            event.preventDefault();
            alert("사진을 추가해주세요!!");
        } else if (noneChecked()) {
            event.preventDefault();
            alert("카테고리를 추가해주세요!");
        }

    });

    $(document).on("click", ".img-cancel-btn", function () {
        deleteImage(currentIndex);
    });
}

$(document).ready(function () {
    setupEventListeners();
});

//취소 버튼 처리 (작성하기 직전 화면으로)
$('.cancel-btn').on('click', () => {
    window.location.href = '#';
});

// 재료추가
$(document).ready(function () {
    function toggleMinusButtonVisibility() {
        $('.ingredient-element .element-minus').toggle(
            $('.ingredient-element').length > 1
        );
    }

    toggleMinusButtonVisibility();

    // 요소 플러스 버튼에 대한 이벤트 위임
    $('.ingredient-wrap').on('click', '.element-plus', function () {
        const ingredientElement = $(
            `
      <div class="ingredient-element">
        <li class="ingredient-name-li">
          <input type="text" name="ingredientName" class="ingredient-name" placeholder="재료이름 예)양배추 ">
        </li>

        <li class="ingredient-quantity-li">
          <input type="text" name="ingredientQuantity" class="ingredient-quantity" placeholder="재료 양 예) 1/2개">
        </li>

        <div class="element-edit-buttons">
          <button type="button" class="element-plus">
            <i class="fa-solid fa-circle-plus"></i>
          </button>

          <button type="button" class="element-minus">
            <i class="fa-solid fa-circle-minus"></i>
          </button>
        </div>
      </div>`
        );

        $(this)
            .closest('.ingredient-element')
            .after(ingredientElement);

        toggleMinusButtonVisibility();
    });

    // 재료 묶음 추가 요소 삭제 버튼에 대한 이벤트 위임
    $('.ingredient-wrap').on('click', '.element-minus', function () {
        $(this)
            .closest('.ingredient-element')
            .remove();
        toggleMinusButtonVisibility();
    });
});

$(document).ready(function () {
    updateItemMinusVisibility();

    // 이벤트 위임을 사용하여 새로운 재료 항목 추가
    $('.item-edit-buttons').on('click', '.item-plus', function () {
        const newItem = $('.ingredient-item')
            .first()
            .clone();
        newItem
            .find('input[type="text"]')
            .val(''); // Clear input values
        $('.ingredient-items-container').append(newItem);
        updateItemMinusVisibility();
    });

    // 이벤트 위임을 사용하여 재료 항목 제거
    $('.item-edit-buttons').on('click', '.item-minus', function () {
        $('.ingredient-item')
            .last()
            .remove();
        updateItemMinusVisibility();
    });

    function updateItemMinusVisibility() {
        const itemCount = $('.ingredient-item').length;
        if (itemCount === 1) {
            $('.item-minus').hide();
        } else {
            $('.item-minus').show();
        }
    }
});






