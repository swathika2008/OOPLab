abstract class PaymentProcessor {
    String transactionID;
    PaymentProcessor(String id) {
        this.transactionID = id;
    }
    abstract void processPayment(double amount);
}

class CreditCardPayment extends PaymentProcessor {
    CreditCardPayment(String id) { super(id); }
    void processPayment(double amount) {
        System.out.println("ID: " + transactionID + " | Charged $" + (amount * 1.02) + " (2% Fee)");
    }
}

class WalletPayment extends PaymentProcessor {
    WalletPayment(String id) { super(id); }
    void processPayment(double amount) {
        System.out.println("ID: " + transactionID + " | Charged $" + amount + " (Flat Cashback Applied)");
    }
}

public class PaymentApp {
    public static void main(String[] args) {
        PaymentProcessor p1 = new CreditCardPayment("TXN101");
        p1.processPayment(500);
    }
}
