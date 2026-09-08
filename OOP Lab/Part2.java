class Book 
{
    String title;
    double price;
    Book() 
    {
        this.title = "Unknown";
        this.price = 0.0;
    }
    Book(String title) 
    {
        this.title = title;
    }
    Book(String title, double price) 
    {
        this.title = title;
        this.price = price;
    }
    void display() 
    {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println();
    }
}
public class Part2 
{
    public static void main(String[] args) 
    {
        Book obt1 = new Book();
        obt1.display();

        Book obt2 = new Book("Unknown");
        obt2.display();
        
        Book obt3 = new Book("Unknown", 0);
        obt3.display();
    }
}