/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2018I;

/**
 *
 * @author ooiru
 */
public class Watermelon extends Fruit{
    private double weight;
    
    public Watermelon(String name, String type,double weight){
        super(name,type);
        this.weight = weight;
    }
    
    @Override
    public double totalPrice(){
        if(type.equalsIgnoreCase("Imported")){
            if(weight>5){
                return weight*3.15;
            }else if (weight >=2){
                return weight*3.45;
            }else {
                return weight*3.75;
            }
        }else if (type.equalsIgnoreCase("Local")){
            if(weight>5){
                return weight*1.65;
            }else if (weight >=2){
                return weight*1.95;
            }else {
                return weight*2.25;
            }
        }else{
            return 0;
        }
    }
    
    @Override
    public String toString(){
        return type+" "+name+" - "+weight+"kg"+" = RM "+totalPrice();
    }
}
