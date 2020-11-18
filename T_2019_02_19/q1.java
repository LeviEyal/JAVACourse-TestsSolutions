package src.T_2019_02_19;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q1 {

    public static void main(String[] args) {
        System.out.println(isSphenic(30));  //true
        System.out.println(isSphenic(60));  //true
        System.out.println(isSphenic(15));  //false
        System.out.println(isSphenic(98));  //false
    }
    public static boolean isSphenic(int n){
        for (int i = 2; i < n; i++)
            for (int j = 2; j < n; j++)
                for (int k = 2; k < n; k++)
                    if(isPrime(i)&&isPrime(k)&&isPrime(j)
                        && i!=j && j!=k && i!=k){
                            if(i*j*k==n) 
                                return true;
                        }
        return false;
    }
    public static boolean isPrime(int n){
        if(n == 1) return false;
        for(int i=2; i<=Math.sqrt(n); i++)
            if(n%i==0) return false;
        return true;
    }
}