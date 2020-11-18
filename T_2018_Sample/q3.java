package src.T_2018_Sample;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q3 {

    public static void main(String[] args) {
        Parabula pb = new Parabula(2,-3,6);
        System.out.println(pb.f(2));
        System.out.println(pb.above(new Point(2,17)));
    }
}