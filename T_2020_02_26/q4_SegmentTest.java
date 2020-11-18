package src.T_2020_02_26;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q4_SegmentTest {
    
    public static void main(String[] args) {
        Segment t = new Segment(new Point(0,3), new Point(0,6));
        Segment s = new Segment(t);
        Point p1 = new Point(0,4);
        Point p2 = new Point(0,7);
        Point p3 = new Point(0,1);
        System.out.println(s.isOn(p1));
        System.out.println(s.isOn(p2));
        System.out.println(s.isOn(p3));
    }
}