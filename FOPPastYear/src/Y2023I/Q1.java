/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2023I;

/**
 *
 * @author rz_rexton
 */
import java.util.Random;
public class Q1 {
    public static void main(String[] args) {
        Random g = new Random();
        int num = g.nextInt(1001); //upper bound of 1000
        System.out.println("Generated number: "+num);
        System.out.println("Number in reversed order: "+reversedNumber(num));
        System.out.println("The sum of all integers: "+ Integer.toString(num).length());
    }
    
    public static String reversedNumber(int a){
        int temp =a;   //temp to store num
        int count=0;
        int reversedNum=0;
        while(temp>0){
            int digit = temp%10;
            temp/=10;
            reversedNum = reversedNum*10+digit;
            count++;
        }
        if (count==4)                //do this because if 450, after reversed need to make sure it's 045
            return String.format("%04d", reversedNum);
        else if(count==3)
            return String.format("%03d", reversedNum);
        else if(count==2)
            return String.format("%02d", reversedNum);
        else
            return Integer.toString(reversedNum);
    }
}
