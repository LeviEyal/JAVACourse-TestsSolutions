package src.T_2019_02_19;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q3 {

    public static void main(String[] args) {
        System.out.println(mergeStrings("xyz2aaa2", "2abcde22"));
    }

    private static String mergeStrings(String a, String b) {
        String merged = "";
        for (int i = 0; i < a.length(); i++) {
            String c = ""+a.charAt(i);
            if(b.contains(c) && !(merged.contains(c)))
                merged+=c;
        }
        return merged;
    }
}