/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2019II;

/**
 *
 * @author rz_rexton
 */

//Filename: Q1 java
//The purpose of this program is to count and display the total number of even integers in the array.
//Another purpose is to find the biggest integer in the array and display it.
//The output based on the given list, should be as below.
//The number of even integers is 3.
//The biggest Integer is 74

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int[] num = {66, 15, 20, 27, 74, 33};
        int cnt=0;
        for (int k = 0; k < num.length; k++){
            if (isEven(num[k])){
                cnt++;
             }
        }
        System.out.println("The number of even integers is " + cnt);
        System.out.println("The biggest integer is " + findMax(num));
    }
    
    public static boolean isEven(int a) {
        if (a%2==0)
            return true;
        else
            return false;
    }
    
    public static int findMax(int[] a) {
        int max = a[0];
        for (int n = 1; n < a.length; n++){
            if (a[n] > max)
                max = a[n];
        }
        return max;
    }
}// end class

