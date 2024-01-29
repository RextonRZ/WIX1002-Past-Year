/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2021I;

/**
 *
 * @author rz_rexton
 */
public class DivideF1 extends Eleven{
    
    public DivideF1(String filename){
        super(filename);
    }
    
    @Override
    public String divide(){
        String div1 = "Divisibility Rule (Formula 1)\n";
        
        for(int num : array){
            boolean divisible11 = false;
            int oddtotal =0, eventotal = 0;
            int[] oddposinum = new int[6];
            int[] evenposinum = new int[6];  //set the size
            int i=0,j=0;
        
            div1 += num + ": |x| = |";
            int t=num; //Store num temporary to determine& cal the odd and even position number
            int order = 0;//determine whether it is a odd position number of positive position number
            
            while(t>0){
                int digit = t%10;
                t/=10;
                
                if(order++%2==0){
                    oddtotal+=digit;
                    oddposinum[i]=digit;
                    i++;
                }else{
                    eventotal+=digit;
                    evenposinum[j]=digit;
                    j++;
                }
            }
            
            int subtract = oddtotal-eventotal;
            if(subtract%11==0) divisible11=true;
            for(i=i-1;i>0;i--) div1+=oddposinum[i]+" + "; //print before the last oddnum
            div1+= oddposinum[0]+" ) - {";
            for(j=j-1;j>0;j--) div1+=evenposinum[i]+" + "; //print before the last evennum
            div1+= evenposinum[0]+" ) | = "+subtract;
            
            //print whether it is divisible by 11
            if(divisible11){
                div1+="\n"+subtract+" modulus 11 = 0, "+num+" is divisible by 11\n\n";
            }else{
                div1+="\n"+subtract+" modulus 11 is not equal to 0, "+num+" is not divisible by 11\n\n";
            }            
        }
        return div1;
    } 
}
    
