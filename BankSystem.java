import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountManager accountManager = new AccountManager();

        // Sample accounts creation
        accountManager.createSavingsAccount(101, "Alice", 5000, 5.0);
        accountManager.createCheckingAccount(102, "Bob", 2000, 1000);
        accountManager.createSavingsAccount(103, "Ace", 5000, 5.0);

        BankAccount currentAccount = null;

        System.out.println("Welcome to the Bank System!");

        while (true) {
            System.out.println("\n1. Access Existing Account");
            System.out.println("2. Create New Account");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.print("Enter Account ID: ");
                int accountId = scanner.nextInt();
                currentAccount = accountManager.getAccount(accountId);
                if (currentAccount == null) {
                    System.out.println("Account not found.");
                    continue;
                }
                System.out.println("Accessed account for " + currentAccount.getAccountHolder());
            } else if (option == 2) {
                System.out.print("Enter account type (1 for Savings, 2 for Checking): ");
                int accountType = scanner.nextInt();
                System.out.print("Enter Account ID: ");
                int accountId = scanner.nextInt();
                System.out.print("Enter Account Holder Name: ");
                String accountHolder = scanner.next();
                System.out.print("Enter Initial Balance: ");
                double initialBalance = scanner.nextDouble();

                if (accountType == 1) { // Savings Account
                    System.out.print("Enter Interest Rate: ");
                    double interestRate = scanner.nextDouble();
                    accountManager.createSavingsAccount(accountId, accountHolder, initialBalance, interestRate);
                } else if (accountType == 2) { // Checking Account
                    System.out.print("Enter Overdraft Limit: ");
                    double overdraftLimit = scanner.nextDouble();
                    accountManager.createCheckingAccount(accountId, accountHolder, initialBalance, overdraftLimit);
                } else {
                    System.out.println("Invalid account type.");
                }
            } else if (option == 3) {
                System.out.println("Exiting... Thank you for using the Bank System.");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }

            // Account operations menu (similar to before)
            // ... (same as before)
        }

        scanner.close();
    }
}
