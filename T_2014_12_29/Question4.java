package src.T_2014_12_29;

import java.util.Arrays;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class Question4 {

    public static void main(String[] args) {
        int a[][] = {{1,5,4,3},{8,6,7,2},{3,9,1,0}};
        sortRows(a);
        System.out.println(Arrays.deepToString(a));
    }

    public static void sortRows(int[][] mat){
        for (int i = 0; i < mat.length; i++)
            Arrays.sort(mat[i]);
    }
}