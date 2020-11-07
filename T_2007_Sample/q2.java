package src.T_2007_Sample;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q2 {

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
        for (int i = 0; i < pc.size(); i++) {
            System.out.println(pc.at(i));
        }
        System.out.println();
        PointContainer pc2 = q1(pc);
        for (int i = 0; i < pc2.size(); i++) {
            System.out.println(pc2.at(i));
        }
    }

    private static PointContainer q1(PointContainer pc) {
        PointContainer t = new PointContainer();
        for (int i = 0; i < pc.size(); i++)
            if(pc.at(i).x()>=0 && pc.at(i).y()>=0)
                t.add(pc.at(i));
        return t;
    }
    
}