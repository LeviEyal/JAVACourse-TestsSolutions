package src.T_2020_02_26;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q3_diagonal {

    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3, 4},
            {5, 1, 2, 3},
            {9, 5, 1, 2}
        };
        int b[][] = {
            {1,2},
            {2,2}
        };
        System.out.println(diagonal(a));    //true
        System.out.println(diagonal(b));    //false
    }

    private static boolean diagonal(int[][] a) {
        int raw = a.length;
        int col = a[0].length;
        for(int i=0; i<raw; i++)
            for(int j=0; j<col; j++)
                if(i+1<raw && j+1<col)
                    if(a[i][j] != a[i+1][j+1])
                        return false;
        return true;
    }

    //another option:
    private static boolean diagonal2(int[][] a) {
        for(int i=0; i<a[0].length; i++)
            for(int j=0; i+j<Math.min(a[0].length, a.length); j++)
                if(a[0][i] != a[j][j+i])
                    return false;

        for(int i=0; i<a.length; i++)
            for(int j=0; i+j<Math.min(a[0].length, a.length); j++)
                if(a[i][0] != a[j+i][j])
                    return false;

        return true;
    }

    
}