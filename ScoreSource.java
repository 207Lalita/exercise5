package exercise5_1;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class ScoreSource {
    ArrayList<MyScoreEvent> objs;
    public ScoreSource()
    {
        objs = new ArrayList<>();
    }
    
    public void addSubscriber(MyScoreEvent obj)
    {
        objs.add(obj);
    }
    
    public void removeSubscriber(MyScoreEvent obj)
    {
        objs.remove(obj);
    }

    public void notifySub() {
        for (MyScoreEvent observe : objs) {
            observe.update(this);
        }
    }
}
