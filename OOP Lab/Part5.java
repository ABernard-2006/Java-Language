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

class Student extends Person 
{
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

class CSStudent extends Student 
{
    String specialization;

    CSStudent(String name, int age, String studentNumber, String program, String specialization) 
    {
        super(name, age, studentNumber, program);
        this.specialization = specialization;
    }

    void displayCS()
    {
        displayInfo();
        System.out.println("Specialization: " + specialization);
    }
}

public class Part5 
{
    public static void main(String[] args) 
    {
        CSStudent CS2A = new CSStudent("Allen Bernard Aurellano", 20, "2025-01-05075", "BS in Computer Science", "AI");
        CS2A.displayCS();
    }
}