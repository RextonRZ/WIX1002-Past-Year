/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2023I;

/**
 *
 * @author ooiru
 */
public class Node {
    private String name, Partitions;
    private int CPUTot, CPUAlloc, RealMemory, AllocMem;

    public Node(String name,int CPUTot, int CPUAlloc, int RealMemory, int AllocMem, String Partitions) {
        this.name = name;
        this.Partitions = Partitions;
        this.CPUTot = CPUTot;
        this.CPUAlloc = CPUAlloc;
        this.RealMemory = RealMemory;
        this.AllocMem = AllocMem;
    }

    public String getName() {
        return name;
    }

    public String getPartitions() {
        return Partitions;
    }

    public int getCPUTot() {
        return CPUTot;
    }

    public int getCPUAlloc() {
        return CPUAlloc;
    }

    public int getRealMemory() {
        return RealMemory;
    }

    public int getAllocMem() {
        return AllocMem;
    }
    
    public double computeRatio(){
        return Math.abs((double)(CPUTot-CPUAlloc)/CPUTot - (double)(RealMemory - AllocMem)/RealMemory);
    }
}
