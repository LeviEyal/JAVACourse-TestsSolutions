package src.T_2015_12_18;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q1 {

    public static void main(String[] args) {
        System.out.println(subprime(919));  //true
        System.out.println(subprime(321));  //true
        System.out.println(subprime(11));   //true
        System.out.println(subprime(914));  //false
    }
    public static boolean subprime(int n){
        String num = String.valueOf(n);
        for (int i=2; i<=n; i++)
            if(isPrime(i) && num.contains(String.valueOf(i)))
                    return true;
        return false;
    }
    private static boolean isPrime(int i) {
        for (int j=2; j<=Math.sqrt(i); j++)
            if(i%j == 0) return false;
        return true;
    }

}