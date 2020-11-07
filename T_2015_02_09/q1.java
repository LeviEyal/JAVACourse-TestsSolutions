package src.T_2015_02_09;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q1 {
    public static void main(String[] args) {
        System.out.println(firstNonRepeated("abcaccbdef"));
        System.out.println(firstNonRepeated("abdcaccbd"));
        System.out.println(firstNonRepeated("aa"));
    }
    public static char firstNonRepeated(String s){
        for(int i=0; i<s.length(); i++){
            String t = s.substring(0, i) + s.substring(i+1);
            if(t.contains(""+s.charAt(i))==false)
                return s.charAt(i);
        }
        return '?';
    }
}