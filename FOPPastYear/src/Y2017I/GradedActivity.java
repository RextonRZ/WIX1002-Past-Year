/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2017I;

/**
 *
 * @author rz_rexton
 */
public class GradedActivity {

    private int score;
    

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    public char getGrade(){
        if(score >= 90) return 'A';
        else if(score >= 80) return 'B';
        else if(score >= 70) return 'C';
        else if(score >= 60) return 'D';
        else return 'F';
    }
    
    public String toString(){
        return "Score: "+score+" \nGrade: "+getGrade();
    }
}
