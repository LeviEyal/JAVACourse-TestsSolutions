package src.T_2013_03_18;

import java.util.Arrays;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q2 {

    public static void main(String[] args) {
        Point p1[] = {new Point(1,1),new Point(5,5),new Point(3,3),new Point(7,7)};
        Point p2[] = {new Point(6,6),new Point(0,0),new Point(4,4),new Point(2,2)};

        System.out.println(Arrays.toString(merge(p1,p2)));
    }

    private static Point[] merge(Point[] arr1, Point[] arr2) {
        Point t[] = new Point[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++)
            t[i] = arr1[i];
        for (int i = arr1.length, j=0 ; i < t.length; i++, j++)
            t[i] = arr2[j];

        Point z = new Point(0,0);
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length-i-1; j++) {
                if(t[j].distance(z) > t[j+1].distance(z)){
                    Point temp = t[j];
                    t[j] = t[j+1];
                    t[j+1] = temp;
                }
            }
        }
        return t;
    }
}