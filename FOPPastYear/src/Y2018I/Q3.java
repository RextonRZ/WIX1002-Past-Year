/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2018I;

/**
 *
 * @author rz_rexton
 */
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter font size: ");
        int size = sc.nextInt();
        System.out.print("Enter font type: ");
        String type = sc.next();
        System.out.print("Enter format [1 - Vertical, 2 - Horizontal]: ");
        int format = sc.nextInt();
        
        if(format ==1){  
            for(int h=0;h<2;h++){
                for(int i=0;i<3+size-1;i++){
                    System.out.print(type);
                }
                System.out.println("");
                for(int g=0;g<size;g++){
                    System.out.print(type);
                    for(int i=0;i<size;i++){
                        System.out.print(" ");
                    }
                    System.out.println(type);
                }
            }
            for(int i=0;i<3+size-1;i++){
               System.out.print(type);
            }
            System.out.println("");
            
        }else if (format ==2){
            for(int i=0;i<5+2*(size-1);i++){
                System.out.print(type);
            }
            System.out.println("");
            for(int d=0;d<2;d++){
                System.out.print(type);
                for(int f=0;f<size;f++){
                    System.out.print(" ");
                }
            }
            System.out.println(type);
            for(int i=0;i<5+2*(size-1);i++){
                System.out.print(type);
            }
            System.out.println("");
        }
    }
}
