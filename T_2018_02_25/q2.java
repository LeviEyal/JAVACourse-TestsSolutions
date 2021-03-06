package src.T_2018_02_25;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q2 {

    public static void main(String[] args) {
        System.out.println(moveMost("abbacbca"));
        System.out.println(moveMost2("abbacbca"));
    }

    private static String moveMost(String s) {
        char c[] = s.toCharArray();
        char max = ' ';
        int count = 0;
        for(int i=0; i<c.length; i++){
            int corChar = s.length()-s.replace(""+s.charAt(i), "").length();
            if(corChar>count){
                count = corChar;
                max=s.charAt(i);
            }
        }
        s = s.replace(""+max,"");
        for(int i=0; i<count; i++)
            s+=""+max;
        return s;
    }

    //option 2:
    private static String moveMost2(String s) {
        String max = "";
        for (int i = 0; i < s.length(); i++) {
            String c = ""+s.charAt(i);
            int cor = s.length()-s.replace(c,"").length();
            if(max.length() < cor)
                max = c.repeat(cor);
        }
        return s.replace(max.charAt(0)+"", "") + max;
    }
}