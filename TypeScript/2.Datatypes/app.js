var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var name1 = 'dk';
console.log(name1, typeof name1);
var age = 22;
console.log(age, typeof age);
var name3;
console.log(name3, typeof name3);
var address;
address = "hggbh";
address = 456789;
console.log(address, typeof address);
var calAge = function () {
    console.log('Age is 22');
};
calAge();
var Person = /** @class */ (function () {
    function Person(name, age) {
        this.name = name;
        this.age = age;
    }
    return Person;
}());
var person = new Person('Deepesh', 22);
console.log('Person Details', person);
var Student = /** @class */ (function (_super) {
    __extends(Student, _super);
    function Student(name, age, rollno) {
        var _this = _super.call(this, name, age) || this;
        _this.rollno = rollno;
        return _this;
    }
    return Student;
}(Person));
var student = new Student('Deepesh', 22, 69);
console.log("Student Details", student);
