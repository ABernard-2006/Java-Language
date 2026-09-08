class Person 
{
    String name;
    int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    String studentNumber;
    String program;

    Student(String name, int age, String studentNumber, String program) 
    {
        super(name, age);
        this.studentNumber = studentNumber;
        this.program = program;
    }
    
    void displayInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Program: " + program);
    }
}

public class Part4 {
    public static void main(String[] args) 
    {
        Student CS2A = new Student("Allen Bernard Aurellano", 20, "2025-01-05075", "BS in Computer Science");
        CS2A.displayInfo();
    }
}
