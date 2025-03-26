import java.util.Scanner;

public class BankManagementSystem{
    public static void main(String[] args) {
        
          Scanner scanner = new Scanner(System.in);

        // first i create  account
        System.out.println("Enter details for Account 1:");
        System.out.print("Account Holder Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Account Number: ");
        String accNum1 = scanner.nextLine();
        System.out.print("Initial Balance: ");
        double balance1 = scanner.nextDouble();
        scanner.nextLine(); 
        
        BankAccount account1 = new BankAccount(name1, accNum1, balance1);

        // then i create second account
        System.out.println("\nEnter details for Account 2:");
        System.out.print("Account Holder Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Account Number: ");
        String accNum2 = scanner.nextLine();
        System.out.print("Initial Balance: ");
        double balance2 = scanner.nextDouble();
        
        BankAccount account2 = new BankAccount(name2, accNum2, balance2);

        // perform comparisons result
        System.out.println("\nComparison Results:");
        
        // check if same account holdber
        if(account1.isSameAccountHolder(account2)) {
            System.out.println("Both accounts belong to the same person.");
        } else {
            System.out.println("These accounts belong to different people.");
        }

        // then compare balances
        String higherBalanceHolder = BankAccount.getAccountWithHigherBalance(account1, account2);
        System.out.println("Account with higher balance: " + higherBalanceHolder);

        // then demonstrate transactions
        System.out.println("\nTransaction Demonstration:");
        
        // then deposit to account1
        System.out.print("\nEnter deposit amount for Account 1: ");
        double depositAmount = scanner.nextDouble();
        account1.deposit(depositAmount);
        
        // then withdraw from account2
        System.out.print("Enter withdrawal amount for Account 2: ");
        double withdrawAmount = scanner.nextDouble();
        account2.withdraw(withdrawAmount);

        // then final balances
        System.out.println("\nFinal Balances:");
        System.out.println(account1.getAccountHolderName() + ": " + account1.getBalance());
        System.out.println(account2.getAccountHolderName() + ": " + account2.getBalance());

    }

    
}