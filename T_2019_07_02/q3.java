package src.T_2019_07_02;

import java.util.Arrays;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q3 {

    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        switchDiags(a);
        System.out.println(Arrays.deepToString(a));
    }
    public static void switchDiags(int[][] a){
        int l = a.length-1;
        for(int i=0; i<=l; i++){
            int t = a[i][i]; ;
            a[i][i] = a[i][l-i];
            a[i][l-i] = t;
        }
    }
}