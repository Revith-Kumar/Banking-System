import java.io.Serializable;

public abstract class BankAccount implements Serializable {
    private int accountId;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountId, String accountHolder, double initialBalance) {
        this.accountId = accountId;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getAccountHolder() {
        return accountHolder;  // This method is necessary
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public abstract void withdraw(double amount);  // Abstract method to be defined in subclasses
}
