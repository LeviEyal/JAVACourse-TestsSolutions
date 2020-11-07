package src.T_2018_01_30;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q1 {
    public static void main(String[] args) {
        System.out.println(square(246));
    }

    private static boolean square(int a) {
        int sum=0;
        for (int i = 1; i <= a; i++)
            if(a%i == 0)
                sum+=i*i;
        double sr = Math.sqrt(sum);
        return (int)(sr)==sr;
    }
}