class InvoiceProcessor {
    public void processInvoice(double amount) {
        System.out.println("Base Invoice: $" + amount);
    }

    private double calculateTax(double amount) {
        return amount * 0.05;
    }

    public void printTotalWithTax(double amount) {
        double total = amount + calculateTax(amount);
        System.out.println("Total (including 5% base tax): $" + total);
    }
}

class RetailInvoice extends InvoiceProcessor {
    @Override
    public void processInvoice(double amount) {
        double discount = amount * 0.10;
        System.out.println("Retail Invoice (10% Discount Applied): $" + (amount - discount));
    }
}

public class BillingSystem {
    public static void main(String[] args) {
        InvoiceProcessor processor = new RetailInvoice();
        processor.processInvoice(100.0);
        processor.printTotalWithTax(100.0);
    }
}
