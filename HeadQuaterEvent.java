/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise5_1;


/**
 *
 * @author ACER
 */
public class HeadQuaterEvent extends ScoreSource {
    String scoreLine;
    public void setScoreLine(String scoreStr) {
        scoreLine = scoreStr;
        notifySub();
    }
    public String getScoreLine() {
        return scoreLine;
    }
    
}
