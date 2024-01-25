/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2020;

/**
 *
 * @author ooiru
 */
public class CloudPackage extends Cloud{
    private int core,memory;
    private double pricePerHour;
    
    public CloudPackage(String name,double totalcost){
        super(name,totalcost);
    }
    public CloudPackage(String name, int core, int memory, double pricePerHour){
        super(name,0);
        this.core = core;
        this.memory = memory;
        this.pricePerHour = pricePerHour;
    }
    
    public boolean check(Job a){
        return memory>= a.getMemory();
    }
    
    public double totalCost(Job a){
        totalcost =  Math.round((a.getNumOfTask()*pricePerHour/core)*100.0)/100.0;
        return totalcost;
    }
}
