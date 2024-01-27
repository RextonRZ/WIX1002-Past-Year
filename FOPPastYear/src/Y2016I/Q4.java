/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2016I;

/**
 *
 * @author rz_rexton
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        String[] pwlist = new String[9];
        int i=0;
        try{
            Scanner in = new Scanner(new FileInputStream("PW.txt"));
            while(in.hasNextLine()){
                pwlist[i] = in.nextLine();
                if(isStrongPW(pwlist[i])){
                    System.out.println("Strong password.");
                }else{
                    System.out.println("Not a strong password.");
                }
                i++;
            }
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }catch(IOException e){
            System.out.println("Problem with file output.");
        }
    }
    
    public static boolean isStrongPW(String a){
        boolean length=false,upper=false,lower = false, digit = false,special = false;
        for(int i=0;i<a.length();i++){
            char temp = a.charAt(i);
            if(a.length()>=8)
                length = true;
            if(Character.isUpperCase(temp))
                upper = true;
            if(Character.isLowerCase(temp))
                lower = true;
            if(Character.isDigit(temp))
                digit = true;
            if(!Character.isLetterOrDigit(temp))
                special = true;
        }
        return length&&upper&&lower&&digit&&special;
    }
}
