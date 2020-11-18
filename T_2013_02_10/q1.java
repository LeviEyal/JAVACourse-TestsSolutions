package src.T_2013_02_10;

import java.util.Arrays;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q1 {

    public static void main(String[] args) {
        PointContainer pc = new PointContainer();
        System.out.println(pc.size());
        System.out.println(Arrays.toString(pc._points));
        pc.add(new Point(3,4));
        pc.add(new Point(0.4,0.3));
        pc.add(new Point(0.4,0.3));
        pc.add(new Point(2,4));
        pc.add(new Point(0.6,0.2));
        pc.add(new Point(1,1));
        pc.add(new Point(0.5,0.5));
        pc.add(new Point(0.6,0.2));
        pc.add(new Point(1,1));
        pc.add(new Point(0.5,0.5));
        System.out.println(pc.size());
        System.out.println(Arrays.toString(pc._points));
        pc.disk();
        System.out.println(pc.size());
        System.out.println(Arrays.toString(pc._points));
        
    }
}