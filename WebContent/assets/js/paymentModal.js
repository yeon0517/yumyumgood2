function show () {
  document.querySelector(".background").className = "background show";
}

function close () { 
  document.querySelector(".background").className = "background";
}

document.querySelector("#show").addEventListener('click', show);
document.querySelector("#close").addEventListener('click', close);


//=========세트수량 카운터===========
let container = document.querySelector('#container');
const plusBtn = container.querySelector('#plus');
const minusBtn = container.querySelector('#minus');
const number = container.querySelector('span');
const reset = container.querySelector('#reset');

plusBtn.addEventListener('click',function(){
   let count = Number(number.textContent)
    count = count + 1;
    number.textContent = count;
});
minusBtn.addEventListener('click',function(){
   let count = Number(number.textContent)
    count = count - 1;
    number.textContent = count;
});
reset.addEventListener('click',function(){
   let count = Number(number.textContent)
    count = 0;
    number.textContent = count;
});