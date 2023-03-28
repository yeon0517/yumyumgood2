/**
 * 
 */

$(document).ready(function () {
  const $ingredientBtn = $('.ingredient-btn');
  const $recipeBtn = $('.recipe-btn');
  const $commentBtn = $('.comment-btn');

  const $ingredientBox = $('.ingredient-box');
  const $recipeContainer = $('.recipe-container');
  const $readCommentContainer = $('.read-comment-container');


  // 모든 게시물 내용 영역을 숨기는 함수
  function hideAllContents() {
    $('.js-contents').hide();
  }

  // 재료 보기 버튼 클릭 시 재료 내용 영역을 보여주는 이벤트 핸들러 등록
  $ingredientBtn.on('click', function () {
    hideAllContents();
    $ingredientBox.show();
  });

  // 레시피 보기 버튼 클릭 시 레시피 내용 영역을 보여주는 이벤트 핸들러 등록
  $recipeBtn.on('click', function () {
    hideAllContents();
    $recipeContainer.show();
  });

  // 댓글 보기 버튼 클릭 시 댓글 내용 영역을 보여주는 이벤트 핸들러 등록
  $commentBtn.on('click', function () {
    hideAllContents();
    $readCommentContainer.show();
  });
});



$(document).ready(function () {
  $('.like-btn').on('click', function () {
    const $likeBtn = $(this);
    const $likeBtnIconF = $likeBtn.find('.fa-regular.fa-heart');
    const $likeBtnIconT = $likeBtn.find('.fa-solid.fa-heart');
    
    if ($likeBtnIconF.is(':visible')) {
      $likeBtnIconF.css('display', 'none');
      $likeBtnIconT.css('display', 'block');
    } else {
      $likeBtnIconT.css('display', 'none');
      $likeBtnIconF.css('display', 'block');
    }
  });
});
