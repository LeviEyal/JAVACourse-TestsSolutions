package src.T_2018_08_01;

import java.util.Arrays;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q3 {
    public static void main(String[] args) {
        int[][] a = {{1, 4, 7},
                     {2, 5, 8},
                     {3, 6, 9}};
        shiftRight(a);
        System.out.println(Arrays.deepToString(a));
    }
    public static void shiftRight(int[][] a){
        for (int i = 0; i < a.length; i++)
            for (int j=a[0].length-1 ; j>0 ; j--)
                swap(a[i] ,j ,j-1);
    }

    private static void swap(int[] a, int j, int i) {
        int t = a[j];
        a[j] = a[i];
        a[i] = t;
    }
}
