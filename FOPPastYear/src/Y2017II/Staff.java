/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2017II;

/**
 *
 * @author rz_rexton
 */
public class Staff {
    protected String name,IC;
    
    public Staff(String name,String IC){
        this.name = name;
        this.IC = IC;
    }
    
    public String toString(){
        return "Name: "+name+"\nIC: "+IC;
    }
}
