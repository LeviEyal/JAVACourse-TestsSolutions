package src.T_2018_Sample;

import java.util.Arrays;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q6 {

    public static void main(String[] args) {
        int a[] = {1,3,4,5,1};
        int b[] = {4,5,1,3,1};
        System.out.println(equal(a,b));
        System.out.println(equal2(a,b));
    }

    private static boolean equal(int[] a1, int[] a2) {
        if(a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if(count(a1,a1[i]) != count(a2,a1[i]))
                return false;
        }
        return true;
    }
    private static int count(int[] a, int n) {
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == n)
                cnt++;
        }
        return cnt;
    }

    //option 2
    private static boolean equal2(int[] a1, int[] a2) {
        if(a1.length != a2.length) return false;
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }
}