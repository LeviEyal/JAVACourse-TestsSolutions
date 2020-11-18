package src.T_2018_02_25;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q1 {

    public static void main(String[] args) {
        System.out.println(MarsennePrime(127));
        System.out.println(MarsennePrime(99));
        System.out.println(MarsennePrime(7));
    }

    private static boolean MarsennePrime(int n) {
        if(isMarssene(n))
            return isPrime(n);
        return false;
    }
    private static boolean isMarssene(int n) {
        double x = Math.log(n+1)/Math.log(2);
        return x==Math.ceil(x);
    }
    private static boolean isPrime(int n) {
        if(n==1) return false;
        for(int i=2; i<=Math.sqrt(n); i++)
            if(n%i==0)
                return false;
        return true;
    }

}