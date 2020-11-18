package src.T_2007_Sample;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q3 {

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

        PointContainer pc2 = new PointContainer();
        pc2.add(new Point(2, 3));
        pc2.add(new Point(99,7));
        pc2.add(new Point(4,2));
        pc2.add(new Point(-3,4));
        pc2.add(new Point(0,0.4));
        pc2.add(new Point(4,4.5));
        pc2.add(new Point(-10,3));
        pc2.add(new Point(7,2));
        pc2.add(new Point(8,-9));
        pc2.add(new Point(8,-90));
        pc2.add(new Point(87,90));

        //print all point containers:
        PointContainer pc3 = pc.intersection(pc2);
        for (int i = 0; i < pc.size(); i++)
            System.out.println(pc.at(i));

        System.out.println();
        for (int i = 0; i < pc2.size(); i++)
            System.out.println(pc2.at(i));

        System.out.println();
        for (int i = 0; i < pc3.size(); i++)
            System.out.println(pc3.at(i));

    }
}