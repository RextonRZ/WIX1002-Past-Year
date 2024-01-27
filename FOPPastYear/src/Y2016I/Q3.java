/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2016I;

/**
 *
 * @author rz_rexton
 */
import java.util.Scanner;
import java.util.Random;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random g = new Random();
        System.out.print("Enter the number of random integer: ");
        int num = sc.nextInt();
        System.out.print("The random integer : ");
        int[] list = new int[num];
        for(int i=0;i<num;i++){
            list[i] = g.nextInt(1001);
            System.out.print(list[i]+" ");
        }
        
        //find max num
        int max = 0;
        for(int i=0;i<list.length;i++){
            if (list[i]>max)
                max = list[i];
        }
        System.out.println("\nMaximum number : "+max);
        
        //nearest tenth
        int[] nearest10 = new int[num];
        System.out.print("The approximation of the integer to the nearest tenth : ");
        for(int i=0;i<list.length;i++){
            if (list[i]%10>=5){
                nearest10[i] = list[i]-(list[i]%10)+10;
                System.out.print(nearest10[i]+" ");
            }else{
                nearest10[i] = list[i]-(list[i]%10);
                System.out.print(nearest10[i]+" ");
            }
        }
        
        //reversed num in array
        System.out.print("\nThe random integer in reversed order: ");
        int[] reversed = new int[num];
        for(int i=0;i<list.length;i++){
            reversed[i]=reversedNum(list[i]);
            System.out.print(reversed[i]+" ");
        }
        System.out.println("");
    }
    
    public static int reversedNum(int i){
        int reversed = 0;
        while(i!=0){
            int digit = i%10;
            reversed = reversed*10+digit;
            i/=10;
        }
        return reversed;
    }
}
