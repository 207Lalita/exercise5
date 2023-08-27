/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise5_1;

//mport jdk.javadoc.doclet.Reporter;

/**
 *
 * @author ACER
 */
public class SecondSubscriber implements MyScoreEvent{
    
    @Override
    public void update(ScoreSource objs) {
        System.out.println("live result: " + 
                ((HeadQuaterEvent)objs).getScoreLine());
    }
}
