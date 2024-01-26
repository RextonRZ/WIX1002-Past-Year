/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2020I;

/**
 *
 * @author rz_rexton
 */
public class Main {
    public static void main(String[] args) {
        Job J1 = new Job("J1",252,20);
        Job J2 = new Job("J2",108,10);
        Job J3 = new Job("J3",72,25);
        
        CloudPackage a = new CloudPackage("P2-15",4,15,1.24);
        CloudPackage b = new CloudPackage("P2-30",6,30,2.11);
        CloudPackage c = new CloudPackage("R5-20",4,20,1.38);
        CloudPackage d = new CloudPackage("R6-20",6,20,1.88);
        
        Job joblist[] = {J1,J2,J3};
        CloudPackage cloudpackagelist[] = {a,b,c,d};
        
        double totalcost = 0;
        for(Job i: joblist){
            CloudPackage cheapest = new CloudPackage("temp",1,10,10);
            for(CloudPackage j : cloudpackagelist){
                if(j.check(i)&& j.totalCost(i)< cheapest.totalCost(i)){
                    cheapest = j;
                }
            }
            totalcost += cheapest.totalCost(i);
            System.out.println(i.toString());
            System.out.println(cheapest.toString());
        }
        System.out.printf("Total cost: %.2f\n", totalcost);
    }
}
