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
public class Q6Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name :");
        String customername = sc.nextLine();
        System.out.print("Enter customer id :");
        String customerId = sc.nextLine();
        System.out.print("Enter quantity ordered :");
        int quantityOrdered = sc.nextInt();
        System.out.print("Enter price per unit :");
        int pricePerUnit = sc.nextInt();
        System.out.println("");
        Order a = new Order(customername,customerId,quantityOrdered,pricePerUnit);
        System.out.println(a.toString());
        
        System.out.println("");
        ShippedOrder b = new ShippedOrder("joe","123",10,5);
        System.out.println(b.toString());
    }
}
