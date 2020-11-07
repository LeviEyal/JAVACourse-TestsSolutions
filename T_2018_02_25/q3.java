package src.T_2018_02_25;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q3 {

    public static void main(String[] args) {
        char a[][] =   {{'a','w','x','r','e'},
                        {'f','y','e','s','h'},
                        {'t','y','y','e','a'},
                        {'a','a','h','t','r'},
                        {'h','f','g','z','z'}};
        System.out.println(crossword(a, "yesh"));
        System.out.println(crossword(a, "hat"));
        System.out.println(crossword(a, "yafw"));
        System.out.println(crossword(a, "hatfa"));
    }
    public static boolean crossword(char[][] a, String s){
        for(int i=0; i<a.length; i++){
            String temp = new String(a[i]);
            if(temp.contains(s))
                return true;
        }
        for(int j=0; j<a[0].length; j++){
            String temp = "";
            for(int i=a.length-1; i>=0; i--)
                temp+=a[i][j];
            if(temp.contains(s))
                return true;
        }
        return false;
    }
} 