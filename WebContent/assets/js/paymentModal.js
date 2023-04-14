/*function show () {
  document.querySelector(".background").className = "background show";
}

function close () { 
  document.querySelector(".background").className = "background";
}

document.querySelector("#show").addEventListener('click', show);
document.querySelector("#close").addEventListener('click', close);

*/
//=========세트수량 카운터===========
/*let container = document.querySelector('#container');
const plusBtn = container.querySelector('#plus');
const minusBtn = container.querySelector('#minus');
const number = container.querySelector('span');
const reset = container.querySelector('#reset');

plusBtn.addEventListener('click', function() {
	let count = Number(number.textContent)
	count = count + 1;
	number.textContent = count;
});
minusBtn.addEventListener('click', function() {
	let count = Number(number.textContent)
	
	if(count > 1){
	count = count - 1;
	number.textContent = count;
}
});
reset.addEventListener('click', function() {
	let count = Number(number.textContent)
	count = 0;
	number.textContent = count;
});
*/



// 여기는 가격이 바로 꽂히게 하는 




//totalPrice(); //반드시 실행시켜야 하기때문.

/*function totalPrice() {

	let checkbox = $(".amount-input").val();

	console.log(checkbox);
	// name이 같은 체크박스의 값들을 배열에 담는다.
	let checkboxValues = [];
	$("input[name='amountInput']").each(function() {
		checkboxValues.push($(this).val());
	});
	/*"input[name='amountInput']:checked"*/
	/*console.log(checkboxValues);


	$.ajax({
		url: '/order/orderTotalPriceOk.or',
		type: 'POST',
		data: { checkboxValues: checkboxValues },
		dataType: '',
		success: function(result) {
			//성공시 수행할 코드
		},
		error: function(xhr, status, error) {
			//실패시 수행할 코드
		}
	});*/

/*}*/



/*let postNumber =*/

/*$('input[type="checkbox"]:checked').on('change', function() {
	let meet = $(".amount-input");

		
	if (this.checked) {
		console.log('체크')
		console.log(meet)
		

	} else {
		console.log('체크 풀림')
	}

});*/





/*var oidObj = $("input[name=amountInput]:checked");
var selectedPartOid = oidObj.val();

		$.each(oidObj, function(idx) {

			if ($price.eq(idx).prop("checked") == true) {
				console.log($("input[name=price]"))
			}
		});*/
		
		
// 체크박스에 체크 된 애들의 가격을 화면에 뿌려주기

/*$('.footer').on('change', function(){
	let $checkList = $('.amount-input:checked');
	let totalPrice = 0;
		
	console.log($checkList);
	
	for(let i=0; i<$checkList.length; i++){
		let price = $checkList.eq(i).closest('.amount-box').find('.price').val();
		totalPrice += parseInt(price);  parseInt는 문자열을 int로 바꾸는..
	}
	console.log(totalPrice);
	$('.result-price').text(totalPrice).append('원');

});*/


function updateTotalPrice() {
  let $checkList = $('.amount-input:checked');
  let totalPrice = 0;
  let quantity = parseInt($('#counter-number').text());

  for (let i = 0; i < $checkList.length; i++) {
    let price = $checkList.eq(i).closest('.amount-box').find('.price').val();
    totalPrice += parseInt(price);
  }

  totalPrice *= quantity;
  $('.result-price').html(totalPrice + '원'+
		`
		<input type="hidden" value="${totalPrice}" name="totalPrice" class="total-price" >
		`
	);
}

$('.footer').on('change', function() {
  updateTotalPrice();
});

$('#plus').on('click', function() {
  let currentVal = parseInt($('#counter-number').text());
  $('#counter-number').text(currentVal + 1);
  updateTotalPrice(); // 수량이 변경될 때마다 총 가격을 다시 계산하고 출력함
});

$('#minus').on('click', function() {
  let currentVal = parseInt($('#counter-number').text());
  if (currentVal > 1) {
    $('#counter-number').text(currentVal - 1);
    updateTotalPrice();
  }
});

$('#reset').on('click', function() {
  $('#counter-number').text('1');
  updateTotalPrice();
});














