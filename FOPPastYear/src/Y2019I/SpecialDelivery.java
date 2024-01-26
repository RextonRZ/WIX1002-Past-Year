/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2019I;

/**
 *
 * @author ooiru
 */
public class SpecialDelivery extends Delivery{
    private boolean weekend,nighttime;
    
    public SpecialDelivery(String sender,String recipient,double weight,boolean weekend, boolean nighttime){
        super(sender,recipient,weight);
        this.weekend = weekend;
        this.nighttime = nighttime;
    }
    
    @Override
    public double totalCost(){
        if(weekend && nighttime){
            return (super.totalCost()+ 50)*1.2;
        }else if (weekend){
            return super.totalCost() + 50;
        }else if (nighttime){
            return super.totalCost()*1.20;
        }else{
            return super.totalCost();
        }
    }
    
    public String toString(){
        String result = "";
        result = "From : "+sender+" To: "+recipient+"\nWeight of package : "+weight+" kg\n"+"Shipping Cost : RM"+totalCost();
        if(weekend)
            result +="\nWeekend Delivery";
        if(nighttime)
            result +="\nNighttime Delivery";
        return result;
    }
}
