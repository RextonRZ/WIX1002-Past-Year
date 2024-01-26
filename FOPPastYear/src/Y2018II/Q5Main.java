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
public class Q5Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks for Grammar (maximum 30 marks): ");
        int grammar = sc.nextInt();
        System.out.print("Enter the marks for Spelling (maximum 20 marks): ");
        int spelling = sc.nextInt();
        System.out.print("Enter the marks for Length (maximum 20 marks): ");
        int length = sc.nextInt();
        System.out.print("Enter the marks for Content (maximum 30 marks): ");
        int content = sc.nextInt();
        
        Essay a = new Essay(grammar,spelling,length,content);
        System.out.println("\nEssay score:");
        System.out.println(a.toString());
        System.out.println("");
        
        int total = grammar+spelling+length+content;
        System.out.println("Total score: "+total);
        a.setScore(total);
        System.out.println("Essay grade: "+a.getGrade());
        
    }
}
