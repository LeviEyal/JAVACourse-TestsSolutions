package src.T_2015_06_23;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q2 {

    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,8},{7,2,6}};
        int b[][] = {{1,3,7},{0,5,4},{8,2,6}};
        System.out.println(sortedDiagonals(a)); //true
        System.out.println(sortedDiagonals(b)); //false
    }
    public static boolean sortedDiagonals(int[][] a){
        for (int i=0, s=a.length-1 ; i<s; i++, s--)
            if(a[i][i] > a[i+1][i+1] || a[i][s] > a[i+1][s-1])
                return false;
        return true;
    }
}