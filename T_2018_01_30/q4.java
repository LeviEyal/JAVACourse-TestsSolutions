package src.T_2018_01_30;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q4 {

    public static void main(String[] args) {
        Line l = new Line(3, 7, 8, 3);
        Line l1 = new Line(l);
        System.out.println(l.length());
        System.out.println(l1.length());
        System.out.println(l.on(2, 2));
    }
}