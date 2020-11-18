package src.T_2020_02_03;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q2 {

    public static void main(String[] args) {
        System.out.println(balanced("SRSR")); // 2
        System.out.println(balanced("RSSRS")); // 2
    }

    public static int balanced(String s) {
        int count = 0;
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            t += "" + s.charAt(i);
            if (isBalanced(t))
                count++;
        }
        return count;
    }

    private static boolean isBalanced(String str) {
        if (str.isEmpty())
            return false;
        int s = str.length() - str.replace("S", "").length();
        int r = str.length() - str.replace("R", "").length();
        return s == r;
    }
}