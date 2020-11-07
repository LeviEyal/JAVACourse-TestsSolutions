package src.T_2020_02_03;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q1 {

    public static void main(String[] args) {
        //prints all powerful numbers up to 200
        for(int i=0; i<=200; i++)
            if(powerful(i))
                System.out.println(i);
    }


    public static boolean powerful(int n){
        if(n==1) return true;
        if(isPrime(n)) return false;

        for(int i=2; i<=n/2; i++)
            if(n%i==0 && isPrime(i))
                if(n%(i*i) != 0)
                    return false;
        return true;
    }

    public static boolean isPrime(int n){
        for(int i=2; i<n; i++)
            if(n%i == 0) return false;
        return true;
    }
}