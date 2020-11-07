package src.T_2019_07_02;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q2 {

    public static void main(String[] args) {
        System.out.println(isSymmetricX("abcwercba",3));
        System.out.println(isSymmetricX("abcwercba",2));
        System.out.println(isSymmetricX("abcwercba",4));
    }
    public static boolean isSymmetricX(String s, int x){
        if(x==0) return true;
        if(s.charAt(0)==s.charAt(s.length()-1))
            return isSymmetricX(s.substring(1,s.length()-1), x-1);
        return false;
    }
}