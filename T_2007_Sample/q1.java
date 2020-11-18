package src.T_2007_Sample;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q1 {

    public static void main(String[] args) {
        
    }
    public static Drawable biggest(Drawable a[]){
        double max = 0;
        int maxIndex=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i].area() > max){
                max = a[i].area();
                maxIndex = i;
            }
        }
        return a[maxIndex];
    }
}