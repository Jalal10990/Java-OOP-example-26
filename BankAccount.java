import java.util.Scanner;

class BankAccount {
    
    // first private fields of attributes (encapsulation)
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    
    
    // constrructor for initializing attributes 
    public BankAccount(String name, String accNumber, double initialBalance) {
        this.accountHolderName = name;
        this.accountNumber = accNumber;
        this.balance = initialBalance;
    }

    // getter for each attribute 

    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    // setter for each attribute
  
    public void setAccountHolderName(String name) {
        if(name != null && !name.isEmpty()) {
            this.accountHolderName = name;
        }
    }

    public void setAccountNumber(String accNumber) {
        if(accNumber != null && !accNumber.isEmpty()) {
            this.accountNumber = accNumber;
        }
    }

    //then we use transaction method
    
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("the deposit is done. New balance is: " + balance);
        } else {
            System.out.println("invalid deposit amount.");
        }
    }
    
    //then we use withdraw method
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("the withdrawal is done. New balance is: " + balance);
        } else {
            System.out.println("invalid withdrawal amount or insufficient funds.");
        }
    }

    //then we use comparison method
   
    public boolean isSameAccountHolder(BankAccount otherAccount) {
        return this.accountHolderName.equalsIgnoreCase(otherAccount.getAccountHolderName());
    }

    public static String getAccountWithHigherBalance(BankAccount account1, BankAccount account2) {
        if(account1.getBalance() > account2.getBalance()) {
            return account1.getAccountHolderName();
        } else if(account2.getBalance() > account1.getBalance()) {
            return account2.getAccountHolderName();
        } else {
            return "thus both accounts have equal balance";
        }
    }
}

    
    
    
