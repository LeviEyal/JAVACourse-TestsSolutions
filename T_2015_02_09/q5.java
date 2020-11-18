package src.T_2015_02_09;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q5 {
    public static void main(String[] args) {
        BalloonContainer bc = new BalloonContainer();
        Balloon b0 = new Balloon(2, 1, 2, 3);
        Balloon b1 = new Balloon(2, 2, 3, 1);
        Balloon b2 = new Balloon(2, 1, 5, 8);
        Balloon b3 = new Balloon(2, 7, 1, 10);
        Balloon b4 = new Balloon(2, 5, 6, 1);
        Balloon b5 = new Balloon(2, 2, 8, 4);
        bc.add(b0);
        bc.add(b1);
        bc.add(b2);
        bc.add(b3);
        bc.add(b4);
        bc.add(b5);
        System.out.println(bc);
        bc.removeSmallest();
        System.out.println(bc);
        Balloon b6 = new Balloon(3, 3, 11, 2);
        Balloon b7 = new Balloon(3, 2, 34, 1);
        Balloon b8 = new Balloon(3, 1, 32, 9);
        bc.add(b6);
        bc.add(b7);
        bc.add(b8);
        System.out.println(bc);
    }
}
