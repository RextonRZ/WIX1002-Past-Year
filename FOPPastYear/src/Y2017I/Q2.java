/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2017I;

/**
 *
 * @author rz_rexton
 */
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial tuition fee (i.e year 1): ");
        double fee = sc.nextDouble();
        System.out.print("Enter the yearly rate of increment (e.g enter 5.2 for 5.2%): ");
        double rate =sc.nextDouble();
        System.out.print("Enter the year for which you wish to compute the tuition fee for: ");
        int year = sc.nextInt();
        
        System.out.printf("\nComputed tuition fee for year %d is %.2f\n",year,computeFee(fee,rate,year));
    }
    
    public static double computeFee(double fee,double rate, double year){
        return fee*(Math.pow(rate/100+1, year));
    }
}
