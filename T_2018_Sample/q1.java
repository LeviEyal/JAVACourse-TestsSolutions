package src.T_2018_Sample;

import java.util.Arrays;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q1 {
    public static void main(String[] args) {
        PointContainer pc = new PointContainer();
        pc.add(new Point(2,3));
        pc.add(new Point(1,7));
        pc.add(new Point(4,2));
        pc.add(new Point(-3,4));
        pc.add(new Point(0,0.4));
        pc.add(new Point(9,4.5));
        pc.add(new Point(10,3));
        pc.add(new Point(7,2));
        pc.add(new Point(8,9));
        pc.add(new Point(80,90));
        pc.add(new Point(80,90));
        Rectangle ra[] = new Rectangle[4];
        ra[0] = new Rectangle(new Point(2,4), new Point(3,5));
        ra[1] = new Rectangle(new Point(-1,2), new Point(4,5));
        ra[2] = new Rectangle(new Point(6,5), new Point(5,0.4));
        ra[3] = new Rectangle(new Point(1.5,4), new Point(6.7,5));
        Point pc2[] = pc.maxIn(ra);
        System.out.println(Arrays.toString(pc2));
    }

}