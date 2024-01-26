/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2019II;

/**
 *
 * @author rz_rexton
 */
public class Pizza {
    
    private String size;
    private int numOfCheeseTopping;
    private int numOfBeefTopping;
    private int numOfChickenTopping;
    
    public Pizza(String size,int numOfCheeseTopping,int numOfBeefTopping, int numOfChickenTopping){
        this.size = size;
        this.numOfCheeseTopping = numOfCheeseTopping;
        this.numOfBeefTopping = numOfBeefTopping;
        this.numOfChickenTopping = numOfChickenTopping;
    }
    
    
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNumOfCheeseTopping() {
        return numOfCheeseTopping;
    }

    public void setNumOfCheeseTopping(int numOfCheeseTopping) {
        this.numOfCheeseTopping = numOfCheeseTopping;
    }


    public int getNumOfBeefTopping() {
        return numOfBeefTopping;
    }

    public void setNumOfBeefTopping(int numOfBeefTopping) {
        this.numOfBeefTopping = numOfBeefTopping;
    }

    public int getNumOfChickenTopping() {
        return numOfChickenTopping;
    }

    public void setNumOfChickenTopping(int numOfChickenTopping) {
        this.numOfChickenTopping = numOfChickenTopping;
    }
    
    public double computeCost(){
        if(size=="Small"){
            return 10+ (numOfCheeseTopping+numOfBeefTopping+numOfChickenTopping)*2;
        }
        else if(size=="Medium"){
            return 12+ (numOfCheeseTopping+numOfBeefTopping+numOfChickenTopping)*2;
        }
        else if(size=="Large"){
            return 14+ (numOfCheeseTopping+numOfBeefTopping+numOfChickenTopping)*2;
        }
        else{
            return 0;
        }
    }
    
    public void display(){
        System.out.println("Pizza size: " + size);
        System.out.println("Number of Cheese Topping: " + numOfCheeseTopping);
        System.out.println("Number of Beef Topping: " + numOfBeefTopping);
        System.out.println("Number of Chicken Topping: " + numOfChickenTopping);
        System.out.println("Cost: $ " + computeCost());
    }
}
