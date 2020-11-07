package src.T_2019_02_03;

import java.util.Arrays;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class CompressedArray {

    Compressed[] compArray;

    public CompressedArray(int[] arr) {
        int j=0, k=0, count=0;
        compArray = new Compressed[arr.length];
        for (int i = 0; i < arr.length; i=j) {
            count=0;
            for (j = i; j < arr.length && arr[i]==arr[j]; j++){
                count++;
            }
            compArray[k++] = new Compressed(arr[i], count);
        }
        
        compArray = Arrays.copyOf(compArray, k);
    }
}
        // public String toString() {
        //     String ret = "[";
        //     int i;
        //     for (i = 0; i < compArray.length - 1; ++i)
        //         ret += compArray[i].toString() + ",";
        //     ret += compArray[i].toString() + "]";
        //     return ret;
        // }