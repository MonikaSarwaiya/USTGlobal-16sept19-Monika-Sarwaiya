console.log('Sum of Array')
//Sum of Array
//Named Function
function SumofArray(array){
    var sum = 0;
    for (var i = 0; i < array.length; i++) {
        sum = sum+array[i];
        }
        return sum;
}
console.log('Sum of Array using Named Expression = ',SumofArray([10,20,30,40]));
console.log('===============')
//Expression Function
var arr = function(array){
    var sum1 = 0;
    for (var i = 0; i < array.length; i++) {
        sum1 = sum1+array[i];
        }
        return sum1;
}
console.log('Sum of Array using Expression Function = ',arr([10,20,30,40]));
console.log('=============')
//Fat Arrow Function
var arr = (array) => {
    var sum2 = 0;
    for (var i = 0; i < array.length; i++) {
        sum2 = sum2+array[i];
        }
        return sum2;
}
console.log('Sum of Array using Fat Arrow Function = ',arr([10,20,30,40]));
console.log('============');
//Self Invoking Function
(function(array)  {
    var sum3 = 0;
    for (var i = 0; i < array.length; i++) {
        sum3 = sum3+array[i];
        }
console.log('Sum of Array using Fat Arrow Function = ',sum3);
})
([10,20,30,40]);
console.log('==============')