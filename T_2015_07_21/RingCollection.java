package src.T_2015_07_21;

import java.util.ArrayList;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class RingCollection {

    private ArrayList<Ring> rings;

    public RingCollection() {
    }

    public int contains(Ring t){
        for (int i=0 ; i<rings.size() ; i++)
            if(rings.get(i).equals(t)) 
                return i;
        return -1;
    }

    public void addDifferent(Ring t){
        if(contains(t) != -1)
            rings.add(t);
    }

    public void remove(int index){
        rings.remove(index);
    }

 
    
}