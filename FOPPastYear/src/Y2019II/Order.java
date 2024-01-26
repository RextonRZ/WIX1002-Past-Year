/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2019II;

/**
 *
 * @author rz_rexton
 */
public class Order {

    protected String customerName;
    protected String customerID;
    protected int quantityordered;
    protected double unitprice;
    
    public Order(){
        customerName = "";
        customerID = "";
        quantityordered = 0;
        unitprice = 0;
    }
    
    public Order(String customerName, String customerID, int quantityordered, double unitprice){
        this.customerName = customerName;
        this.customerID = customerID;
        this.quantityordered = quantityordered;
        this.unitprice = unitprice;
    }
    

    public String getCustomerName() {
        return customerName;
    }


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public String getCustomerID() {
        return customerID;
    }


    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }


    public int getQuantityordered() {
        return quantityordered;
    }


    public void setQuantityordered(int quantityordered) {
        this.quantityordered = quantityordered;
    }


    public double getUnitprice() {
        return unitprice;
    }


    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }
    
    public double computeTotalPrice(){
        return quantityordered*unitprice;
    }
    
    public String toString(){
        return "Customer Name : "+customerName+ "\nCustomer Id : "+customerID+"\nQuantity ordered: "+quantityordered
                +"\nUnit price : "+unitprice+"\nTotal Price : "+computeTotalPrice();
    }
        
}
