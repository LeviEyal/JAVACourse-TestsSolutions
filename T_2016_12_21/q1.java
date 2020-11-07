package src.T_2016_12_21;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q1 {

    public static void main(String[] args) {
        System.out.println(most(121341));
        System.out.println(most(42324));
    }

    private static int most(int n) {
        int a[] = new int[10];
        while(n>0){
            a[n%10]++;
            n/=10;
        }
        int max = 0, maxDigit = 0;
        for(int i=0; i<10; i++){
            if(a[i]>max){
                max = a[i];
                maxDigit = i;
            }
        }
        return maxDigit;
    }
}