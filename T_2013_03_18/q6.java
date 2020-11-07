package src.T_2013_03_18;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q6 {

    public static void main(String[] args) {
        Dudeney();
    }
    public static void Dudeney() {
        for (int i = 100; i < 10000; i++)
            if(Math.pow(sum(i),3) == i)
                System.out.println(i);
    }
    private static int sum(int i) {
        int sum=0;
        for(; i>0; i/=10)
            sum += i%10;
        return sum;
    }
}