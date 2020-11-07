package src.T_2013_03_18;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q3 {

    public static void main(String[] args) {
        String s1 = "-3+2+6+10";
        System.out.println(sum(s1)); //5
        String s2 = "-3+2+6*4/3+10/2";
        System.out.println(Arithmetic(s2)); //5
    }
    public static int sum(String s){
        String a[] = s.split("(?=[+-])"); //using Regular Expression
        int sum=0;
        for (int i = 0; i < a.length; i++)
            sum += Integer.valueOf(a[i]);
        return sum;
    }

    public static double Arithmetic(String s){
        String a[] = s.split("(?=[+-])");
        double sum=0;
        for (int i = 0; i < a.length; i++)
            sum += valueAfterDivide(a[i]);
        return sum;
    }
    private static double valueAfterDivide(String s) {
        if(s.contains("/")){
            String a[] = s.split("/");
            double n = valueAfterManipulate(a[0]);
            for (int i = 1; i < a.length; i++)
                n/= valueAfterManipulate(a[i]);
            return n;
        }
        return Double.valueOf(s);
    }
    private static double valueAfterManipulate(String s) {
        double n = 1;
        if(s.contains("*")){
            String a[] = s.split("\\*");
            for (int i = 0; i < a.length; i++)
                n*= valueAfterManipulate(a[i]);
            return n;
        }
        return Double.valueOf(s);
    }
}   