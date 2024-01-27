/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2016II;

/**
 *
 * @author ooiru
 */
public class FinancialRecord {
    private int ID;
    private double balance,annualInterestRate;
    
    public FinancialRecord(){
        ID=0;
        balance=0;
        annualInterestRate = 0;
    }
    
    public FinancialRecord(int ID,double balance){
        this.ID=ID;
        this.balance=balance;
    }
    

    public int getID() {
        return ID;
    }


    public void setID(int ID) {
        this.ID = ID;
    }


    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }


    public double getAnnualInterestRate() {
        return annualInterestRate;
    }


    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    
    public void withdraw(double amount){
        System.out.println("Previous balance: "+balance);
        balance-=amount;
        System.out.println("Current balance after withdrawal of "+amount+" is "+balance);
    }
    
    public void deposit(double amount){
        System.out.println("Previous balance: "+balance);
        balance+=amount;
        System.out.println("Current balance after deposit of "+amount+" is "+balance);
    }
    
    public String displayRecordInfo(){
        return "Financial record id is: "+ID+"\nFinancial record balance is: RM"+balance+
                "\nAnnual interest rate is: "+annualInterestRate+"\nThe monthly interest rate is: "+getMonthlyInterestRate();
    }
        
}
