/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2016II;

/**
 *
 * @author ooiru
 */
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean go = true;
        while(go){
            System.out.print("Enter a number between 0 and 1000: ");
            int num = sc.nextInt();
                if(num>0 &&num<1000){
                    go=false;
                    int sum = 0;
                    while(num!=0){
                        int digit = num%10;
                        sum+=digit;
                        num/=10;
                    }
                    System.out.println("The sum of digit is "+sum);
                }else{
                    go=true;
                }
        }
    }
}
