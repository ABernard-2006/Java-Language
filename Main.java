import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    String studentNumber;
    String program;

    Student(String name, int age, String studentNumber, String program) {
        super(name, age);
        this.studentNumber = studentNumber;
        this.program = program;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        String studentNumber;
        String program;

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter student number: ");
        studentNumber = scanner.nextLine();

        System.out.print("Enter program: ");
        program = scanner.nextLine();

        Student s1 = new Student(name, age, studentNumber, program);

        System.out.println("\n" +
            "Name: " + s1.name +
            "\nAge: " + s1.age +
            "\nStudent Number: " + s1.studentNumber +
            "\nProgram: " + s1.program
        );

        scanner.close();
    }
}