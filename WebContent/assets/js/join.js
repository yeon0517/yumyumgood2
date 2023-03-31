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




















