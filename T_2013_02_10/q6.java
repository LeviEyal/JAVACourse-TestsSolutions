package src.T_2013_02_10;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q6 {

    public static void main(String[] args) {
        eqA3();
    }

    private static void eqA3() {
        for (int i = 10; i < 100; i++) {
            if(sumDigits(i*i*i) == i)
                System.out.println(i);
        }
    }

    private static int sumDigits(int n) {
        int sum = 0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
}