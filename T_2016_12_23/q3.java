package src.T_2016_12_23;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q3 {

    public static void main(String[] args) {
        System.out.println(longestWord("I love java and python"));
        System.out.println(longestWord2("I love java and python"));
    }

    private static String longestWord(String s) {
        String a[] = s.split(" ");
        int max = 0;
        String bigWord = " ";
        for (int i = 0; i < a.length; i++) {
            if(a[i].length() > max){
                max = a[i].length();
                bigWord = a[i];
            }
        }
        return bigWord;
    }

    //option 2:
    public static String longestWord2(String s){
        String a[] = s.split(" ");
        String max = "";
        for(int i=0 ; i<a.length ; i++)
            if(a[i].length()>max.length())
                max = a[i];
        return max;
    }
}