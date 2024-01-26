/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2020I;

/**
 *
 * @author ooiru
 */
import java.util.*;
import java.io.*;
public class Q3 {
    
    private static int[] readFile(){
        int[] num = new int [5];
        try{
            Scanner in = new Scanner(new FileInputStream("raw.txt"));
            while (in.hasNextLine()){
                int value = in.nextInt();
                switch(value){
                    case 2:
                        num[0]++;
                        break;
                    case 4:
                        num[1]++;
                        break;
                    case 6:
                        num[2]++;
                        break;
                    case 8:
                        num[3]++;
                        break;
                    case 10:
                        num[4]++;
                        break;
                }
            }
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("Problem with file output");
            e.printStackTrace();
        }
        return num;
    }
    
    private static int checkMode(int[] numbers){
        int mode=0;
        int[] even = {2,4,6,8,10};
        for(int i=0;i<numbers.length-1;i++){
            if (numbers[i+1]>numbers[i])
                mode = even[i+1];
        }
        return mode;
    }
    
    public static void main(String[] args) {
        int[] result = readFile();
        System.out.println("Frequency Distribution Table");
        System.out.println("2  : "+ result[0]);
        System.out.println("4  : "+ result[1]);
        System.out.println("6  : "+ result[2]);
        System.out.println("8  : "+ result[3]);
        System.out.println("10 : "+ result[4]);
        int mode = checkMode(result);
        System.out.println("The mode of the dataset is: "+ mode);
    }
}
