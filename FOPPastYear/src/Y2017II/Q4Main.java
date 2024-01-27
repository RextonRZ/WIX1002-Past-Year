/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2017II;

/**
 *
 * @author ooiru
 */
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.EOFException;
import java.io.FileNotFoundException;
public class Q4Main {
    public static void main(String[] args) {
        writeFile();
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Q4.dat"));
            try{
                while(true){
                    String temp = in.readUTF();
                    int q = Integer.parseInt(temp.substring(0,2));
                    int m = Integer.parseInt(temp.substring(2,4));
                    int y = Integer.parseInt(temp.substring(4));
                    DayOfTheWeek days = new DayOfTheWeek(q,m,y);
                    System.out.println(days.toString());
                }
            }catch(EOFException e){
                 System.out.println("");
            }
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
        catch(IOException e){
            System.out.println("Problem with file output");
        }
    }
    
    public static void writeFile(){
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Q4.dat")); 
            out.writeUTF("25032017");
            out.writeUTF("29022100");
            out.writeUTF("19012017");
            out.writeUTF("31092015");
            out.writeUTF("31052017");
            out.writeUTF("29022016");
            out.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
    }
}

