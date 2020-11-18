package src.T_2015_02_09;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q1 {
    public static void main(String[] args) {
        System.out.println(firstNonRepeated("abcaccbdef"));
        System.out.println(firstNonRepeated("abdczaccbd"));
        System.out.println(firstNonRepeated("aa"));

        System.out.println(firstNonRepeated2("abcaccbdef"));
        System.out.println(firstNonRepeated2("abdczaccbd"));
        System.out.println(firstNonRepeated2("aa"));
    }
    public static char firstNonRepeated(String s){
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            String t = s.substring(0, i) + s.substring(i+1);
            if(t.contains(""+c)==false)
                return c;
        }
        return '?';
    }

    public static char firstNonRepeated2(String s){
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            String t = s.replace(""+c, "");
            if(s.length() - t.length() == 1)
                return c;
        }
        return '?';
    }
}