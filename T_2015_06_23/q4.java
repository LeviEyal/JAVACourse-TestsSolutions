package src.T_2015_06_23;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q4 {

    public static void main(String[] args) {
        System.out.println(longestWord("In Java all function definitions must be inside classes"));
        System.out.println(longestWord2("In Java all function definitions must be inside classes"));
    }
    public static String longestWord(String s){
        String a[] = s.split(" ");
        String max = "";
        for(int i=0 ; i<a.length ; i++)
            if(a[i].length()>max.length())
                max = a[i];
        return max;
    }

    //option 2:
    private static String longestWord2(String s) {
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
}