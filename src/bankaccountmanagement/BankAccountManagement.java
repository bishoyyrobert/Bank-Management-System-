package bankaccountmanagement;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class BankAccountManagement {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        
        
        int choice;

        do {
            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display All Accounts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    // create account
                        System.out.print("Enter Account Number: ");
                        int accNum = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        Account newAcc = new Account(accNum, name);
                        bank.addAccount(newAcc);
                    break;
                case 2:
                    // deposit
                        System.out.print("Enter Account Number: ");
                        int accNumDeposit = sc.nextInt();
                        Account accDep = bank.findAccount(accNumDeposit);

                        if (accDep != null) {
                            System.out.print("Enter amount to deposit: ");
                            double amount = sc.nextDouble();
                            accDep.deposit(amount);
                        } else {
                            System.out.println("Account not found.");
                        }
                    break;
                case 3:
                    // withdraw
                    System.out.print("Enter Account Number: ");
                    int accNumWithdraw = sc.nextInt();
                    Account accWith = bank.findAccount(accNumWithdraw);

                    if (accWith != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double amount = sc.nextDouble();
                        accWith.withdraw(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    // display accounts
                    bank.displayAllAccounts();                    
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }

        } while(choice != 5);
    }
    
}
