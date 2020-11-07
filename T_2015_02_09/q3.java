package src.T_2015_02_09;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q3 {

    public static void main(String[] args) {
        int arr[] = {1,0,0,0,1,0,0,1,1,0};
        System.out.println(subSeqOfZeros(arr));
    }
    public static int subSeqOfZeros(int arr[]){
        int max=0, count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1) count = 0;
            else count++;
            if(count>max) max = count;
        }
        return max;
    }
}