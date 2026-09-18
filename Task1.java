abstract class Payment 
{
    abstract void processPayment(double amount);
}

class CashPayment extends Payment 
{
    double cash;
    double change;

    CashPayment(double cash) 
    {
        this.cash = cash;
    }

    @Override
    void processPayment(double amount) 
    {
        if (cash < amount) 
        {
            System.out.println("Insufficient cash. Please provide enough cash to cover the payment.");
        } 
        else 
        {
            System.out.println("Cash payment of PHP " + amount + " received.");
            calculateChange(amount);
        }
    }

    private void calculateChange(double amount) 
    {
        change = cash - amount;
        System.out.println("Cash Given: PHP " + cash);
        System.out.println("Change: PHP " + change);
    }
}

class CardPayment extends Payment 
{
    double cardBalance = 2500;

    @Override
    void processPayment(double amount) 
    {
        if (cardBalance < amount) 
        {
            System.out.println("Insufficient card balance.");
        } 
        else 
        {
            System.out.println("Card payment of PHP " + amount + " processed.");
            cardBalance = cardBalance - amount;
            System.out.println("PHP " + amount + " has been deducted from your card.");
            System.out.println("Your remaining card balance is PHP " + cardBalance + ".");
        }
    }
}

class EWalletPayment extends Payment 
{
    double balance = 500;

    @Override
    void processPayment(double amount) 
    {
        if (balance < amount) 
        {
            System.out.println("Insufficient e-wallet balance.");
        } 
        else 
        {
            System.out.println("E-Wallet payment of PHP " + amount + " processed.");
            balance = balance - amount;
            System.out.println("PHP " + amount + " has been deducted from your e-wallet.");
            System.out.println("Your remaining balance is PHP " + balance + ".");
        }
    }
}

public class Task1 
{
    public static void main(String[] args) 
    {
        Payment p1 = new CashPayment(1000);
        Payment p2 = new CardPayment();
        Payment p3 = new EWalletPayment();

        Payment[] payments = {p1, p2, p3};

        for (Payment payment : payments) 
        {
            payment.processPayment(499);
            System.out.println();
        }
    }
}