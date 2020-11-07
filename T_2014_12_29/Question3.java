package src.T_2014_12_29;

import java.util.Arrays;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class Question3 {

    public static void main(String[] args) {
        int[] arr = {1,2,4,2,6,7,3,2,1};
        System.out.println(Arrays.toString(delDuplicate(arr)));
    }
    public static int[] delDuplicate(int[] arr){
        for (int i = 0; i < arr.length-1; i++)
            for (int j = i+1; j < arr.length; j++)
                if(arr[i]==arr[j]){
                    remove(arr,j);
                    arr = Arrays.copyOf(arr,arr.length-1);
                }
        return arr;
    }

    private static void remove(int[] arr, int j) {
        for (int i = j; i < arr.length-1; i++)
            arr[i] = arr[i+1];
    }


}