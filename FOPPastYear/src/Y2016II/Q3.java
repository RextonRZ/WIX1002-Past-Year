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
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int N = sc.nextInt();
        for (int i=1; i<=N; i++){
            for (int j=1; j<=N-i; j++){
                System.out.print(" ");
            }
            for (int j=i; j>0; j--){
                System.out.print(j);
            }
            for (int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
