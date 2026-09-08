import java.util.Scanner;

class Person {
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
    int yearAdmit;

    Student(String name, int age, String studentNumber, String program, int yearAdmit) 
    {
        super(name, age);
        this.studentNumber = studentNumber;
        this.program = program;
        this.yearAdmit= yearAdmit;
    }

    void displayInfo() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Program: " + program);
    }

    void expectedYearGrad()
    {
        int graduationYear = yearAdmit + 4;
        System.out.println("\nCongrats! You're graduating in " + graduationYear + "!");
    }
}

class CSStudent extends Student 
{
    String specialization;

    CSStudent(String name, int age, String studentNumber, String program, String specialization, int yearAdmit) 
    {
        super(name, age, studentNumber, program, yearAdmit);
        this.specialization = specialization;
    }

    void displayCS() 
    {
        displayInfo();
        System.out.println("Specialization: " + specialization);
        expectedYearGrad();
    }
}
public class Part7 
{
public static void main(String[] args) 
{
    Scanner scanner = new Scanner(System.in);

    String name, studentNumber, program, specialization;
    int age, yearAdmit;

    System.out.println("Enter information for student1:");
    System.out.print("Name: ");
    name = scanner.nextLine();

    System.out.print("Age: ");
    age = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Student Number: ");
    studentNumber = scanner.nextLine();

    System.out.print("Program: ");
    program = scanner.nextLine();

    System.out.print("Specialization: ");
    specialization = scanner.nextLine();

    System.out.print("Year Admitted: ");
    yearAdmit = scanner.nextInt();

    CSStudent student1 = new CSStudent(name, age, studentNumber, program, specialization, yearAdmit);

    System.out.println();
    System.out.println("Enter information for student2:");

    scanner.nextLine();
    System.out.print("Name: ");
    name = scanner.nextLine();

    System.out.print("Age: ");
    age = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Student Number: ");
    studentNumber = scanner.nextLine();

    System.out.print("Program: ");
    program = scanner.nextLine();

    System.out.print("Specialization: ");
    specialization = scanner.nextLine();

    System.out.print("Year Admitted: ");
    yearAdmit = scanner.nextInt();

    CSStudent student2 = new CSStudent(name, age, studentNumber, program, specialization, yearAdmit);

    System.out.println("\n--- Student #1 ---");
    student1.displayCS();

    System.out.println("\n--- Student #2 ---");
    student2.displayCS();
    
    scanner.close();
    }
}