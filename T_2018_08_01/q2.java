package src.T_2018_08_01;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q2 {
    public static void main(String[] args) {
        System.out.println(removeByChance("eyalushlevi", 4));
        System.out.println(removeIndex("eyal", 0));
        System.out.println(removeIndex("eyal", 1));
        System.out.println(removeIndex("eyal", 2));
        System.out.println(removeIndex("eyal", 4));
    }

    public static String removeByChance(String s, int n){
        for(int i=0; i<n; i++){
            int rand= (int)(Math.random() * s.length()) - i +1;
            s = removeIndex(s,rand);
        }
        return s;
    }

    private static String removeIndex(String s, int index){
        return s.substring(0, index) + s.substring(index+1);
    }

    private static String removeIndex2(String s, int index){
        String t="";
        for (int i = 0; i < s.length(); i++) {
            if(i != index)
                t += s.charAt(i);
        }
        return t;
    }
}
