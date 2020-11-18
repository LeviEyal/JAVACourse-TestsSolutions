package src.T_2018_01_30;

import java.util.Arrays;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q3 {

    public static void main(String[] args) {
        int[][] a = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        int[][] b = {{11,12,13,14,15},{6,7,8,9,10},{1,2,3,4,5}};
        int[][] c = {{5,4,3,2,1},{10,9,8,7,6},{15,14,13,12,11}};

        System.out.println(isSymmetric (a,b));
        System.out.println(isSymmetric (a,c));
    }

    private static boolean isSymmetric(int[][] a, int[][] b) {
        return isSymX(a, b)||isSymy(a, b);
    }

    private static boolean isSymX(int[][] a, int[][] b) {
        if(a.length!=b.length || a[0].length!=b[0].length)
            return false;
        int ah = a.length-1, bh = b.length-1;
        for (int i = 0; i <= ah ; i++) {
            if(!Arrays.equals(a[i], b[bh-i]))
                return false;
        }
        return true;
    }
    private static boolean isSymy(int[][] a, int[][] b) {
        int h = a.length, w = a[0].length;
        if(b.length!=h || b[0].length!=w)
            return false;
        for (int i = 0; i < h; i++)
            for (int j = 0; j < w; j++)
                if(a[i][j] != b[i][w-j-1])
                    return false;
        return true;
    }
}