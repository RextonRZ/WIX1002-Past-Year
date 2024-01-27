/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2016I;

/**
 *
 * @author rz_rexton
 */
public class Q5 {
    public static void main(String[] args) {
        Rebate r = new Rebate("John Lim", "1111222233334444");
        Point p = new Point("John Lim", "5555666677778888");
        r.countReward("Grocery", 124.80);
        p.countReward("Saturday", 124.80);
        r.countReward("Other", 64.60);
        p.countReward("Friday", 64.60);
        r.countReward("Fuel", 95.40);
        p.countReward("Sunday", 95.40);
        r.countReward("Utility", 100);
        p.countReward("Friday", 100);
        r.countReward("Other", 220);
        p.countReward("Tuesday", 220);
        
        System.out.println(r.toString());
        System.out.println(p.toString());
        if(r.getReward()>p.getReward()){
            System.out.println("The best card is Cash Rebate Card");
        }else{
            System.out.println("The best card is Point Reward Card");
        }
    }
}
