/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2022I;

/**
 *
 * @author ooiru
 */
import java.util.Random;
public class Q1 {
    static Random g = new Random();
    public static void main(String[] args) {
        System.out.printf("2 random price values : %.2f %.2f %.2f\n",generatePriceRandom(),generatePriceRandom(),generatePriceRandom());
        System.out.printf("5 random even-numbered years : %s %s %s %s %s\n",generateEvenNumberYears(),generateEvenNumberYears(),
                         generateEvenNumberYears(),generateEvenNumberYears(),generateEvenNumberYears());
        System.out.println("Car Plate Number : "+generateCarPlate());
        System.out.println("Random Word : "+generateRandomWord());
    }
    
    public static double generatePriceRandom(){
        int wholenum = g.nextInt(200)+100;
        double decvalue = g.nextDouble();
        double sum = wholenum+decvalue;
        return sum;
    }
    
    public static int generateEvenNumberYears(){
        int year = g.nextInt(41)+1990;
        while(year%2!=0){
            year = g.nextInt(41)+1990;
        }
        return year;
    } 
    
    public static String generateCarPlate(){
        String generatedCarPlate ="";
        //5 digit number first
        for(int i=1;i<=5;i++){
            String number = Integer.toString(g.nextInt(10)); //generate a digit before convert to char
            generatedCarPlate+=number;
        }
        //2 UpperCase Letter
        for(int i=1;i<=2;i++){
            char c = 'Z';
            char randomalpbt = (char)(c-g.nextInt(26));
            generatedCarPlate+=randomalpbt;
        }
        return generatedCarPlate;
    }
    
    public static String generateRandomWord(){
        String randword = "";
        char c = 'Z';
        char b = 'z';
        for(int i=1;i<=8;i++){
            char randomUP = (char)(c-g.nextInt(26));
            char randomLOW = (char)(b-g.nextInt(26));
            int zeroORone = g.nextInt(2);
            if(zeroORone == 0){
                randword+=randomUP;
            }else{
                randword+=randomLOW;
            }
        }
        return randword;
    }
}
