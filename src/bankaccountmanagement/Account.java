package bankaccountmanagement;

/**
 *
 * @author USER
 */
public class Account {
    private int accountNumber;
    private String name;
    private double balance;

public  Account (int accountNumber , String name){
    this.accountNumber = accountNumber;
    this.name = name;
    this.balance = 0.0;
}

public int getAccountNumber(){return accountNumber;}

public String getName(){return name;}

public double getBalance(){return balance;}

public void deposit(double amount){
        if(amount > 0){
        balance+= amount;
            System.out.println("Deposit successful.");
        }else{
            System.out.println("Invalid amount!");
            System.out.println("Try again.");
        }
    }
public void withdraw(double amount){
        if(amount > 0 && balance >= amount){
        balance-=amount;
            System.out.println("Withdraw successful");
        }else if(balance < amount){
            System.out.println("Not enough balance.");
            System.out.println("Try again.");
        }else{
            System.out.println("Invalid amount number.");       
        }

    }
public void displayAccountInfo(){
    System.out.println("Account Number: "+ accountNumber);
    System.out.println("Name: "+ name);
    System.out.println("Balance: "+ balance);
}
}