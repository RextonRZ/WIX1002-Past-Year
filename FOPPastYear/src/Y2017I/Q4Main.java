/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2017I;

/**
 *
 * @author rz)rexton
 */
import java.util.Scanner;
public class Q4Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First complex number. Enter a number for the real part: ");
        int r1 =sc.nextInt();
        
        System.out.print("First complex number. Enter a number for the imaginary part: ");
        int i1 = sc.nextInt();
        
        System.out.print("Second complex number. Enter a number for the real part: ");
        int r2 =sc.nextInt();
        
        System.out.print("Second complex number. Enter a number for the imaginary part: ");
        int i2 = sc.nextInt();
        
        System.out.println("");
        System.out.print("First complex number: ");
        Complex a = new Complex(r1,i1);
        System.out.print(a.toString());
        System.out.print("\nSecond complex number: ");
        Complex b = new Complex(r2,i2);
        System.out.print(b.toString());
        System.out.println("");
        System.out.print("Addition of the two complement numbers: ");
        System.out.println(a.addComplexNum(b).toString());
        System.out.print("Subtraction of the two complement numbers: ");
        System.out.println(a.subtractComplexNum(b).toString());
    }
}
