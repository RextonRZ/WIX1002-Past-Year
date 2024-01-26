/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2019I;

/**
 *
 * @author rz_rexton
 */
public class Delivery {
    protected String sender,recipient;
    protected double weight; //kg
    
    public Delivery(String sender,String recipient, double weight){
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }
    
    public double totalCost(){
        if(weight >50){
            return 5*2.8+15*5.2+30*7+(weight-50)*8.6;
        }else if (weight >20){
            return 5*2.8+15*5.2+(weight-20)*7;
        }else if (weight >5 ){
            return 5*2.8+(weight-5)*5.2;
        }else{
            return weight*2.8;
        }
    }
    
    public String toString(){
        return "From : "+sender+" To: "+recipient+"\nWeight of package : "+weight+" kg\n"+"Shipping Cost : RM"+totalCost();
    }
}
