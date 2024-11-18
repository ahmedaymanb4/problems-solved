package pl2_sheet_3;

/**
 * |--------------------------------------------------|
 * The UML Diagram of 'Account' class:
 * |--------------------------------------------------|
 * -id = 0: int 
 * -balance = 0: double
 * -annualInterestRate = 0: double
 * -dateCreated: Date
 * |--------------------------------------------------|
 * +Account()
 * +Account(int specified_id, double initial_balance)
 * 
 * +getId(): int
 * +getBalance(): double
 * +getAnnualInterestRate(): double
 * 
 * +setId(int specified_id): void
 * +setBalance(double balance): void
 * +setAnnualInterestRate(double rate): void
 * 
 * +getDateCreated(): Date
 * +getMonthlyInterestRate(): double
 * +withdraw(double amount): void
 * +deposit(double amount): void
 * |--------------------------------------------------|
 * 
 * @author Ahmed Ayman
 */
import java.util.Date;

public class Account {
    private int id = 0; 
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    
    public Account(){
    }

    public Account(int specified_id, double initial_balance){
        if((specified_id >= 0) && (initial_balance >= 0)){
            id = specified_id;
            balance = initial_balance;
        }
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int specified_id){
        if(specified_id >= 0){
            id = specified_id;
        }
    }
    
    public double getBalance(){
        return balance;
    }
        
    public void setBalance(double balance_to_be_set){
        if (balance_to_be_set >= 0.0) {
            balance = balance_to_be_set;
        }
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double rate){
        annualInterestRate = rate;
    }

    public Date getDateCreated(){
        return dateCreated;
    }
    
    public double getMonthlyInterestRate(){
        return annualInterestRate;
    }
        
    public void withdraw(double amount){
        if ((balance > 0) && (balance > amount)) {
            balance -= amount;
        }
    }
    
    public void deposit(double amount){
        balance += amount;
    }
}
