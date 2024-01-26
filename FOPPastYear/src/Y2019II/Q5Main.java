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
public class Q5Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values for a, b and c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println("The equation is : "+ a+"x(^2) +("+b+")x + ("+c+")");
        QuadraticEquation eq1 = new QuadraticEquation(a,b,c);
        System.out.println("Discriminant : " + (int)eq1.Discriminant());
        if(eq1.Discriminant()<0){
            System.out.println("The equation has no roots");
        }
        else if (eq1.Discriminant()==0){
            System.out.println("Same roots: "+ (int)eq1.calcRoot1());
        }
        else{
            System.out.println("The roots: "+ (int)eq1.calcRoot1()+" and "+(int)eq1.calcRoot2());
        }
    }
}
