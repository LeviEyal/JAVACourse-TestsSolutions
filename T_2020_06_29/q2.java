 package src.T_2020_06_29;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q2 {
    public static void main(String[] args) {
        int mat1[][] = {{1,2,3,4},
                        {5,1,2,3},
                        {6,5,1,2},
                        {7,6,5,1}};
        int mat2[][] = { {6,7},
                         {7,6}};
        System.out.println(sameNumbers(mat1));  //true
        System.out.println(sameNumbers(mat2));  //true
    }

    public static boolean sameNumbers(int[][] mat) {
        int m = mat.length;
        for(int i=0; i<m; i++)
            for(int j=0; j<m; j++)
                if(mat[j][i] != mat[m-i-1][m-j-1])
                    return false;
        return true;
    }
}