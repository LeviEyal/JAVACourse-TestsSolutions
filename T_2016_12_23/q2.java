package src.T_2016_12_23;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q2 {

    public static void main(String[] args) {
        int a[] ={1,2,3,4,6,9,2,3,5,2};
        int a1[] = {2,3};
        int b[] ={2,5,2,5,2};
        int b1[] = {2,5,2};
        int c[] = {1,2,3,4,6,9,5};
        int c1[] = {4,8,6,9};
        System.out.println(num(a,a1));
        System.out.println(num(b,b1));
        System.out.println(num(c,c1));
    }

    private static int num(int[] arrbig, int[] arrsmall) {
        int count = 0;
        for(int i=0 ;i<arrbig.length - arrsmall.length; i++){
            if(arrbig[i]==arrsmall[0]){
                int flag=0;
                for(int j=0; j<arrsmall.length; j++){
                    if(arrbig[i+j] == arrsmall[j])
                        flag++;
                }
                if(flag == arrsmall.length)
                    count++;
            }
        }
        return count;
    }
}