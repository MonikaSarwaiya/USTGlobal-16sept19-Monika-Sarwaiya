console.log('Circumference of a circle');
//Circumference of a circle
//Named Function
function circum(b){
    var c = 2*3.14*b;
    return c;
}
console.log('By Named Function = ',circum(3));
console.log('========');
//Expression Function
var e = function (b1){
    var c1 = 2*3.14*b1;
    return c1;
}
console.log('By Expression Function = ',e(3));
console.log('========');
//Fat Arrow Function
var e1 = (b2) => 
console.log('By Fat Arrow Function = ',2*3.14*b2);
e1(5);
console.log('========');
//Self Invoking Function
(function (b3){
    console.log('By Self Invoking Function = ',2*3.14*b3);
})(6);
console.log('==============')