/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2018II;

/**
 *
 * @author rz_rexton
 */
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bags sold : ");
        int numberOfBags = sc.nextInt();
        System.out.print("Enter the weight per bag (kilogram) : ");
        double unitWeight = sc.nextDouble();
        
        double totalPrice = unitWeight*numberOfBags*5.99;
        double totalPriceWithTax = totalPrice +totalPrice*0.0725;
        
        System.out.print("Price per kilogram:     $5.99");
        System.out.printf("\nSales tax: %18.2f%s",7.25,"%");
        System.out.printf("\nTotal price after tax: %4s%.2f","$ ",totalPriceWithTax);
        System.out.println("");
        
    }
}
