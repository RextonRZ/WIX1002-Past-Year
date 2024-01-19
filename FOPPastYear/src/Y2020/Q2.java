/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2020;

/**
 *
 * @rz_rexton
 */
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter location 1");
            double[] location1 = enterLocation(1);
            System.out.println("Enter location 2");
            double[] location2 = enterLocation(2);

            double distance = calHaversine(location1[0], location2[0], location1[1], location2[1]);

            System.out.printf("Location 1 : %.6f Latitude , %.6f Longitude" , location1[0] , location1[1]);;
            System.out.printf("\nLocation 2 : %.6f Latitude , %.6f Longitude" , location2[0] , location2[1]);
            System.out.printf("\nDistance : %.2f KM\n" , distance);
        }
    
    public static double[] enterLocation(int num){
        Scanner sc = new Scanner(System.in);
        int sign=0 ;
        String type = "";
        double[] decimalValue = new double[2];
        for(int i=0;i<2;i++){
            System.out.print("Enter Direction: [N, S, E, W]: ");
            char direction = sc.next().charAt(0);
            if (direction == 'N'){
                sign = 1;
            }else if (direction == 'S'){
                sign = -1;
            }else if (direction == 'E'){
                sign = 1;
            }else if (direction == 'W'){
                sign = -1;
            }
            System.out.print("Enter Degree, Minute and Second : ");
            int degree = sc.nextInt();
            int min = sc.nextInt();
            int sec = sc.nextInt();
            decimalValue[i] = convertInput(sign, degree, min, sec);
        }
        return decimalValue;
    }
    
    public static double convertInput(int sign, int degree, int min, int sec) {
        return (sign) * (degree + (min * 60.0 + sec) / 3600.0);
    }
    
    public static double calHaversine(double lat1,double lat2,double long1,double long2){
        double latchange = Math.toRadians(Math.abs(lat1-lat2));
        double longchange = Math.toRadians(Math.abs(long1-long2)); //values in degrees, you need to convert them to radians before using them 
        double R = 6371;
        
        double a = Math.pow(Math.sin(latchange/2), 2) + Math.cos(Math.toRadians(lat1))*Math.cos(Math.toRadians(lat2))*Math.pow(Math.sin(longchange/2), 2);
        double c = 2*Math.atan2(Math.sqrt(a), Math.sqrt((1-a)));
        double d = R * c;
        return d;
    }
}
