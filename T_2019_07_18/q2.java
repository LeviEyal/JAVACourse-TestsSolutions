package src.T_2019_07_18;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q2 {

    public static void main(String[] args) {
        System.out.println(isDivisible(new int[]{-1,2,3,6,1,8,4,-2}));  //true
        System.out.println(isDivisible(new int[]{1,2,3,4,5}));          //false
        System.out.println(isDivisible(new int[]{1,1,1,1}));          //true
        System.out.println(isDivisible(new int[]{1,2,2,6,2,3}));          //true
    }

    public static boolean isDivisible(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length-1; j > 0; j--) {
                if(leftMul(a,i)*rightMul(a,j) == betweenMul(a,i,j))
                    return true;
            }
        }
        return false;
    }

    private static int leftMul(int[] a, int j) {
        int ans = 1;
        for (int i=0; i<=j ; i++)
            ans *= a[i];
        return ans;
    }
    private static int rightMul(int[] a, int i) {
        int ans = 1;
        for (int j=a.length-1; j>=i ; j--)
            ans *= a[j];
        return ans;
    }
    private static int betweenMul(int[] a, int i, int j) {
        int b = 1;
        for (int k = i+1; k<j ; k++)
            b*=a[k];
        return b;
    }
}