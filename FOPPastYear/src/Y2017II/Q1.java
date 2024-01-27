/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2017II;

/**
 *
 * @author ooiru
 */
import java.util.Scanner;
// Filename: Q1 java
public class Q1 {
    public static void main(String[] args) {
        int N;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        N = s.nextInt();
        System.out.println("The first " + N + " triangular numbers");
        for(int i=1; i<=N; i++){
            System.out.print(getTriangular(i) + " ");
            System.out.println("");
        }
    }
    
    public static int getTriangular(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        return sum;
    }
}

    
