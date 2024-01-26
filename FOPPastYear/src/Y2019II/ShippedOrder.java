/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2019II;

/**
 *
 * @author ooiru
 */
public class ShippedOrder extends Order{
    
    public ShippedOrder(String customerName, String customerID, int quantityordered, double unitprice){
        super(customerName,customerID,quantityordered,unitprice);
    }
    
    @Override
    public double computeTotalPrice(){
        return super.computeTotalPrice()+4;
    }
    
    @Override
    public String toString(){
        return "Shipped\n"+"Customer Name : "+customerName+ "\nCustomer Id : "+customerID+"\nQuantity ordered: "+quantityordered
                +"\nUnit price : "+unitprice+"\nTotal Price : "+computeTotalPrice();
    }
}
