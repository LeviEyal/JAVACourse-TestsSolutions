package src.T_2016_12_21;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q3 {

    public static void main(String[] args) {
        System.out.println(sum("3+5+2+0"));
        System.out.println(sum("3"));
    }

    private static int sum(String s) {
        String a[] = s.split("\\+");
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            int t = Integer.valueOf(a[i]);
            sum += t;
        }
        return sum;
    }
}