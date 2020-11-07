package src.T_2018_08_01;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q1 {
    public static void main(String[] args) {
        int[] a = {2,4,7,5,8,6,4,2,5,6,7,8,3};
        System.out.println(isEvenFromTo(a,4,7));
        System.out.println(isEvenFromTo2(a,4,7));
    }

    public static boolean isEvenFromTo(int[] a, int from, int to){
        if(from > to)
            return false;
        if(a[from]%2 != 0 || a[to]%2 != 0)
            return false;
        if(to - from <= 1) 
            return true;   
        else return isEvenFromTo(a, from+1, to-1);
    }

    //option 2:   
    public static boolean isEvenFromTo2(int[] a, int from, int to){
        if(from>to)        return false;
        if(from==to)        return (a[from]%2==0);
        if(a[from]%2==0)    return isEvenFromTo2(a, from+1, to);

        return false;
    }



}

