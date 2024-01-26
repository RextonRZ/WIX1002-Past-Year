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
public class Q4Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values for a, b, c, d, e and f : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        
        LinearEquation eq1 = new LinearEquation(a,b,c,d,e,f);
        System.out.println("");
        System.out.println("The equation: ");
        System.out.println(eq1.toString());
        
        System.out.println("");
        if(!eq1.isSolvable()){
            System.out.println("The equation has no solution.");
        }
        else{
            System.out.println("x = "+ (int)eq1.computeX()+" ; y = "+(int)eq1.computeY());
        }
    }
}
