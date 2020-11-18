package src.T_2015_07_21;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class Question4 {

    public static void main(String[] args) {
        String s2 = "be" ,s1 = "to be or not to be";
        String t2 = "abc", t1 = "abcdabcdxtbabc";
        System.out.println(numberApearance(s1, s2));
        System.out.println(numberApearance(t1, t2));
    }
    public static int numberApearance(String s1, String s2){
        int s1_size = s1.length();
        int s1_without_s2_size = s1.replace(s2,"").length();
        return (s1_size - s1_without_s2_size) / s2.length();
    }
}