public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(int accountId, String accountHolder, double initialBalance, double overdraftLimit) {
        super(accountId, accountHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            deposit(-amount);
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit");
        }
    }
}
