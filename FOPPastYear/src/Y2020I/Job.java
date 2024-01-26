/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2020I;

/**
 *
 * @author ooiru
 */
public class Job {
    private String name;
    private int numOfTask,memory;
    
    public Job(String name, int numOfTask, int memory){
        this.name = name;
        this.numOfTask = numOfTask;
        this.memory = memory;
    }
    
    public String getName(){
        return name;
    }
    
    public int getNumOfTask(){
        return numOfTask;
    }
    
    public int getMemory(){
        return memory;
    }
    
    public String toString(){
        return "Job name : "+name+" Memory = "+memory+"GB Num of Task = "+numOfTask;
    }
}
