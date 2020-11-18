package src.T_2019_02_03;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q3 {

    public static void main(String[] args) {
        System.out.println(single("abracadabra"));
        System.out.println(single("abcdcb"));
        System.out.println(single2("abracadabra"));
        System.out.println(single2("abcdcb"));
    }

    private static String single(String s) {
        int a[] = new int['z'];
        for (int i = 0; i < s.length(); i++){
            a[s.charAt(i)]++;
        }
        String temp = "";
        for (int i = 0; i < s.length(); i++){
            if(a[s.charAt(i)] == 1)
                temp += s.charAt(i);
        }
        return temp;
    }

    private static String single2(String s) {
        int a[] = new int[25];
        for (int i = 0; i < s.length(); i++){
            a[s.charAt(i)-'a']++;
        }
        String temp = "";
        for (int i = 0; i < a.length; i++){
            if(a[i]==1)
                temp += ""+(char)('a'+i);
        }
        return temp;
    }
    
    //option 2
    private static String single3(String s) {
        String t="";
        for (int i = 0; i < s.length(); i++)
            if(s.length() - s.replace(""+s.charAt(i), "").length() == 1)
                t+=""+s.charAt(i);
        return t;
    }
}