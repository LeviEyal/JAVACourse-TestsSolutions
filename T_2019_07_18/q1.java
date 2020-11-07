package src.T_2019_07_18;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q1 {

    public static void main(String[] args) {
        for(int i=1; i<20; i++)
            System.out.println(heartBeat(i));
    }

    public static double heartBeat(int n){
        if(n==1) return 55;
        if(n==2) return 57;
        if(n%5 == 0) return 3 + heartBeat(n-1);
        return 2 + (heartBeat(n-1)+heartBeat(n-2))/2.0;
    }
}