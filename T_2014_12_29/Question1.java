package src.T_2014_12_29;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class Question1 {
    public static void main(String[] args) {
        System.out.println(calcE(8)); 
        System.out.println(Math.E);
    }
    public static double calcE(int n){
        double sum = 1;
        for (int i=1 ; i<=n ; i++)
            sum += 1.0/(fact(i));
        return sum;
    }

    private static int fact(int n) {
        int sum=1;
        for(int i=1; i<=n; i++)
            sum *=i;
        return sum;
    }
}