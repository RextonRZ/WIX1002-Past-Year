/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2016I;

/**
 *
 * @author ooiru
 */
public class Rebate extends CreditCard{
    
    public Rebate(String name,String cardNumber){
        super(name,cardNumber);
        super.type = "Cash Rebate";
    }
    
    public double countReward(String item, double amount){
        if(item.equalsIgnoreCase("Fuel"))
            return reward+=amount*0.08;
        else if(item.equalsIgnoreCase("Utility"))
            return reward+=amount*0.05;
        else if(item.equalsIgnoreCase("Grocery"))
            return reward+=amount*0.02;
        else
            return reward+=amount*0.002;
    }
    
    public double getReward(){
        return reward;
    }
    
}
