/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2021I;

/**
 *
 * @author rz_rexton
 */
public class DivideF2 extends Eleven{
    
    public DivideF2(String filename){
        super(filename);
    }
    
    @Override
    public String divide(){
        String div2 = "Divisibility Rule (Formula 2)\n";
        for(int num : array){
           int t = num;
           div2 += num + ", : ";
           while(t >= 100){
               int digit = t % 10;
               t = t/10;
               div2 += t + " - " + digit + " * 1 = " + (t-digit) + ", ";
               t -= digit;
           }
           div2 += "x = " + t + "\n";
           if (t % 11 == 0) div2 += t + " modulus 11 = 0, " + num + " is divisible by 11\n\n";
           else div2 += t + " modulus 11 is not equal to 0, " + num + " is not divisible by 11\n\n";
        }
        return div2;
    }
}
