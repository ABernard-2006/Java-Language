import java.util.Scanner; //THIS CODE COMPUTES FOR THE AREA OF TRIANGLE

public class Practice_v2 {
    public static void main(String[] args)
    {
        double width, height, base;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter width: ");
        width = input.nextDouble();

        System.out.print("Enter height: ");
        height = input.nextDouble();

        System.out.print("Enter base: ");
        base = input.nextDouble();

        if(width + height > base || width + base > height || height + base > width)
        {
            double s = (height+base+width)/2;
            double area = Math.sqrt(s*(s-height)*(s-base)*(s-width));
            System.out.println("\nThe area of the triangle is " + area + "!");
        }
        else
        {
            System.out.println("\nInvalid Triangle.");
        }
    }
}
