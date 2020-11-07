package src.T_2020_02_03;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q3 {

    public static void main(String[] args) {
        int a[][] = {
            { 1, 2, 3, 4},
            {12,13,14, 5},
            {11,16,15, 6},
            {10, 9, 8, 7}
        };
        int b[][] = {
            { 1, 2, 3, 4, 5},
            {16,17,18,19, 6},
            {15,24,25,20, 7},
            {14,23,22,21, 8},
            {13,12,11,10, 9}
        };
        spiral(a);
        spiral(b);
    }

    public static void spiral(int[][] a) {
        int len = a.length;
        for(int i=0; i<=len/2; i++)
            printRound(i,a);
    }
    public static void printRound(int k, int[][] a) {
        int len = a.length;
        for(int i=k; i<len-k; i++)
            System.out.print(a[k][i]+" ");
        for(int i=k+1; i<len-k; i++)
            System.out.print(a[i][len-1-k]+" ");
        for(int i=k+1; i<len-k; i++)
            System.out.print(a[len-1-k][len-1-i]+" ");
        for(int i=k+1; i<len-k-1; i++)
            System.out.print(a[len-1-i][k]+" ");
    }
}
