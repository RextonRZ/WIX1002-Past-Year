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
import java.util.Random;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random g = new Random();
        System.out.print("Enter the number of random integer: ");
        int num = sc.nextInt();
        int[] randomint = new int[num];
        for (int i=0; i<num;i++){
            int random = g.nextInt(10001);
            randomint[i]=random;
        }
        
        //print all the random num
        System.out.print("The random integer : ");
        for(int i=0;i<randomint.length;i++){
            System.out.print(randomint[i]+" ");
        }
        System.out.println("");
        
        //find min num
        int min = 10001;
        for(int i=0;i<randomint.length;i++){
            if(randomint[i]<min){
                min = randomint[i];
            }
        }
        System.out.println("Minimum number: "+min);
        
        
        //nearest hundred
        int[] nearest100 = new int[num];
        for(int i=0;i<randomint.length;i++){
            if(randomint[i]%100 <50){
                nearest100[i] = randomint[i]-(randomint[i]%100);
            }else{
                nearest100[i] = randomint[i]-(randomint[i]%100)+100;
            }
        }
        System.out.print("The approximation of the integer to the nearest hundred : ");
        for(int numlist: nearest100){
            System.out.print(numlist+" ");
        }
        System.out.println("");
        
        
        // Reverse each number in the array
        int[] reversedArray = new int[num];
        for (int i = 0; i < randomint.length; i++) {
            reversedArray[i] = reverseNumber(randomint[i]);
        }

        // Print reversed array
        System.out.print("Reversed array : ");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
        System.out.println("");
    }

    public static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }
}

