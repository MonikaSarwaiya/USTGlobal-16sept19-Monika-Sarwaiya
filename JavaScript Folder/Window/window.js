console.log('Window object',window);
console.log('This Keyword',this);
console.log(this===window);

window.alert('Welcome to JavaScript Class');
alert('Welcome to UST Global and Test Yantra');

let confirmDelete = confirm('Are you sure you want to delete');
console.log('Confirm Delete',confirmDelete)

let userName = prompt('What is your name?','Deepesh')
console.log('User Name',userName)

const person ={
    firstName : 'Deepesh',
    age : 22,
    lastName : 'Khandelwal',
    getName : function(){
        console.log('This Keyword',this)
        return this.firstName + ' ' + this.lastName
    }
}
let fullName = person.getName()
console.log('Full Name',fullName)