/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2022I;

/**
 *
 * @author rz_rexton
 */
public class Diving {
    private String name;
    private String country;
    protected double[][] score;
    protected double[] difficulty;
    
    public Diving(String name, String country,double[][] score, double[] difficulty){
        this.name = name;
        this.country= country;
        this.score=score;
        this.difficulty = difficulty;
    }
    
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
    
    public double computeFinalScore() {
        double finalscore = 0;

        for (int i = 0; i < score.length; i++) {
            double[] currentRoundScores = score[i];  //compare the score so that can sort
            int numScores = currentRoundScores.length;

            // Sort the array in ascending order
            for (int k = 0; k < numScores - 1; k++) {
                for (int j = 0; j < numScores - 1 - k; j++) {
                    if (currentRoundScores[j] > currentRoundScores[j + 1]) {
                        // Swap elements if they are in the wrong order
                        double temp = currentRoundScores[j];
                        currentRoundScores[j] = currentRoundScores[j + 1];
                        currentRoundScores[j + 1] = temp;
                    }
                }
            }

            // Remove two lowest and two highest scores
            double sumWithoutExtremes = 0;
            for (int j = 2; j < numScores - 2; j++) {
                sumWithoutExtremes += currentRoundScores[j];
            }

            // Update the final score by adding the sum multiplied by the difficulty
            finalscore += sumWithoutExtremes * difficulty[i];
        }

        return finalscore;
    }
    
    public String toString(){
        String fullinfo = "Diver : "+name+" ("+country+")";
        for(int i=0;i<score.length;i++){
            fullinfo+="\nJudges scores : ";
            for(int j=0;j<score[i].length;j++){
                fullinfo+=score[i][j]+" ";
            }
            fullinfo+="\nDifficulty Rating : "+difficulty[i];
        }
        fullinfo+="\nFinal score : "+computeFinalScore();
        return fullinfo;
    }
}
