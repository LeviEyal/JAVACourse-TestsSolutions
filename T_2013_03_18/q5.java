package src.T_2013_03_18;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q5 {

    public static void main(String[] args) {
        System.out.println(remove("hello", 'l'));
        System.out.println(remove("magician", 'a'));
        System.out.println(remove("magician", 'i'));
    }
    public static String remove(String s, char c){
        return s.replace(""+c, "");
    }
}