/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2018I;

/**
 *
 * @author ooiru
 */
public abstract class Fruit {
    protected String name,type;
    
    public Fruit(String name, String type){
        this.name=name;
        this.type = type;
    }
    
    abstract double totalPrice();
    
    public String toString(){
        return type+" "+name+" - ";
    }
}
