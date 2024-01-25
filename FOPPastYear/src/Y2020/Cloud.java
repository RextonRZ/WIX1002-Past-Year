/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2020;

/**
 *
 * @author rz_rexton
 */
public class Cloud {
    protected String name;
    protected double totalcost;
    
    public Cloud(String name, double totalcost){
        this.name = name;
        this.totalcost = totalcost;
    }
    
    public double getTotalCost(){
        return totalcost;
    }
    
    public String toString(){
        return "Cloud package: "+name+" Total cost= "+totalcost;
    }
}

