package src.T_2015_07_21;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class Question2 {

    public static void main(String[] args) {
        int a[][] = {{1,3,7},{0,5,4},{8,2,6}};
        int b[][] = {{-5,0,5},{-2,9,12},{9,10,20},{41,55,101}};
        System.out.println(absoluteSorted(a));
        System.out.println(absoluteSorted(b));
    }
    public static boolean absoluteSorted(int[][] mat){
        for (int i = 0; i < mat.length-1; i++)
            for (int j = 0; j < mat[i].length-1; j++)
                    if( mat[i][j] > mat[i][j+1] ||
                        mat[i][j] > mat[i+1][j] ||
                        mat[i+1][j] > mat[i+1][j+1] ||
                        mat[i][j+1] > mat[i+1][j+1] )
                        return false;
        return true;
    }
}