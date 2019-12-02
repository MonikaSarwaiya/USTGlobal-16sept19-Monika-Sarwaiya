let name1 : string = 'dk';
console.log(name1, typeof name1);

let age = 22;
console.log(age, typeof age);

let name3 : string;
console.log(name3, typeof name3);

let address ;
address = "hggbh";
address = 456789;
console.log(address, typeof address);

let calAge = function() : void{
    console.log('Age is 22');
}
calAge();

class Person{
    constructor(public name : string, public age : number){

    }
}
let person = new Person('Deepesh',22);
console.log('Person Details', person)

class Student extends Person{
    constructor(name : string, age : number , public rollno : number){
        super(name, age);
    }
}
let student = new Student('Deepesh', 22, 69);
console.log("Student Details",student);