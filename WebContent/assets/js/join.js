/**
 * 
 */

console.log('aaaa');

let $checkMsg = $("#check-id-msg");
let $checkPwMsg = $("#check-pw-msg");

let $idInput =$('#id');
let $pwInput = $("#password");

var test = '';
console.log($checkMsg);

/*blur은 입력을 안하면 이벤트 주는거~*/

$idInput.on('blur', function(){
	if($(this).val() == ''){
		$checkMsg.text('아이디를 제발~입력하시오.');
	} else {
		let id = $idInput.val();
		
		$.ajax({
			url : '/user/checkIdOk.us',
			type : 'get',
			data : {userId : id},
			success : function(result) {
				$checkMsg.text(result);
				test = result;
			},
			error : function(a,b,c) {
				console.log(c);
			}
		});
		
	}
});

// 여기에 비밀번호 이벤트 넣기.
const regex = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*[!@#$%^&*()_+])[a-zA-Z\d!@#$%^&*()_+]{8,}$/;

$pwInput.on('blur', function(){
   if(regex.test(  $(this).val()   )){
      $checkPwMsg.text("사용 가능한 비밀번호입니다.");
   }else{
      $checkPwMsg.html("사용 불가능한 비밀번호입니다. <br>영어, 숫자, 특수문자를 포함하여 8글자 이상 작성하세요!");
   }
});


/*$('form').on('submit', function(e) {
	 e.preventDefault(); //기본 이벤트를 막아주는 명령어

	console.log($('#agree').prop('checked'));
	
	if($('#agree').prop('checked')){
		this.submit(); //서브밋 이벤트를 발생시키는 메소드(폼 요소에 사용해야함)
	} else {
		alert('약관에 동의해주세요');
	}
	
});*/




















