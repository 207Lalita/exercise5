/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise5_1;

import java.util.EventListener;

/**
 *
 * @author ACER
 */
public interface MyScoreEvent extends EventListener {
    public void update(ScoreSource objs);
}
