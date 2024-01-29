/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2021I;

/**
 *
 * @author ooiru
 */
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.EOFException;
import java.io.IOException;

public abstract class Eleven {
    protected int[] array;
    protected String filename;
    
    public Eleven(String filename){
        this.filename = filename;
        int num = 0;
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
            try{
                while(true){
                    in.readInt();
                    num++;   
                }             
            }catch(EOFException eof){}
            
            
            in = new ObjectInputStream(new FileInputStream(filename));
            array = new int[num];
            int i=0;
            try{
                while(true){
                    array[i++] = in.readInt();
                }    
            }catch(EOFException eof){}
        }catch(IOException e){
            System.out.println("File was not found");
        }
    }
    
    public abstract String divide();
}
