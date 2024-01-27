/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2017II;

/**
 *
 * @author ooiru
 */
public class PartTimeStaff extends Staff{
    private int numOfWorkingHours;
    
    public PartTimeStaff(String name, String ic, int numOfWorkingHours){
        super(name,ic);
        this.numOfWorkingHours = numOfWorkingHours;
    }
    
    public int getSalary(){
        return numOfWorkingHours *40;
    }
    
    public String toString(){
        return "Name: "+name+"\nIC: "+IC+"\nWorking hours: "+numOfWorkingHours+"\nSalary: "+getSalary();
    }
}
