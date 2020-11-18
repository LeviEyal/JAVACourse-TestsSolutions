package src.T_2019_07_02;

import java.util.Arrays;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q5 {

    public static int[] mystery(int a[], int n) {
        if (n == 1)
            return a;
        if (a[n - 1] > 0 && a[n - 2] < 0) {
            int temp = a[n - 1];
            a[n - 1] = a[n - 2];
            a[n - 2] = temp;
            return mystery(a, n - 1);
        }
        return mystery(a, n - 1);
    }
    public static void main(String[] args) {
        int[] a = {3,4,5,-6,1,-2,-3,-4,6,-2};
        int[] b = mystery(a,9);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
