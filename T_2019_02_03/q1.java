package src.T_2019_02_03;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q1 {

    public static void main(String[] args) {
        long t = marsenne1(7);
        System.out.println("\n"+t);

        t = marsenne2(7);
        System.out.println("\n"+t);

        t = marsenne3(7);
        System.out.println("\n"+t);

        t = marsenne4(7);
        System.out.println("\n"+t);

        System.out.println();
        t = marsenne(7);
        System.out.println("\n"+t);

    }
    //option 1
    public static long marsenne1(int i){
        if(i < 0){
            long m = 2 * marsenne1(i + 1);
            long v = m > 0 ? m : -m;
            System.out.print(v - 1+" ");
            return m;
        }
        if(i == 0)
            return 1;
        long mer = marsenne1(-i);
        if(mer < 0)
            mer *=-1;
        return mer - 1;
    }

    //option 2
    private static long marsenne2(int i) {
        if((int)Math.pow(2,i)-1 == 1) return 1;
        System.out.print(marsenne2(i-1)+" ");
        return (int)Math.pow(2,i)-1;
    }

    //option 3
    private static long marsenne3(int i) {
        if(i == 0) return 1;
        System.out.print((int)Math.pow(2,i)-1+" ");
        return Math.max((int)Math.pow(2,i)-1, marsenne3(i-1));
    }

    //option 4
    private static long marsenne4(int i) {
        if(i==0) return 1;
        long temp=1, counter=0;
        while(counter<i){
            temp*=2;
            counter++;
        }
        System.out.print(temp-1+" ");
        return Math.max((int)Math.pow(2,i)-1, marsenne4(i-1));
    }

    private static long marsenne(int i){
        return marsenne(i,1);
    }
    private static long marsenne(int i, int j) {
        long t = (long)Math.pow(2,j)-1;
        System.out.print(t + " ");
        if(i==j) return t;
        else return marsenne(i, ++j);
    }


}