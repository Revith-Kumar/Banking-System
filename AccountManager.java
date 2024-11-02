import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    private List<BankAccount> accounts;

    public AccountManager() {
        this.accounts = new ArrayList<>();
    }

    // Method to create a savings account
    public void createSavingsAccount(int accountId, String accountHolder, double initialBalance, double interestRate) {
        SavingsAccount savingsAccount = new SavingsAccount(accountId, accountHolder, initialBalance, interestRate);
        accounts.add(savingsAccount);
        System.out.println("Savings account created for " + accountHolder);
    }

    // Method to create a checking account
    public void createCheckingAccount(int accountId, String accountHolder, double initialBalance, double overdraftLimit) {
        CheckingAccount checkingAccount = new CheckingAccount(accountId, accountHolder, initialBalance, overdraftLimit);
        accounts.add(checkingAccount);
        System.out.println("Checking account created for " + accountHolder);
    }

    // Method to get an account by ID
    public BankAccount getAccount(int accountId) {
        for (BankAccount account : accounts) {
            if (account.getAccountId() == accountId) {
                return account;
            }
        }
        return null; // Return null if the account is not found
    }
}
