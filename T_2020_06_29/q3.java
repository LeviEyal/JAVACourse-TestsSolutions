package src.T_2020_06_29;

import java.util.Arrays;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q3 {
    public static void main(String[] args) {
        int a[] = {2,1,2};
        int b[] = {5,1,2,3,2,1,2,1,2};
        System.out.println(isIn(a,b));
        System.out.println(isIn2(a,b));
    }

    private static int isIn(int[] a, int[] b) {
        int count=0;
        for(int i=0; i<b.length-a.length+1; i++){
            if(b[i] == a[0]){
                for(int j=0; j<a.length; j++){
                    if(a[j] != b[i+j])
                        break;
                    if(j==a.length-1)
                        count++;
                }
            }
        }
        return count;
    }

    //option 2:
    public static int isIn2(int[] arrsmall, int[] arrbig){
        String small = Arrays.toString(arrsmall);
        small = small.replace("]", "");
        small = small.replace("[", "");
        String big = Arrays.toString(arrbig);
        return countSubStrings(small, big);
    }
    private static int countSubStrings(String small, String big) {
        int count=0;
            for(int i=0; i<big.length()-small.length(); i++)
                if(big.substring(i, i+small.length()).equals(small))
                    count++;
            return count;
    }
}