/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2016II;

/**
 *
 * @author rz_rexton
 */
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n for a regular polygon, n: ");
        int num = sc.nextInt();
        System.out.print("Enter the length of a particular side of the regular polygon (in metre), s: ");
        double s = sc.nextDouble();
        System.out.printf("The area is: %.2f squared meters.", area(num,s));
        System.out.println("");
    }
    public static double area(int num, double s){
        return (num*s*s)/(4*Math.tan(Math.toRadians(180/num))); //radian 
    }
}
