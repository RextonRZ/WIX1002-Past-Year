/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2017I;

/**
 *
 * @author rz_rexton
 */
public class Complex {
    private double real,imaginary;
    
    public Complex(){
        this.real = 0;
        this.imaginary = 0;
    }
    
    public Complex(double real,double imaginary){
        this.real=real;
        this.imaginary = imaginary;
    }
    
    public Complex addComplexNum(Complex b){
        double realtotal = real+b.real;
        double imaginarytotal = imaginary+b.imaginary;
        Complex result = new Complex(realtotal, imaginarytotal);
        return result;
    }
    
    public Complex subtractComplexNum(Complex b){
        double realtotal = real-b.real;
        double imaginarytotal = imaginary-b.imaginary;
        Complex result = new Complex(realtotal, imaginarytotal);
        return result;
    }
    
    public String toString(){
        return "("+(int)real+" + "+(int)imaginary+"i)";
    }
}
