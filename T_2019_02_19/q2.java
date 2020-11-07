package src.T_2019_02_19;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q2 {

    public static void main(String[] args) {
        int arr[][] = {
            {2,4,-5,6,2},
            {3,5,0,-2,1},
            {7,3,-2,8,2},
            {0,1,9,5,6},
            {7,1,3,0,-1}
        };
        System.out.println(calcSumDiag(arr));
    }

    private static int calcSumDiag(int[][] arr) {
        return calcSumDiag(arr, 0);
    }
    private static int calcSumDiag(int[][] arr, int i) {
        if(i==arr.length-1) return arr[i][i];
        return arr[i][i] + calcSumDiag(arr, i+1);
    }
}