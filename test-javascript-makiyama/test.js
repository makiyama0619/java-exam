//問題1
console.log('牧山純');


//問題2
let firstName = 'Makiyama';
let lastName = 'Jun';
console.log(firstName + ' ' + lastName);


//問題3
let subtotal = (200 * 3) + (250 * 4);
let tax = subtotal * 0.1;
let total = subtotal + tax;

console.log("小計");
console.log(subtotal + '円');
console.log("消費税");
console.log(tax + '円');
console.log("合計金額");
console.log(total + '円');


//問題4
let testScore = 48;
if(testScore >= 0 && testScore <= 79){
    console.log('追試です');
}else if(testScore >= 80 && testScore <= 100){
    console.log('合格です');
}else{
    console.log('存在しない点数です');
}


//問題5
let ansewer = 0;
for (let i = 1; i <= 100; i++) {
    ansewer = ansewer + i;
}
console.log(ansewer);


//問題6
function add(a, b) {
    return a + b;
}
function sub(a, b) {
    return a - b;
}
function mul(a, b) {
    return a * b;
}
function div(a, b) {
    return a / b;
}

const num1 = 5;
const num2 = 3;

console.log('5 + 3 = ' + add(num1,num2));
console.log('5 - 3 = ' + sub(num1,num2));
console.log('5 * 3 = ' + mul(num1,num2));
console.log('5 / 3 = ' + div(num1,num2));
