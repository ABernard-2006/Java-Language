class Person 
{
    String gender;

    Person(String gender) 
    {
        this.gender = gender;
        System.out.println("Gender: " + gender);
    }
}

class Student extends Person 
{
    String school;

    Student(String gender, String school) 
    {
        super(gender);
        this.school = school;
        System.out.println("School: " + school);
    }
}

class CSStudent extends Student 
{
    String program;
    String yearLevel_Bloc;
    String feeling;

    CSStudent(String gender, String school, String program, String yearLevel_Bloc, String feeling) 
    {
        super(gender, school);
        System.out.println("Program: " + program);
        System.out.println("Year Level & Bloc: " + yearLevel_Bloc);
        System.out.println("Feeling so far: " + feeling);
    }
}
public class Part8 
{
    public static void main(String[] args) 
    {
        CSStudent s1 = new CSStudent("Male", "Bicol University", "BS in Computer Science", "2A", "Enjoying College");
    }
}