/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2017II;

/**
 *
 * @author rz_rexton
 */
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of teams: ");
        int team = sc.nextInt();
        sc.nextLine(); // Consume the newline left by nextInt()

        String[][] teamscorelist = new String[team][2];

        for (int i = 0; i < team; i++) {
            System.out.print("Enter team " + (i + 1) + " name: ");
            teamscorelist[i][0] = sc.nextLine();

            System.out.print("Enter team " + (i + 1) + " score: ");
            teamscorelist[i][1] = sc.nextLine();
        }

        System.out.println("List of team with the highest team score first");
        sort(teamscorelist);

        for (int i = 0; i < teamscorelist.length; i++) {
            System.out.print(teamscorelist[i][0] + " (" + teamscorelist[i][1] + ") | \n");
        }
    }

    public static void sort(String[][] list) {
        String tempname;
        String tempscore;

        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (Integer.parseInt(list[j][1]) < Integer.parseInt(list[j + 1][1])) {
                    tempscore = list[j][1];
                    tempname = list[j][0];
                    list[j][1] = list[j + 1][1];
                    list[j][0] = list[j + 1][0];
                    list[j + 1][1] = tempscore;
                    list[j + 1][0] = tempname;
                }
            }
        }
    }
}