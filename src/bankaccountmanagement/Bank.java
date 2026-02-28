
package bankaccountmanagement;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class Bank {
    private ArrayList<Account>Accounts;
    
    public Bank(){
        Accounts = new ArrayList<>();
        
    }
    public void addAccount(Account account){
        Accounts.add(account);
        System.out.println("Account has been added successfuly.");
    }
    public void displayAllAccounts(){
        if(Accounts.isEmpty()){
            System.out.println("There is no accounts.");
            return;
        }
        for (Account acc : Accounts) {
        acc.displayAccountInfo();
        System.out.println("-------------------");
    }
 }
    public Account findAccount(int accountNumber){
        for(Account acc : Accounts){
            if(acc.getAccountNumber() == accountNumber){
            return acc;
            }
        
        }
        return null;
    }

   
}
