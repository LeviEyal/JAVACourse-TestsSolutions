package src.T_2014_12_29;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class Question2 {

    public static void main(String[] args) {
        System.out.println(isInt("1234"));  //true
        System.out.println(isInt("34a12")); //false
        System.out.println(isInt("3412#")); //false
        System.out.println(isInt("3412 ")); //false
        System.out.println(isInt("0"));     //true
    }
    
    public static boolean isInt2(String s){
        return s.matches("\\d+");
    }
    
    //option 2
    public static boolean isInt(String s){
        for (int i = 0; i < s.length(); i++)
            if(!(s.charAt(i)>='0' && s.charAt(i)<='9'))
                return false;
        return true;
    }
}