package src.T_2018_07_08;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q1 {

    public static void main(String[] args) {
        System.err.println(countExacly(121212, 2, 3));
        System.err.println(countExacly(121212, 2, 4));
        System.err.println(countExacly(121212, 4, 3));
        System.err.println(countExacly(121212, 4, 0));
        
    }

    public static boolean countExacly(int num, int digit, int count){
        if(num==0) return count==0;
        if(num%10 == digit) count--;
        return countExacly(num/10, digit, count);
    }
}
