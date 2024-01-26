/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2019II;

/**
 *
 * @author ooiru
 */
import java.util.Random;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
            Random g = new Random();
            Scanner sc = new Scanner(System.in);
            boolean nextq = true;
            while(nextq){
            int num1 = g.nextInt(10);
            int num2 = g.nextInt(10);
            int result = num1+num2;
            System.out.print("What is "+num1+" + "+num2+" ? ");
            int ans = sc.nextInt();
            System.out.println(num1+" + "+num2+" = "+ans+" is "+(ans==result));
            boolean tryq = true;
            while(tryq){
            System.out.print("Do you want to try another question (y/n) ? ");
            String moreq = sc.next();
            if(moreq.equals("y")){
                tryq = false;
            }else if(moreq.equals("n")){
                nextq = false;
                tryq = false;
            }else{
                tryq = true;
            }
            }
            }
    }
}
