package src.T_2018_Sample;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q2 {

    public static void main(String[] args) {
        System.out.println(longestWord("ab abdj jsk wyyyyyy h kkkkj"));
    }

	private static String longestWord(String s) {
        String a[] = s.split(" ");
        String longest = "";
        for (int i = 0; i < a.length; i++)
            if(a[i].length() > longest.length())
                longest = new String(a[i]);
		return longest;
	}
}