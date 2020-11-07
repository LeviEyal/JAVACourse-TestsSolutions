package src.T_2013_03_18;

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
        pc.add(new Point(-10,3));
        pc.add(new Point(7,2));
        pc.add(new Point(8,9));
        pc.add(new Point(80,-90));
        pc.add(new Point(80,90));
        // System.out.println(pc.contains(new Point(7,4)));

        Point p[] = new Point[3];
        p[0] = new Point(0,0.4);
        p[1] = new Point(7,3);
        p[2] = new Point(8,9);

        for (int i = 0; i < pc.size(); i++) {
            System.out.println(pc.at(i));
        }
        System.out.println();

        pc.delete(p);

        for (int i = 0; i < pc.size(); i++) {
            System.out.println(pc.at(i));
        }
        System.out.println();

    }
}