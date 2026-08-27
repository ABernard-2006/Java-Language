public class method {
import java.util.Scanner;

    static double area(double sideA, double sideB, double sideC, double sideD)
    {
    if(sideA == sideB && sideB == sideC && sideC == sideD)
    {
        return sideA*sideB;
    }
    else
    {
        System.out.println("Not a square");
        return 0;
    }
    }

    static double area(double length, double width)
    {
    return length*width;
    }

    static double area(double radius)
    {
    return Math.PI * radius * radius;
    }

    public static void main(String[] args)
    {
        Scanner sinput = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        double side = sinput.nextDouble();
        System.out.println("Area of square with side " + side + ": " + area(side, side, side, side));
    }
}
