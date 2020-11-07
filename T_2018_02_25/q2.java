package src.T_2018_02_25;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q2 {

    public static void main(String[] args) {
        System.out.println(moveMost("abbacbca"));
    }

    private static String moveMost(String s) {
        char c[] = s.toCharArray();
        char max = ' ';
        int count = 0;
        for(int i=0; i<c.length; i++){
            int corChar = s.length()-s.replace(""+s.charAt(i), "").length();
            System.out.println(corChar);
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
}