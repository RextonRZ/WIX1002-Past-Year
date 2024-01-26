/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2018I;

/**
 *
 * @author ooiru
 */
public class Apple extends Fruit{
    private int quantity;
    
    public Apple(String name, String type,int quantity){
        super(name,type);
        this.quantity = quantity;
    }
    
    public double totalPrice(){
        if(type.equalsIgnoreCase("Green")){
            return 1.2*quantity;
        }else if (type.equalsIgnoreCase("Red")){
            return 1.8*quantity;
        }else{
            return 0;
        }
    }
    
    public String toString(){
        return type+" "+name+" - "+quantity+" = RM "+totalPrice();
    }
}
