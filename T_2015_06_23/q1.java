package src.T_2015_06_23;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q1 {

    public static void main(String[] args) {
        System.out.println(seriesSum(1));
        System.out.println(seriesSum(2));
        System.out.println(seriesSum(3));
    }

    public static double seriesSum(int n){
        double sum=0;
        for(int i=1; i<=n; i++)
            sum += i/Math.pow(2,i);
        return sum;
    }
}