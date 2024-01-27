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
        FinancialRecord a = new FinancialRecord();
        a.setAnnualInterestRate(8.0);
        a.setBalance(20000);
        a.setID(1001);
        System.out.println(a.displayRecordInfo());
        a.deposit(1500);
        a.withdraw(500);
    }
}
