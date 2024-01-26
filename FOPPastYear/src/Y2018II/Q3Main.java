/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2018II;

/**
 *
 * @author rz_rexton
 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Q3Main {
    public static void main(String[] args) {
        
        String[][] record = new String[10][2];
        String[] name= new String[10];
        int[] marks = new int[10];
        try{
            Scanner in = new Scanner(new FileInputStream("student.txt"));
            while(in.hasNextLine()){
                for(int i = 0; i<record.length;i++){
                    record[i] = in.nextLine().split(", ");
                    name[i]= record[i][0];
                    marks[i] = Integer.parseInt(record[i][1]);
                }
            }
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
            e.printStackTrace();
        }catch(IOException e){
            System.out.println("Problem with file output.");
        }
        
        
        //search highest,lowest & count absent
        int totalabsent=0,highestmark=0,lowestmark=100;
        String highestname=null,lowestname=null;
        for(int i=0;i<marks.length;i++){
            if(marks[i]==-1){
                totalabsent++;
            }else if (marks[i]>highestmark){
                highestmark = marks[i];
                highestname = name[i];
            }else if(marks[i]<lowestmark){
                lowestmark=marks[i];
                lowestname = name[i];
            }
        }
        
        System.out.println("The student with the highest mark : "+ highestname+" "+highestmark);
        System.out.println("The student with the lowest mark : "+ lowestname+" "+lowestmark);
        System.out.println("The number of students who were absent from the exam: "+totalabsent);
    }

}