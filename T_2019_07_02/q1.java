package src.T_2019_07_02;

import java.util.Arrays;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q1 {
    public static void main(String[] args) {
        System.out.println(sortDigits(312009));
        System.out.println(sortDigits2(312009));
        System.out.println(sortDigits3(312009));

        System.out.println(sortDigits(3412072));
        System.out.println(sortDigits2(3412072));
        System.out.println(sortDigits3(3412072));
    }
    //option 1
    public static long sortDigits(long num){
        long t = 0;
        int a[] = new int[10];
        while(num>0){
            a[(int)(num%10)]++;
            num/=10;
        }
        for(int i=1; i<10; i++){
            for(int j=1; j<=a[i]; j++){
                t*=10;
                t+=i;
            }
        }
        return t;
    }
    //option 2
    public static long sortDigits2(long num){
        long n = 0;
        char a[] = Long.toString(num).toCharArray();
        Arrays.sort(a);
        for(int i=0; i<a.length; i++)
            if(a[i]!='0'){
                n*=10;
                n+=a[i]-'0';
            }
        return n;
    }

    //option 3
    public static long sortDigits3(long num){
        String s = String.valueOf(num);
        char cnumb[] = s.toCharArray();
        Arrays.sort(cnumb);
        String ss = new String(cnumb);
        long new_numb = Long.valueOf(ss);
        return new_numb;
    }
}