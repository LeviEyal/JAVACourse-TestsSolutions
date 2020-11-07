package src.T_2015_07_21;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class Question1 {
    public static void main(String[] args) {
        System.out.println(seriesSum(1));
        System.out.println(seriesSum(2));
        System.out.println(seriesSum(3));
    }
    public static double seriesSum(int n){
        double sum = 0;
        for (int i=1 ; i<=n ; i++)
            sum += 1.0/(i*(i+1));
        return sum;
    }
}