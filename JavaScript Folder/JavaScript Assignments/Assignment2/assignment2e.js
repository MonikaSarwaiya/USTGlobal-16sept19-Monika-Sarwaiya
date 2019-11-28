console.log('Prime or Not')
//Prime or Not
//Named Function
function prime(numb){
    var count = 1, i = 1;
    while(i<=numb/2)
    {
        if(numb%i==0)
        count++;
        i++;
    }
    if(count==2)
    console.log(numb + ' is prime number');
    else
    console.log(numb + ' is not prime number');
}
prime(7);
console.log('==============')
//Expression Function
var prm = function(numb1){
    var count1 = 1, j = 1;
    while(j<=numb1/2)
    {
        if(numb1%j==0)
        count1++;
        j++;
    }
    if(count1==2)
    console.log(numb1 + ' is prime number');
    else
    console.log(numb1 + ' is not prime number');
}
prm(7);
console.log('==============')
//Fat Arrow Function
var prim = (numb2) =>{
    var count2 = 1, k = 1;
    while(k<=numb2/2)
    {
        if(numb2%k==0)
        count2++;
        k++;
    }
    if(count2==2)
    console.log(numb2 + ' is prime number');
    else
    console.log(numb2 + ' is not prime number');
}
prim(7);
console.log('==============');
//Self Invoked Function
(function(numb3){
var count3 = 1, l = 1;
    while(l<=numb3/2)
    {
        if(numb3%l==0)
        count3++;
        l++;
    }
    if(count3==2)
    console.log(numb3 + ' is prime number');
    else
    console.log(numb3 + ' is not prime number');
})
(10);