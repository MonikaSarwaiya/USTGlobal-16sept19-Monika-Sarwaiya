/*let element = document.getElementById('demo');
console.log('Element',element)
console.log('Elemnent text = ',element.textContent)
element.textContent = 'Good Evening'
console.log('=======================')
let createButton = document.createElement('button')
createButton.textContent = 'Click Me!!!'
console.log('Button Element ',createButton)

document.body.appendChild(createButton);
let uiElement = document.createElement('ui')
let li1Element = document.createElement('li')
let li2Element = document.createElement('li')
let li3Element = document.createElement('li')

li1Element.textContent = 'Java'
li2Element.textContent = 'SQl'
li3Element.textContent = 'J2EE'

uiElement.appendChild(li1Element)
uiElement.appendChild(li2Element)
uiElement.appendChild(li3Element)
document.body.appendChild(uiElement)

element.style.color = 'purple'
element.style.fontSize = '100px'*/

function showMessage(){
    alert('Hi Hello World!!!')
}

function changeColor(){
    let pElement = document.getElementById('mover')
    pElement.style.color = 'green'
}

function removeColor(){
    let pElement = document.getElementById('mover')
    pElement.style.color = 'black'
}

function printHello(){
    console.log('Hello')
    let userName = document.getElementById('username').value
    document.getElementById('showusername').textContent = userName;
}

let name = 'Deepesh'
let age = 22
let phoneno = 9039683447
console.log('Name is '+name + ' Age is '+age + ' Phoneno is '+phoneno)
console.log(`Name is ${name} Age is ${age} Phoneno is ${phoneno}`)
console.log(`2 + 2 = ${2+2}`)
