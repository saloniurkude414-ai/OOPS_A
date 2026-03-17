class BankAccount {

    final double interestRate = 5.0;

    double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }
}

public class BankInterestDemo {

    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        double c1 = 10000;
        double c2 = 20000;
        double c3 = 50000;

        System.out.println("Customer 1 Interest: " + b.calculateInterest(c1));
        System.out.println("Customer 2 Interest: " + b.calculateInterest(c2));
        System.out.println("Customer 3 Interest: " + b.calculateInterest(c3));
    }
}