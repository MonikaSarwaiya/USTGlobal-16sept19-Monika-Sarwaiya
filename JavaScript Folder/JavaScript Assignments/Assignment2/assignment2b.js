console.log('Fibonacci Series')
//Fibonacci Series
//By Named Function
function fab(num){
    var a = 0, a1 = 1, a2 = 0;
    console.log(num);
    for(var i=0;i<num;i++){
        console.log(a);
        a2 = a+a1;
        a = a1;
        a1 = a2;
    }
}
fab(5);
console.log('===========')
//By Expression Function
var x = function(num1){
    var  a = 0, a1 = 1, a2 = 0;
    console.log(a);
    console.log(a1);
    for(var i=0;i<num1;i++){
        a2 = a+a1;
        console.log(a2);
        a = a1;
        a1 = a2;
}
}
x(5);
console.log('===========')
//Fat Arrow Function
var x1 = (num2) => {
    var  a = 0, a1 = 1, a2 = 0;
    console.log(a);
    console.log(a1);
    for(var i=0;i<num2;i++){
        a2 = a+a1;
        console.log(a2);
        a = a1;
        a1 = a2;
}
} 
x1(5);
console.log('===========');
//By Self Invoking Function
(function (num3)
{
    var  a = 0, a1 = 1, a2 = 0;
    console.log(a);
    console.log(a1);
    for(var i=0;i<num3;i++){
        a2 = a+a1;
        console.log(a2);
        a = a1;
        a1 = a2;
}
})
(5);
console.log('===========');