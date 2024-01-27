/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2017I;

/**
 *
 * @author rz_rexton
 */
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Q3 {
    public static void main(String[] args) {
        
        //generate 6 char text and write to file
        try{
            PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
            System.out.print("The string generated is: ");
            Random g = new Random();
            
            for(int count=0;count<6;count++){
                int ascnum = g.nextInt(58)+65;
                    if((ascnum >=65 && ascnum<=90) || (ascnum>=97 && ascnum<=122)){
                        System.out.print((char)ascnum);
                        out.print((char)ascnum);
                    }else{
                        count--;
                    }
            }
            System.out.println("");
            out.close();
        }catch(IOException e){
            System.out.println("Problem with file output.");
        }
        
        //read generated string & call the sort ascending & descending method &read and print out original sting
        char[] array = new char[6];
        try{
            Scanner in = new Scanner(new FileInputStream("data.txt"));
            while (in.hasNextLine()){
                String line = in.nextLine();
                for(int i=0;i<line.length();i++){
                    array[i]=line.charAt(i);
                }
            }
            in.close();
            char[] original = new char[6];
            for (int i=0;i<original.length;i++){
                original[i]=array[i];
            }
            sort(array,'>');
            System.out.println("");
            sort(array,'<');
            System.out.println("");
            System.out.print("Original string from file: ");
            for(int i=0;i<array.length;i++){
                System.out.print(original[i]);
            }
            System.out.println("");
        }catch(FileNotFoundException e){
            System.out.println("File was not found.");
        }catch(IOException e){
            System.out.println("Problem with file output.");
        }
        
    }
            
    public static void sort(char[] array, char sortseq){
         //ascending
         char temp;
         if (sortseq == '>'){
             System.out.print("String sort in ascending order: ");
             for(int i=0;i<array.length-1;i++){
                 for(int j=0;j<array.length-1;j++){
                     if(array[j]>array[j+1]){
                         temp = array[j];
                         array[j]=array[j+1];
                         array[j+1]=temp;
                     }
                 }
             }
             for(int i=0;i<array.length;i++){
                 System.out.print(array[i]);
             }
         //descending
         }else if (sortseq == '<'){
             System.out.print("String sort in descending order: ");
             for(int i=0;i<array.length-1;i++){
                 for(int j=0;j<array.length-1;j++){
                     if(array[j]<array[j+1]){
                         temp = array[j];
                         array[j]=array[j+1];
                         array[j+1]=temp;
                     }
                 }
             }
             for(int i=0;i<array.length;i++){
                 System.out.print(array[i]);
             }
         }   
    }
}
