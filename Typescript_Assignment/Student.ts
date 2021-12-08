class Student {
    stdID: number;
    stdName: string;
    stdClass: string
    constructor(id: number, name: string, classname: string) {
        this.stdID = id;
        this.stdName = name;
        this.stdClass = classname
    }
        display()
        {
            console.log(this.stdID);
            console.log(this.stdName);
            console.log(this.stdClass);
            
        }
    }

var student1=new Student(12,"Varun","Ece")
student1.display();
var student2=new Student(21,"Veera","Cse")
student2.display();