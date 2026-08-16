import java.util.Scanner;

public class PracticeInput {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter you school: ");
        String school = scanner.nextLine();

        System.out.print("Enter year level: ");
        int yearLevel = scanner.nextInt();

        System.out.println("Hi, " + name + "!");

        if(yearLevel == 1)
        {
            System.out.println("Welcome to " + school + "!" + "\nEnjoy your journey!");
        }
        else if(yearLevel > 1)
        {
            System.out.println("Welcome back to " + school + "!" + "\nEnjoy your journey!");
        }
        else
        {
            System.out.println("Invalid year level.");
        }

        scanner.close();
    }
    
}
