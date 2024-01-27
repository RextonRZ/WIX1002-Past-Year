/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2016II;

/**
 *
 * @author rz_rexton
 */
import java.util.Random;
public class Q5 {
    public static void main(String[] args) {
        Random g = new Random();
        int[][] tictactoe = new int[3][3]; 
        for(int row=0;row<tictactoe.length;row++){
            for(int col=0;col<tictactoe[row].length;col++){
                tictactoe[row][col]=g.nextInt(2);
                System.out.print(tictactoe[row][col]);
            }
            System.out.println("");
        }
        //check every row
        for(int row=0;row<tictactoe.length;row++){
            if(tictactoe[row][0]==tictactoe[row][1]&& tictactoe[row][0]==tictactoe[row][2]){
                System.out.println("All " + tictactoe[row][0]+"s on row "+(row+1));
            }
        }
        
        //check every column
        for(int col=0;col<tictactoe[0].length;col++){
            if(tictactoe[0][col]==tictactoe[1][col]&& tictactoe[0][col]==tictactoe[2][col]){
                System.out.println("All " + tictactoe[0][col]+"s on column "+(col+1));
            }
        }
        
        //check all diagonals
        if(tictactoe[0][0]==tictactoe[1][1]&&tictactoe[0][0]==tictactoe[2][2])
            System.out.println("All " + tictactoe[0][0]+"s on diagonal \\");
        else if(tictactoe[0][2]==tictactoe[1][1]&&tictactoe[0][2]==tictactoe[2][0])
            System.out.println("All " + tictactoe[0][2]+"s on diagonal //");
    }
}
