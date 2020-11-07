package src.T_2020_02_26;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q1_semiPrime {

    public static void main(String[] args) {
        System.out.println(semiPrime(4));   //true
        System.out.println(semiPrime(5));   //false
        System.out.println(semiPrime(6));   //true
        System.out.println(semiPrime(12));  //false
        System.out.println(semiPrime(15));  //true
        System.out.println(semiPrime(30));  //false
    }

    private static boolean semiPrime(int n) {
        for(int i=2; i<n; i++)
            for(int j=i; j<n; j++)
                if(isPrime(i) && isPrime(j) && i*j == n)
                    return true;
        return false;
    }
    private static boolean isPrime(int n) {
        for(int i=2; i<=Math.sqrt(n); i++)
            if(n%i == 0)
                return false;
        return true;
    }

}
/*

list of all semiPrimes number up to 100 based on wikipedia:
4, 6, 9, 10, 14, 15, 21, 22, 25, 26, 33,34,
35, 38, 39, 46, 49, 51, 55, 57, 58, 62, 65,
69, 74, 77, 82, 85, 86, 87, 91, 93, 94, 95

 */