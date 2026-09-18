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
    String cardType;
    String bankName;
    double cardBalance; // I removed the estimated balance

    CardPayment() // No card information available so no cashback
    {
        cardType = "Unknown";
        bankName = "Unknown";
        cardBalance = 2500; // Assumes a 2500 balance
    }

    CardPayment(String cardType, double cardBalance) 
    {
        this.cardType = cardType; // Known if VISA ad at most 5% cashback
        this.bankName = "Unknown";
        this.cardBalance = cardBalance;
    }

    CardPayment(String cardType, String bankName, double cardBalance) 
    {
        this.cardType = cardType; // Known if VISA and participating bank so possible 10% cashback
        this.bankName = bankName;
        this.cardBalance = cardBalance;
    }

    @Override
    void processPayment(double amount) 
    {
        System.out.println("Card Type: " + cardType);
        System.out.println("Bank: " + bankName);
        System.out.printf("Card Balance: PHP %.2f%n", cardBalance);

        if (cardBalance < amount) 
        {
            System.out.println("Insufficient card balance.");
        } 
        else 
        {
            cardBalance = cardBalance - amount;

            System.out.printf("Card payment of PHP %.2f processed.%n", amount);

            if (cardType.equalsIgnoreCase("VISA") &&
            (bankName.equalsIgnoreCase("BPI") ||
                bankName.equalsIgnoreCase("SeaBank") ||
                bankName.equalsIgnoreCase("BDO") ||
                bankName.equalsIgnoreCase("LandBank"))) 
            {
                double cashback = amount * 0.10;
                cardBalance = cardBalance + cashback;

                System.out.println("You received a 10% cashback!");
                System.out.printf("Cashback: PHP %.2f%n", cashback);
            }
            else if (cardType.equalsIgnoreCase("VISA")) 
            {
                double cashback = amount * 0.05;
                cardBalance = cardBalance + cashback;

                System.out.println("You received a 5% cashback!");
                System.out.printf("Cashback: PHP %.2f%n", cashback);
            }
            else 
                System.out.println("This card is not eligible for cashback.");

            System.out.printf("Remaining Card Balance: PHP %.2f%n", cardBalance);
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

public class Task3 
{
    public static void main(String[] args) 
    {
        CardPayment card1 = new CardPayment(); // No card information provided

        CardPayment card2 = new CardPayment("VISA",3000); // Card type and balance provided

        CardPayment card3 = new CardPayment("VISA", "BPI", 3000); // Complete card information provided

        System.out.println("CARD 1");
        card1.processPayment(499);
        System.out.println();

        System.out.println("CARD 2");
        card2.processPayment(499);
        System.out.println();

        System.out.println("CARD 3");
        card3.processPayment(499);
    }
}