class BankAccount {
    private String accountNumber;
    private double balance;


    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance cannot be negative. Set to 0.");
        }
    }


    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        } else {
            System.out.println("Transaction failed: Insufficient funds or invalid amount.");
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("ACC101", 500.0);

        System.out.println("Initial Balance: $" + myAccount.getBalance());
        
        myAccount.deposit(150.0);
        myAccount.withdraw(100.0);
        myAccount.withdraw(1000.0); 

        System.out.println("Final Balance: $" + myAccount.getBalance());
    }
}
