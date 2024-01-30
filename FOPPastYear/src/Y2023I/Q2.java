/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2023I;

/**
 *
 * @author rz_rexton
 */
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int N = sc.nextInt();
        while (N<0 || N>10){
            System.out.print("Error !!! ");
            System.out.print("Enter the number of students: ");
            N = sc.nextInt();
        }
        int[][] marks = new int[N][];
        for (int i=0; i<marks.length; i++){
            System.out.print("Enter the number of subjects for student " + (i+1) + ":");
            int subjects = sc.nextInt();
            while (subjects<0 || subjects>10){
                System.out.print("Error !!! ");
                System.out.print("Enter the number of subjects for student ");
                subjects = sc.nextInt();
            }
            marks[i] = new int[subjects];
            for (int j=0; j<marks[i].length; j++){
                System.out.print("Students ("+(i+1)+") Enter mark for Subject "+(j+1)+":");
                int mark = sc.nextInt();
                while (mark<0||mark>100){
                    System.out.print("Error !!! ");
                    System.out.print("Students ("+(i+1)+") Enter mark for Subject "+(j+1)+":");
                    mark = sc.nextInt();
                }
                marks[i][j] = mark;
            }
        }
        int highest = 0;
        int highest_student = 0;
        //print the students' subject score
        System.out.println("List of Students (" + marks.length + " students)");
        for(int i=0; i<marks.length; i++){
            System.out.println("Student " + (i+1));
            int avg = 0;
            for (int j=0; j<marks[i].length; j++){
                System.out.println("Subject " + (j+1) + ":" + marks[i][j]);
                avg += marks[i][j];
            }
            avg /= marks[i].length;
            System.out.println("Average marks: " + avg);
            if (avg > highest){
                highest = avg;
                highest_student = i+1;
            }
        }
        System.out.println("Student " + highest_student + " has the highest average, with " + highest + " marks");
    }
}