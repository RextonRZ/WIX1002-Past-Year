/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2018II;

/**
 *
 * @author rz_rexton
 */
public class LinearEquation {
    private int a,b,c,d,e,f;
    
    public LinearEquation(int a, int b, int c, int d, int e, int f){
        this.a =a;
        this.b =b;
        this.c =c;
        this.d =d;
        this.e =e;
        this.f =f;
    }
    
    public String toString(){
        String result = "";
        result += a+"x + "+ b +"y = "+e+"\n"+c+"x + "+d+"y = "+f;
        return result;
    }
    
    public boolean isSolvable(){
        if(a*d-b*c!= 0)
            return true;
        else
            return false;
    }
    
    public double computeX(){
        return (e*d-b*f)/(a*d-b*c);
    }
    
    public double computeY(){
        return(a*f-e*c)/(a*d-b*c);
    }
}
