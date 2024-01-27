/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2016I;

/**
 *
 * @author ooiru
 */
import java.util.Scanner;
import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random g = new Random();
        String[] RPS = {"Paper", "Scissor", "Rock"};
        boolean endGame = false;
        int userscore = 0, compscore = 0;

        while (!endGame) {
            System.out.print("Enter 1.Paper 2.Scissor 3.Rock: ");

            int input = sc.nextInt();
            int randomcomp = g.nextInt(3);

            String playermove = RPS[input - 1];
            String computermove = RPS[randomcomp];
            System.out.println("Player: " + playermove + " ----- Computer: " + computermove);

            if ((playermove.equals("Paper") && computermove.equals("Scissor")) ||
                (playermove.equals("Scissor") && computermove.equals("Rock")) ||
                (playermove.equals("Rock") && computermove.equals("Paper"))) {
                compscore++;
                System.out.println("Computer wins " + compscore + " time(s)");
            } else if ((playermove.equals("Paper") && computermove.equals("Rock")) ||
                       (playermove.equals("Scissor") && computermove.equals("Paper")) ||
                       (playermove.equals("Rock") && computermove.equals("Scissor"))) {
                userscore++;
                System.out.println("Player wins " + userscore + " time(s)");
            } else {
                // Tie, no one wins
            }

            if (userscore == 3 || compscore == 3) {
                endGame = true;
                System.out.println(userscore == 3 ? "Player wins the game." : "Computer wins the game.");
            }
        }
    }
}
