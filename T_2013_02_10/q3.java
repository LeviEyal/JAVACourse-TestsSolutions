package src.T_2013_02_10;

import java.util.regex.Pattern;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q3 {

    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "-123";
        String s3 = "+123";
        String s4 = "1.2.3";
        String s5 = "-.123";
        String s6 = "-123.";
        String s7 = "-e123";
        String s8 = "&123";
        String s9 = "-+123";
        String s10 = ".-123";
        System.out.println(s1+" - "+ isANumber(s1));
        System.out.println(s2+" - "+ isANumber(s2));
        System.out.println(s3+" - "+ isANumber(s3));
        System.out.println(s4+" - "+ isANumber(s4));
        System.out.println(s5+" - "+ isANumber(s5));
        System.out.println(s6+" - "+ isANumber(s6));
        System.out.println(s7+" - "+ isANumber(s7));
        System.out.println(s8+" - "+ isANumber(s8));
        System.out.println(s9+" - "+ isANumber(s9));
        System.out.println(s10+" - "+ isANumber(s10));
    }

    private static String isANumber(String s) {
        if(Pattern.matches("^[+-]?\\d+$", s)) return "int";
        if(Pattern.matches("^([+-]?\\d*\\.\\d*)$", s)) return "double";
        return "not a number";
    }
}