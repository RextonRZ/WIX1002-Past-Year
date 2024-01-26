/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2018I;

/**
 *
 * @author rz_rexton
 */
public class Main {
    public static void main(String[] args) {
        Apple a = new Apple("Apple","Red",8);
        Apple b = new Apple("Apple","Green",11);
        Watermelon c = new Watermelon("Watermelon","Local",7.6);
        Watermelon d = new Watermelon("Watermelon","Imported",4);
        
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println("The cheapest item is");
        if(a.totalPrice()<b.totalPrice()&&a.totalPrice()<c.totalPrice()&&a.totalPrice()<d.totalPrice()){
            System.out.println(a.toString());
        }else if (b.totalPrice()<c.totalPrice()&&b.totalPrice()<d.totalPrice()){
            System.out.println(b.toString());
        }else if (c.totalPrice()<d.totalPrice()){
            System.out.println(c.toString());
        }else{
            System.out.println(d.toString());
        }
    }
}
