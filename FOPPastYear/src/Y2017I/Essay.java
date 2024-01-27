/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2017I;

/**
 *
 * @author rz_rexton
 */
public class Essay extends GradedActivity{
    private int grammar,spelling,length, content;
    
    public Essay(int grammar, int spelling, int length,int content){
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
    }
    
    @Override
    public String toString(){
        return "Grammar: "+grammar+" marks \nSpelling: "+spelling+" marks \nLength: "+length+" marks \nContent: "+content+" marks";
    }
}
