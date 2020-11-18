package src.T_2013_02_10;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q5 {

    public static void main(String[] args) {
        System.out.println(appearance("aabbbtgjjjjjiu",3));
        System.out.println(appearance("aabbbtgjjjjjiu",0));
        System.out.println(appearance("abbbtgjjjjjaiu",2));
        System.out.println(appearance("aabbbtgjjjjjiu",6));
    }

    private static char appearance(String s, int n) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(s.length() - s.replace(""+c, "").length() == n)
                return c;
        }
        return '?';
    }
}