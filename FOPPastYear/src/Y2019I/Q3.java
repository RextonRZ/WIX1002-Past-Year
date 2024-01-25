/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2019I;

/**
 *
 * @author rz_rexton
 */
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter genome string [quit to stop] : ");
        String input;

        while (!(input = sc.next()).equals("quit")) {
            boolean check = false;

            for (int i = 0; i < input.length() - 2; i++) {
                if (input.substring(i, i + 3).equals("ATG")) {
                    StringBuilder gene = new StringBuilder();

                    for (int j = i + 3; j < input.length(); j += 3) {
                        if ((j + 3) > input.length()) {
                            break;
                        }
                        String temp = input.substring(j, j + 3);

                        if (temp.equals("TAG") || temp.equals("TAA") || temp.equals("TGA")) {
                                if(!(gene.toString()).equals(""))
                                System.out.println(gene.toString());
                                check = true;
                                break;
                        } else {
                            gene.append(temp);
                        }
                    }
                }
            }

            if (!check || input.equals("ATGTGA")) {
                System.out.println("No gene is found");
            }

            System.out.print("Enter genome string [quit to stop] : ");
        }

        sc.close(); // Close the scanner when done
    }
}