package src.T_2018_01_30;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q2 {

    public static void main(String[] args) {
        System.out.println(reduce("aaabbccccxxxyzzaaa"));
    }

    private static String reduce(String s) {
        String r = "";
        for(int i=0; i<s.length(); i++){
            String t = ""+s.charAt(i);
            if(r.endsWith(t) == false)
                r += t;
        }
        return r;
    }

}