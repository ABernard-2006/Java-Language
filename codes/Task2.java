abstract class Person 
{
    String name;
    String id;

    Person(String name, String id) 
    {
        this.name = name;
        this.id = id;
    }

    void displayInfo() 
    {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    abstract void performRole();
}

class Student extends Person 
{
    int yearLevel;
    String course;
    int pendingWorkloads;

    Student(String name, String id, int yearLevel, String course, int pendingWorkloads) 
    {
        super(name, id);
        this.yearLevel = yearLevel;
        this.course = course;
        this.pendingWorkloads = pendingWorkloads;
    }

    @Override
    void performRole() 
    {
        System.out.println("Role: Student");
        System.out.println("Year Level: " + yearLevel);
        System.out.println("Course: " + course);
        System.out.println("Pending Academic Workloads: " + pendingWorkloads);

        if (pendingWorkloads > 0) 
            System.out.println(name + " is currently completing academic workloads and is getting cooked.");
        else 
            System.out.println(name + " has no pending academic workloads and is chilling.");
    }
}

class Teacher extends Person 
{
    int classesHandled;
    int outputsToCheck;

    Teacher(String name, String id, int classesHandled, int outputsToCheck) 
    {
        super(name, id);
        this.classesHandled = classesHandled;
        this.outputsToCheck = outputsToCheck;
    }

    @Override
    void performRole() 
    {
        System.out.println("Role: Teacher");
        System.out.println("Classes Handled: " + classesHandled);
        System.out.println("Outputs to Check: " + outputsToCheck);

        if (outputsToCheck > 0) 
            System.out.println(name + " is currently checking student outputs and is cooking.");
        else 
            System.out.println(name + " has no student outputs to check and is chilling.");
    }
}

class Staff extends Person 
{
    String workArea;

    Staff(String name, String id, String workArea) 
    {
        super(name, id);
        this.workArea = workArea;
    }

    @Override
    void performRole() 
    {
        System.out.println("Role: Staff");
        System.out.println("Work Area: " + workArea);
        System.out.println(name + " is currently working in the " + workArea + ".");
    }
}

class Merchant extends Person 
{
    String productType;

    Merchant(String name, String id, String productType) 
    {
        super(name, id);
        this.productType = productType;
    }

    @Override
    void performRole() 
    {
        System.out.println("Role: Merchant");
        System.out.println(name + " is currently selling " + productType + " to the university community.");
    }
}

public class Task2 
{
    public static void main(String[] args) 
    {
        Person p1 = new Student("Allen Bernard","CSstud",2,"BS Computer Science",5);
        Person p2 = new Teacher("Ma'am Lea","CSprofOOP",2,0);
        Person p3 = new Staff("Ma'am Registrar na mabait","CSRegWindow1","Registrar");
        Person p4 = new Merchant("Graciana", "CScanteen","Food and Drinks");

        Person[] people = {p1, p2, p3, p4};

        for (Person person : people) 
        {
            person.displayInfo();
            person.performRole();
            System.out.println();
        }
    }
}