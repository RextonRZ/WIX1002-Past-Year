/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2019II;

/**
 *
 * @author rz_rexton
 */
public class QuadraticEquation {

    private double a,b,c;
    
    public QuadraticEquation(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getA() {
        return a;
    }


    public double getB() {
        return b;
    }


    public double getC() {
        return c;
    }
    
    public double Discriminant(){
        return (b*b)-4*(a)*(c);
    }
    
    public double calcRoot1(){
        if(Discriminant()<0){
            return 0;
        }
        double r1 = ((-1)*(b)+Math.sqrt(Discriminant()))/((2)*(a));
        return r1;
    }
    
    public double calcRoot2(){
        if(Discriminant()<0){
            return 0;
        }
        double r2 = ((-1)*(b)-Math.sqrt(Discriminant()))/((2)*(a));
        return r2;
    }
        
}
