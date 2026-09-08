class Person 
{
    String name;
    
    Person(String name) 
    {
        this.name = name;
    }
}

class Student extends Person 
{
    int year;

    Student(String name, int year) 
    {
        super(name);
        this.year = year;
    }
}

public class Part6 
{
    public static void main(String[] args)
    {
        Student s = new Student("Mia", 2);
        System.out.println(s.name);
        System.out.println(s.year);
    }
}