var Student = /** @class */ (function () {
    function Student(id, name, classname) {
        this.stdID = id;
        this.stdName = name;
        this.stdClass = classname;
    }
    Student.prototype.display = function () {
        console.log(this.stdID);
        console.log(this.stdName);
        console.log(this.stdClass);
    };
    return Student;
}());
var student1 = new Student(12, "veera", "Cse");
student1.display();
var student2 = new Student(21, "venkat", "ece");
student2.display();
