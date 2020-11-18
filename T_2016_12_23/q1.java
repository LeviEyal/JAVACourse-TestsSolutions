package src.T_2016_12_23;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q1 {

    public static void main(String[] args) {
        System.out.println(tri(10));
        System.out.println(tri(21));
        System.out.println(tri(22));
    }

    private static boolean tri(int n) {
        int sum = 0;
        for (int i = 0; sum<n; i++) {
            sum+=i;
        }
        return sum==n;
    }
}