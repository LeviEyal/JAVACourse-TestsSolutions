package src.T_2015_06_23;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q3 {

    public static void main(String[] args) {
        System.out.println(relativelyPrimes(new int[]{2,5,8,15})); //4
        System.out.println(relativelyPrimes(new int[]{14,12,32})); //0
    }
    public static int relativelyPrimes(int []a){
        int count=0;
        for(int i=0; i<a.length-1; i++)
            for(int j=i+1; j<a.length; j++)
                if(gcd(a[i],a[j]) == 1)
                    count++;
        return count;
    }

    private static int gcd(int n1, int n2) {
        for(int i=2 ; i<=Math.min(n1, n2) ; i++)
            if(n1%i == 0 && n2%i == 0)
                return i;
        return 1;
    }
}