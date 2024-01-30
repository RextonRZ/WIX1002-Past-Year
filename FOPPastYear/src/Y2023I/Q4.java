/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2023I;

/**
 *
 * @author ooiru
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q4 {
    public static void main(String[] args) {
        Node[] nodes = new Node[countNodes("nodelist.txt")];
        loadData(nodes, "nodelist.txt");
        System.out.println("+----------------------------------------------------+");
            System.out.printf("| %-8s%-16s%-11s%-10s%s |\n","Node","Partitions","CPU","MEMORY","RATIO");
            System.out.println("+----------------------------------------------------+");
            for (Node node : nodes) {
                System.out.printf("| %-8s%-16s%-11s%-10s%.3f |\n",node.getName(),node.getPartitions(),node.getCPUTot()-node.getCPUAlloc() + " / " + node.getCPUTot(),node.getRealMemory()/1024-node.getCPUAlloc()/1024 + " / " + node.getRealMemory()/1024,node.computeRatio());
            }
            System.out.println("+----------------------------------------------------+");

    }
    
    public static int countNodes(String inputFile){
        int count=1;
        try{
            BufferedReader in = new BufferedReader(new FileReader(inputFile));
            String line;
            while ((line=in.readLine())!=null){
                if(line.startsWith("NodeName"))
                    count++;
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("Problem with file input");
        }
        return count;
    }
    
    public static void loadData(Node[] nodes, String inputFile){
        try{
            BufferedReader in = new BufferedReader(new FileReader(inputFile));
            String line;
            for (int i=0; i<nodes.length; i++){
                String name=null, partition;
                int cputot=0, cpualloc=0, realmem=0, memalloc=0;
                while ((line=in.readLine())!=null){
                    if (line.indexOf("NodeName")!=-1){
                        String[] extract = line.trim().split("\\s+"); //trim removing leading space, \\s is spacing
                        name = extract[0].substring(extract[0].indexOf("NodeName")+9);
                    }
                    if (line.indexOf("CPUAlloc")!=-1){
                        String[] extract = line.trim().split("\\s+");
                        //System.out.println(extract[0].substring(extract[0].indexOf("CPUAlloc")+9));//testing
                        cpualloc = Integer.parseInt(extract[0].substring(extract[0].indexOf("CPUAlloc")+9));
                        cputot = Integer.parseInt(extract[1].substring(extract[1].indexOf("CPUTot")+7));
                    }
                    if (line.indexOf("RealMemory")!=-1){
                        String[] extract = line.trim().split("\\s+"); 
                        realmem = Integer.parseInt(extract[0].substring(extract[0].indexOf("RealMemory")+11));
                        memalloc = Integer.parseInt(extract[1].substring(extract[1].indexOf("AllocMem")+9));
                    }
                    if (line.indexOf("Partitions")!=-1){
                        String[] extract = line.trim().split("\\s+");
                        partition = extract[0].substring(extract[0].indexOf("Partitions")+11);
                        nodes[i] = new Node(name, cputot, cpualloc, realmem, memalloc, partition);
                        break;
                    }
                }
            }

        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("Problem with file input");
        }
    }
}
