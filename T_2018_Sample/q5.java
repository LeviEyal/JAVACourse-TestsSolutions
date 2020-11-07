package src.T_2018_Sample;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q5 {

    public static void main(String[] args) {
        System.out.println(isSim(new double[]{1,2,3,4,3,2,1}));     //true
        System.out.println(isSim(new double[]{1,2,3,4,4,3,2,1}));   //true
        System.out.println(isSim(new double[]{1,1,3,4,3,2,1}));     //false
        System.out.println(isSim2(new double[]{1,2,3,4,3,2,1}));    //true
        System.out.println(isSim2(new double[]{1,2,3,4,4,3,2,1}));  //true
        System.out.println(isSim2(new double[]{1,1,3,4,3,2,1}));    //false
    }

    private static boolean isSim(double[] arr) {
        for (int i = 0; i < arr.length/2 ; i++) {
            if(arr[i] != arr[arr.length-1-i])
                return false;
        }
        return true;
    }
    //option 2
    private static boolean isSim2(double[] arr) {
        for (int i = 0, j=arr.length-1 ; i < j ; i++, j--)
            if(arr[i] != arr[j])
                return false;
        return true;
    }
}