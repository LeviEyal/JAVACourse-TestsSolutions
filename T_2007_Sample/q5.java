package src.T_2007_Sample;

import java.util.Arrays;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
********************************************************/

public class q5 {

    public static void main(String[] args) {
        PointContainer pc = new PointContainer();
        pc.add(new Point(2,3));
        pc.add(new Point(1,7));
        pc.add(new Point(4,2));
        pc.add(new Point(-3,4));
        pc.add(new Point(7,2));
        pc.add(new Point(9,4.5));
        pc.add(new Point(-10,3));
        pc.add(new Point(7,2));
        pc.add(new Point(8,9));
        pc.add(new Point(80,-90));
        pc.add(new Point(7,2));

        for (int i = 0; i < pc.size(); i++)
            System.out.println(pc.at(i));
        System.out.println();
        
        //print the new array:
        int a[] = pc.contains(new Point(7,2));
        System.out.println(Arrays.toString(a));
    }
}