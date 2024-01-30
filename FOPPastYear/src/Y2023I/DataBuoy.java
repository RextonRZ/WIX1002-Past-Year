/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2023I;

/**
 *
 * @author ooiru
 */
public class DataBuoy {
    private String id;
    private int latitude, longitude;
    private float air_temp, water_temp;

    public DataBuoy(String id, int latitude, int longitude, float air_temp, float water_temp) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.air_temp = air_temp;
        this.water_temp = water_temp;
    }

    public String getId() {
        return id;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public float getAir_t() {
        return air_temp;
    }

    public float getWater_t() {
        return water_temp;
    }
    
    
}
