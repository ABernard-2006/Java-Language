import java.util.Scanner;

class Product 
{
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) 
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    void displayInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

public class Part3 {
    public static void main(String[] args) 
    {
    Scanner scanner = new Scanner(System.in);

    String name;
    double price;
    int quantity;

    System.out.print("Enter name: ");
    name = scanner.nextLine();

    System.out.print("Enter price: ");
    price = scanner.nextDouble();

    System.out.print("Enter quantity: ");
    quantity = scanner.nextInt();

    System.out.println();
    Product tShirt = new Product(name, price, quantity);
    
    tShirt.displayInfo();
    scanner.close();
    }
}