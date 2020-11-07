package src.T_2018_Sample;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q4 {

    public static void main(String[] args) {
        PointContainer pc = new PointContainer();
        pc.add(new Point(3,3));
        pc.add(new Point(1,1));
        pc.add(new Point(11,11));
        pc.add(new Point(9,9));
        pc.add(new Point(5,5));
        pc.add(new Point(3,3));
        pc.add(new Point(0,0));

        for (int i = 0; i < pc.size(); i++) {
            System.out.println(pc.at(i));
        }
        pc.sort();
        System.out.println();
        for (int i = 0; i < pc.size(); i++) {
            System.out.println(pc.at(i));
        }
    }
}