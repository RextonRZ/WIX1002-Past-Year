/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2016II;

/**
 *
 * @author rz_rexton
 */
public class Q6 {
    public static void main(String[] args) {
        System.out.println("The information about financial record A is as follows:");
        FinancialRecord a = new FinancialRecord(1234,10000);
        a.setAnnualInterestRate(7.77);
        System.out.println(a.displayRecordInfo());
        
        System.out.println("");
        System.out.println("The information about financial record B is as follows:");
        FinancialRecord b = new FinancialRecord();
        b.setID(1235);
        b.setBalance(20000);
        b.setAnnualInterestRate(8);
        System.out.println(b.displayRecordInfo());
        System.out.println(b.displayMonthlyInterestRate());
        b.deposit(1500);
        b.withdraw(500);
    }
}
