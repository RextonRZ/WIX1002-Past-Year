/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2023I;

/**
 *
 * @author rz_rexton
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OceanData {
    public static void main(String[] args) {
        String inputFile = "ocean_data.csv";
        DataBuoy[] data = new DataBuoy[25];
        float avg_water_temp;
        
        loadData(inputFile, data);
        showData(data);
        
        avg_water_temp = calculateAvgWaterTemp(data);
        System.out.println("\nAverage water temperature is " + avg_water_temp);
        
        printMap(data, avg_water_temp);
    }
    
    public static void loadData(String inputFile, DataBuoy[] data){
        try{
            BufferedReader in = new BufferedReader(new FileReader(inputFile));
            String line;
            int i=0;
            while ((line=in.readLine())!=null){
                String[] raw = line.split(",");
                data[i] = new DataBuoy(raw[0], Integer.parseInt(raw[1]), Integer.parseInt(raw[2]), Float.parseFloat(raw[3]), Float.parseFloat(raw[4]));
                i++;
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found.");
        }catch (IOException e){
            System.out.println("Problem with file input");
        }
    }
    
    public static void showData(DataBuoy[] data){
        System.out.println("Data read from buoy: ");
        System.out.printf("%-20s%-10s%-10s%-10s%-10s\n","buoy_id","lat","long","air_t","water_t");
        for (DataBuoy buoy : data){
            System.out.printf("%-20s%-10s%-10s%-10s%-10s\n",buoy.getId(),buoy.getLatitude(),buoy.getLongitude(), buoy.getAir_t(), buoy.getWater_t());
        }
    }
    
    public static float calculateAvgWaterTemp(DataBuoy[] data){
        float avg = 0;
        for (DataBuoy buoy: data){
            avg += buoy.getWater_t();
        }
        return avg/data.length;   //cal average temp
    }
    
    public static void printMap(DataBuoy[] data, float temp){
        System.out.println("Heat Map of water temperature");
        for (int i=10; i>=-10; i--){
            loop1:
            for (int j=-10; j<=10; j++){
                if (j==0&&i==0){
                    System.out.print("N");
                    continue;
                }                    
                for (DataBuoy buoy : data){
                    if (buoy.getLatitude()==i&&buoy.getLongitude()==j){
                        if (buoy.getWater_t()>temp)
                            System.out.print("H");
                        else
                            System.out.print("C");
                        continue loop1;
                    }
                }
                System.out.print("~");
            }
            System.out.println("");
        }
    }
}
