/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2019I;

/**
 *
 * @author rz_rexton
 */
public class Main {
    public static void main(String[] args) {
        Delivery a = new Delivery("Ali","Ahmad",4.4);
        Delivery b = new Delivery("Ah Chong","Fatimah",63.1);
        SpecialDelivery c = new SpecialDelivery("FSKTM, UM","FK, UM",32.5,true,false);
        SpecialDelivery d = new SpecialDelivery("Ang","Liew",19.0,true,true);
        
        System.out.println(a.toString());
        System.out.println("");
        System.out.println(b.toString());
        System.out.println("");
        System.out.println(c.toString());
        System.out.println("");
        System.out.println(d.toString());
        System.out.println("");
        System.out.println("The total shipping cost is RM"+(a.totalCost()+b.totalCost()+c.totalCost()+d.totalCost()));
    }
}
