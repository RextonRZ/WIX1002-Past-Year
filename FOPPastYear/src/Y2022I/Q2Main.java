/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2022I;

/**
 *
 * @author rz_rexton
 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q2Main {
    public static void main(String[] args) {
        Scanner in = null; // Declare the Scanner outside the try block

        try {
            in = new Scanner(new FileInputStream("diving.txt"));

            int totalline = 0;
            while (in.hasNextLine()) {
                totalline++;
                in.nextLine();
            }

            int totalplayers = totalline / 5;

            // Reset the Scanner to the beginning of the file
            in.close();
            in = new Scanner(new FileInputStream("diving.txt"));

            Diving[] divers = new Diving[totalplayers];

            for (int i = 0; i < totalplayers; i++) {
                String name = in.nextLine();
                String country = in.nextLine();
                double scores[][] = new double[3][7];
                double difficulty[] = new double[3];

                for (int round = 0; round < 3; round++) {
                    for (int judge = 0; judge < 7; judge++) {
                        scores[round][judge] = in.nextDouble();
                    }
                    difficulty[round] = in.nextDouble();
                }

                divers[i] = new Diving(name, country, scores, difficulty);
                in.nextLine(); // Consume the newline after difficulty
            }

            // Print information for each diver
            for (Diving d : divers) {
                System.out.println(d.toString());
                System.out.println("");
            }
            
            //sort the divers ranking according to final score(descending)
            //bubble sort
            for(int i=0;i<divers.length-1;i++){
                for(int j=0;j<divers.length-1;j++){
                    if(divers[j].computeFinalScore()<divers[j+1].computeFinalScore()){
                        Diving temp = divers[j];
                        divers[j]=divers[j+1];
                        divers[j+1] = temp;
                    }
                }
            }
            
            System.out.print("\nGold : "+divers[0].getName()+" ("+divers[0].getCountry()+") ");
            System.out.print("\nSilver : "+divers[1].getName()+" ("+divers[1].getCountry()+") ");
            System.out.print("\nBronze : "+divers[2].getName()+" ("+divers[2].getCountry()+") \n");

        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        } finally {
            if (in != null) {
                in.close(); // Close the Scanner in the finally block
            }
        }
    }
}
