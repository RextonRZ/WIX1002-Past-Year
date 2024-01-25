/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2019I;

/**
 *
 * @author rz_rexton
 */
import java.io.*;
import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(new FileInputStream("myAmbition.txt"));
            System.out.println("The essay is : ");
            char[] listchar = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
            int[] charcount = new int[26];
            int wordcount=0 ;
            int sentencecount = 0;
            while(in.hasNextLine()){
                String line = in.nextLine();
                String[] word = line.split(" ");
                wordcount += word.length;
                
                if(line.contains("."))
                    sentencecount++;
                
                for(int i=0; i<line.length();i++){
                    for(int j=0;j<charcount.length;j++){
                        if(line.toUpperCase().charAt(i)==listchar[j]){
                            charcount[j]++;
                        }
                    }
                }
                System.out.println(line);
            }
            in.close();
            System.out.println("");
            System.out.println("Number of sentences : "+sentencecount);
            System.out.println("Number of words : "+wordcount);
            
            System.out.printf("A : %d B : %d C : %d D : %d E : %d F : %d G : %d H : %d\n",charcount[0],charcount[1],charcount[2],charcount[3],charcount[4],charcount[5],charcount[6],charcount[7]);
            System.out.printf("I : %d J : %d K : %d L : %d M : %d N : %d O : %d P : %d\n",charcount[8],charcount[9],charcount[10],charcount[11],charcount[12],charcount[13],charcount[14],charcount[15]);
            System.out.printf("Q : %d R : %d S : %d T : %d U : %d V : %d W : %d X : %d\n",charcount[16],charcount[17],charcount[18],charcount[19],charcount[20],charcount[21],charcount[22],charcount[23]);
            System.out.printf("Y : %d Z : %d\n",charcount[24],charcount[25]);
        }catch(FileNotFoundException e){
        System.out.println("");        
        }catch(IOException e){
            System.out.println("Problem with file output.");
        }
    }
}
