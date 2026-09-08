package OOP;

class Student {
    String name;
    int yearLevel;

    Student(String name, int yearLevel) 
    {
    this.name = name;
    this.yearLevel = yearLevel;
    }

void introduce() 
    {
    System.out.println("Name: " + name);
    System.out.println("Year Level: " + yearLevel);
    }

}
public class Part1 {
public static void main(String[] args) {
Student s = new Student("Ana", 2);
s.introduce();
}
}
