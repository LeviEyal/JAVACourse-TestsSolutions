package src.T_2015_12_18;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q3 {

    public static void main(String[] args) {
        System.out.println(diff("1234", "1245"));
        System.out.println(diff("1234", "12345"));
        System.out.println(diff("1234", "678"));
    }
    public static String diff(String a, String b){
        String t = "";
        for (int i = 0; i < a.length(); i++)
            if(!b.contains(""+a.charAt(i)))
                t += a.charAt(i);
        return t;
    }
}