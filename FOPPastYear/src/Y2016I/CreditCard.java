/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2016I;

/**
 *
 * @author rz_rexton
 */
public class CreditCard {
    protected String name, cardNumber,type;
    protected double reward;
    
    public CreditCard(String name,String cardNumber){
        this.name = name;
        this.cardNumber = cardNumber;
    }
    //accessor
    public double getReward() {
        return reward;
    }
    //mutator
    public void setReward(double reward) {
        this.reward = reward;
    }
    
    public String toString(){
        return "Credit Card : "+ name+" ("+cardNumber+") \nCard Type : "+type+"\nTotal Cash Reward : "+reward;
    }
   
}
