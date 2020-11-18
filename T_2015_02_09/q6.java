package src.T_2015_02_09;

import java.util.Arrays;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q6 {

    public static void main(String[] args) {
        double a[] = {1.1, 2.5, 63.9, 1.12,  3.45, -4.4};
        System.out.println(smallestDistance(a));
        System.out.println(smallestDistance2(a));
    }

    public static double smallestDistance(double []a){
        double min = Double.MAX_VALUE;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                double t = Math.abs(a[i]-a[j]);
                if(t < min) min = t;
            }
        }
        return min;
    }

    //another option:
    public static double smallestDistance2(double []a){
        Arrays.sort(a);
        double min = Double.MAX_VALUE;
        for (int i = 0; i < a.length-1; i++) {
            double t = Math.abs(a[i]-a[i+1]);
            if(t < min) min = t;
        }
        return min;
    }
}