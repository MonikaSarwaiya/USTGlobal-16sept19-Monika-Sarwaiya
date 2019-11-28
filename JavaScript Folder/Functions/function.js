//Named Functions
function add(num1,num2)
{
    console.log('Sum =',num1+num2);
}
add(10,20);
//No Method Overloading
/*function add(num1,num2,num3)
{
    console.log('sumValue = ',num1+num2+num3);
}*/
//Function Expression (Anonymous)
var sub = function(num1,num2)
{
var subValue = num1-num2;
return subValue;
}
var value = sub(90,89)
console.log('Value =',value);
//Self Invoked function or Immediately Invoked function expression

(function(num1,num2)
{
    console.log('Value = ',num1*num2);
})(10,20)
//Fat Arrow Function
var div = (num1,num2) =>{
    console.log('Value = ',num1/num2);
}
div(10,5);

var div1 = num1 =>{
    console.log('Value = ',num1);
}
div1(10);

var div2 = num1 =>console.log('Value = ',num1);
div2(20);

var add1 = (num1,num2) => num1+num2;
var value = add(10,20);

 cal("DK")
 function cal(msg){
     console.log('Hello',msg);
 }

//  cal1('Deepesh')
//  var cal1 = function(msg){
//      console.log('Hi',msg);
//  }

// cal2('Deepu')
// var cal2 = (msg) => {
//     console.log('Hi',msg);
// }

console.log(hoist);
var hoist = 10;
function hoisting(){
    console.log(hoistingA);
    var hoistingA=10;
}
hoisting();