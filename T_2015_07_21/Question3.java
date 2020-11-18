package src.T_2015_07_21;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class Question3 {

    public static void main(String[] args) {
        //option 1:
        System.out.println(firstPrimesInFibonacci2(7));
        //option 2:
        System.out.println(firstPrimesInFibonacci(7));
    }
    //option 1
    public static int firstPrimesInFibonacci(int n){
        if(n<2) return -1;
        int a=0, b=1, t=0, count=0;
        for (int i=2; i<=n ; i++) {
            t = a+b;
            a=b;
            b=t;
            if(isPrime(t)) count++;
        }
        return count;
    }
    //option 2
    public static int firstPrimesInFibonacci2(int n){
        if(n<2) return -1;
        int f[] = new int[n+2]; 
        f[0] = 0; 
        f[1] = 1; 
        int count=0; 
        for (int i = 2; i <= n; i++) { 
            f[i] = f[i-1] + f[i-2]; 
            if(isPrime(f[i])) count++;
        } 
        return count; 
    }

    private static boolean isPrime(int t) {
        if(t==1) return false;
        for (int i = 2; i < Math.sqrt(t); i++)
            if(t%i == 0) return false;
        return true;
    }
}