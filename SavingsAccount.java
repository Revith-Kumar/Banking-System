public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountId, String accountHolder, double initialBalance, double interestRate) {
        super(accountId, accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            deposit(-amount);
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest applied: " + interest);
    }
}
