const hobbies = ['Sleeping','Cricket','Eating','Singing','Roaming']
console.log(typeof hobbies)
const isArrayOrNot = Array.isArray(hobbies)
console.log('Hobbies array or not ',isArrayOrNot)

const hasCricket = hobbies.includes('Cricket',100)
console.log('Using includes method ',hasCricket)
const hasRoaming = hobbies.includes('Roaming',4)
console.log('Using includes method ',hasRoaming)

hobbies.push('Guitar','Volleyball')
console.log('After push method ',hobbies)

hobbies.pop();
console.log('After pop method ',hobbies )

hobbies.unshift('Numismatics','Singing')
console.log('After unshift method ',hobbies)

hobbies.shift()
console.log('After shift method ',hobbies)

const hobbies1 = ['Sleeping','Cricket','Eating','Singing','Roaming']
// hobbies1.splice(1,0,'Bird watching','Driving')
// console.log('After Splice Method ',hobbies1)

/*hobbies1.splice(1,2,'Bird watching','Driving')
console.log('After Splice Method ',hobbies1)

const afterSlice = hobbies1.slice(2,4)
console.log('After Slice Method ',hobbies1)
console.log('After Slice Method ',afterSlice)*/

const indexOfRoaming = hobbies1.indexOf('Roaming',2)
console.log('Index of coding',indexOfRoaming)

const indexOfSinging = hobbies1.indexOf('Singing')
console.log('Index of coding',indexOfSinging)

const stringHobbies = hobbies1.join('-')
console.log('String Hobbies',stringHobbies)

const stringHobbies1 = hobbies1.join()
console.log('String Hobbies',stringHobbies1)

const numbers = [100,200,300,400]
const number = numbers.map(function(value,index){
    let newValue = value + 50;
    return newValue
})
console.log('After Map Method ',number)
//Fat Arrow Function
const number1 = numbers.map(value => value + 50);
console.log('After Map1 Method ',number1)

const number2 = numbers.filter(function(value,index){
    if(value>200)
    return true;
    else
    return false;
})
console.log('After Filter Method ',number2)
//Fat Arrow Function
const number3 = numbers.filter(value => value > 200);
console.log('After Filter1 Method ',number3)

//Assignment
const items = [{
    name : 'Ear ring',
    id : 1,
    price : 5000
},
{
    name : 'Trimmer',
    id : 2,
    price : 500
},
{
    name : 'Lipstick',
    id : 3,
    price : 650
},
{
    name : 'Gel',
    id : 4,
    price : 550
}]
console.log('Using Map Method')
const updatedItem = items.map(function(val,ind){
    val.price = val.price + 300
    return val
})
console.log(updatedItem)
console.log('==============')
console.log('Using Map1 Method')
//Fat Arrow
const itemArrow = items.map((value)=>{
    value.price = value.price + 300
    return value
})
console.log(itemArrow)
console.log('===========')
console.log('Using Filter method with Fat Arrow')
const filteredItem = items.filter((item)=>item.price>1200)
console.log(filteredItem)
console.log('=============')