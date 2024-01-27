/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2016I;

/**
 *
 * @author ooiru
 */
public class Point extends CreditCard{
    public Point(String name,String cardNumber){
        super(name,cardNumber);
        super.type = "Point Reward";
    }
    
    public double countReward(String day, double price){
        if(day.equalsIgnoreCase("Friday"))
            return reward+=(double)((int)price)*2/100;
        else if(day.equalsIgnoreCase("Saturday"))
            return reward+=(double)((int)price)*3/100;
        else if(day.equalsIgnoreCase("Sunday"))
            return reward+=(double)((int)price)*4/100;
        else
            return reward+=(double)((int)price)/100;
    }
    
    public double getReward(){
        return reward;
    }
}
