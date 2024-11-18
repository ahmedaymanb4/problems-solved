/**
 * NOTE!!! 
 * <p>
 * It's necessary to 
 * add this file to the same package/directory 
 * where the file of 'Account.java' is at. 
 * </p>
 * 
 * <p>
 * This file is dependant on 'Account.java'.
 * </p>
 * 
 * @author Ahmed Ayman
 */
package pl2_sheet_3; 

public class AccountTest {
    public static void main(String[] args) {
        
        Account user_account 
                = new Account(1122, 20000);
        user_account.setAnnualInterestRate(4.5);
        
        System.out.println("Your account is created successfully!");
        System.out.println("Your account balance initially = " 
                + user_account.getBalance());
        
        user_account.withdraw(2500);
        System.out.println("\n$2500 were withdrew. Balance now = " 
                + user_account.getBalance());
        
        user_account.deposit(3000);
        System.out.println("\n$3000 were deposited. Balance now = " 
                + user_account.getBalance());
        
        System.out.println("\nYour account interest rate = " 
                + user_account.getAnnualInterestRate());
        
        System.out.println("Your account was created on " 
                + user_account.getDateCreated());

    }
}
