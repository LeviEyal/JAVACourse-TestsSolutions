package src.T_2020_06_29;

/********************************************************
*  @author Eyal Levi
*  ÷åøñ îáåà ìçéùåá - àåğéáøñéèú àøéàì 
*  https://github.com/LeviEyal
********************************************************/

public class q1 {
    public static void main(String[] args) {
        System.out.println(decimal2Binary(18));
    }

    private static String decimal2Binary(int n) {
        String s = "";
        while(n>0){
            s = (n%2) + s;
            n /= 2;
        }
        return s;
    }
}