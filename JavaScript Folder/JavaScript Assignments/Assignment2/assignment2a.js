//Factorial of a number
//Named Function
console.log('Factorial of a number')
function fact(n){
    var fact = 1;
    for(var i=1;i<=n;i++){
        fact = fact*i;
    }
    return fact;
}
var f = fact(5);
console.log("By Named Function Factorial is =",f);
//Expression Function
var f1 = function(n1){
    var fact1 = 1;
    for(var i=1;i<=n1;i++){
        fact1 = fact1*i;
    }
    return fact1;
}
console.log("By Expression Function Factorial is =",f1(4));
//Fat Arrow Function
var f2 = (n2)=> {
    var fact2 = 1;
    for(var i=1;i<=n2;i++){
        fact2 = fact2*i;
    }
    return fact2;
}
console.log("By Fat Arrow Function Factorial is =",f2(3));
//By Self Invoking Function
(function (n3){
  var fact3 = 1;
  for(var i=1;i<=n3;i++){
    fact3 = fact3*i;
}
console.log("By Self Invoking Function Factorial is =",fact3);
})
(2);
console.log('===========')