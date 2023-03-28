$(".que").click(function() {
  $(this).next(".anw").stop().slideToggle(300);
 $(this).toggleClass('on').siblings().removeClass('on');
 $(this).next(".anw").siblings(".anw").slideUp(300); // 1개씩 펼치기
});


$(".pmt").click(function() {
  $(this).next(".amt").stop().slideToggle(300);
 $(this).toggleClass('on').siblings().removeClass('on');
 $(this).next(".amt").siblings(".amt").slideUp(300); // 1개씩 펼치기
});
