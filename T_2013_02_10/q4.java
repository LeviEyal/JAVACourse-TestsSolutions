package src.T_2013_02_10;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q4 {

    public static void main(String[] args) {
        Triangle t1 = new Triangle(2,3);
        Triangle t2 = new Triangle(2,3);
        Triangle t3 = new Triangle(1,1);
        System.out.println(t1.getArea());
        System.out.println(t3.getArea());
        System.out.println(t1.isEqual(t2));
        System.out.println(t1.isEqual(t3));
    }
}