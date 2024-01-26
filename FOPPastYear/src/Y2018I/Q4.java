/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2018I;

/**
 *
 * @author ooiru
 */
import java.util.Scanner;
import java.io.*;

public class Q4 {
    public static void main(String[] args) {
        double[] scores = new double[5];
        String[] scorenppl = {};
        String[] name = {};
        double difficulty;
        double highest = 0, lowest = 10, total = 0, finalscore = 0, winnerScore = 0;
        String winnerName = ""; // Variable to store the name of the winner
        int count = 0;
        
        try {
            Scanner in = new Scanner(new FileInputStream("Q4.txt"));
            
            while (in.hasNextLine()) {
                total = 0;
                String line = in.nextLine();
                scorenppl = line.split(",");
                
                for (int i = 1; i < 6; i++) {
                    scores[i - 1] = Double.parseDouble(scorenppl[i]);
                    total += scores[i - 1];
                }
                
                difficulty = Double.parseDouble(scorenppl[scorenppl.length - 1]);
                highest = 0;
                lowest = 10;
                
                for (double score : scores) {
                    if (score > highest) {
                        highest = score;
                    }
                    if (score < lowest) {
                        lowest = score;
                    }
                }
                
                finalscore = (total - highest - lowest) * difficulty;
                
                // Check if the current participant has a higher score than the current winner
                if (finalscore > winnerScore) {
                    winnerScore = finalscore;
                    winnerName = scorenppl[0]; // Update the winner's name
                }
                
                count++;
                System.out.println(scorenppl[0] + " score " + finalscore);
            }
            
            in.close();
            
            // Print the name of the winner
            System.out.println(winnerName + " is the winner");
            
        } catch (FileNotFoundException e) {
            System.out.println("File was not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Problem with file output");
            e.printStackTrace();
        }
    }
}