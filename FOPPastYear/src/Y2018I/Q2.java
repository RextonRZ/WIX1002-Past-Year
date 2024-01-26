/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2018I;

/**
 *
 * @author ooiru
 */
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random g = new Random();
        int groupA=0,groupAA=0,groupAAA=0;
        System.out.print("Enter N number: ");
        int N = sc.nextInt();
        int[] list = new int[N];
        System.out.print("The random numbers are: ");
        for(int i=0;i<N;i++){
            int num = g.nextInt(101)+50;
            list[i]=num;
            System.out.print(num+" ");
        }
        System.out.println("");
        
        for(int num : list){
                if(num%10<4)
                    groupAAA++;
                else if(num%100<7)
                    groupAA++;
                else
                    groupA++;
        }
        System.out.println("Group AAA : "+groupAAA);
        System.out.println("Group AA : "+groupAA);
        System.out.println("Group A : "+groupA);
    }
}
