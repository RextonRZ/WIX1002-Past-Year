/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2019II;

/**
 *
 * @author rz_rexton
 */
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of bags sold : ");
        int numberOfBags = sc.nextInt();
        
        System.out.print("Enter the weight per bag(kilogram): ");
        double unitWeight = sc.nextDouble();
        
        double totalPrice = unitWeight * numberOfBags * 5.99 ;
        double totalPriceWithTax = totalPrice + totalPrice * 0.0725 ;
        
        System.out.println("");
        System.out.printf("Price per kilogram : $%3.2f\n",5.99);
        System.out.printf("Sales tax : %14.2f",7.25,"%");
        System.out.printf("\nTotal price : %9s%.2f\n","$ ",totalPriceWithTax);
    }
}
