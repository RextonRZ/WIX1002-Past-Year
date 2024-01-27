/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2017II;

/**
 *
 * @author ooiru
 */
public class PermanentStaff extends Staff{
    private String grade;
    
    public PermanentStaff(String name, String IC,String grade){
        super(name,IC);
        this.grade = grade;
    }
    
    public int getSalary(){
        int salary = 0;
        switch(grade){
            case "EM01":
                salary = 7000;
                break;
            case "EM02":
                salary = 5000;
                break;
            case "EM03":
                salary = 3000;
                break;
            case "EM04":
                salary = 1000;
                break;
        }
        return salary;
    }
    
    @Override
    public String toString(){
        return "Name: "+name+"\nIC: "+IC+"\nGrade: "+grade+"\nSalary: "+getSalary();
    }
}
