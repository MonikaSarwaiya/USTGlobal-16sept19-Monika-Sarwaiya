const person = {
    name : 'Deepesh',
    age : 22,
    color : 'fair',
    address : {
        city : 'Bangalore',
        state : 'Karnataka',
        pincode : 560087
    },
    hobbies : ['Coding','Bird Watching','Singing']
}
console.log('JavaScript Person Object',person)
const jsonObject = JSON.stringify(person)
console.log('JSON Person Object ',jsonObject)

const javaScriptPersonObject = JSON.parse(jsonObject)
console.log('JavaScript Person Object after',javaScriptPersonObject)

localStorage.setItem('email','dk@123')
const emailID = localStorage.getItem('email')
console.log('email Id',emailID)
localStorage.clear();