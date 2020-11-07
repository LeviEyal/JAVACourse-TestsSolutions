package src.T_2016_12_21;

import java.util.Arrays;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(either(new int[]{5,-3,0,6,-9,6,4,0,8,6}, new int[]{7,8,0,3,3,4,4})));
    }

    private static int[] either(int[] arr1, int[] arr2) {
        int arr3[] = new int[arr1.length+arr2.length];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(notIn(arr2,arr1[i]) && notIn(arr3,arr1[i]))
                arr3[count++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            if(notIn(arr1,arr2[i]) && notIn(arr3,arr2[i]))
                arr3[count++] = arr2[i];
        }
        return Arrays.copyOf(arr3, count);
    }

    private static boolean notIn(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if(a[i]==n)
                return false;
        }
        return true;
    }
}