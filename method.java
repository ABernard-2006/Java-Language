public class method {

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
        System.out.println("Area of square with side 5: " + area(5, 5, 5, 5));
    }
}
