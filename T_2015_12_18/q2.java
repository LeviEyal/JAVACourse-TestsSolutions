package src.T_2015_12_18;

import java.util.Arrays;

/********************************************************
*  @author Eyal Levi
*  ���� ���� ������ - ���������� ����� 
*  https://github.com/LeviEyal
********************************************************/

public class q2 {
    public static void main(String[] args) {
        int a[] = {2,4,5,6,32,1};
        int b[] = {6,32,1};
        System.out.println(contains(a, b));
    }
    public static int contains(int[] arrbig, int[] arrsmall){
        String t = Arrays.toString(arrsmall).replaceAll("\\[|\\]", "");
        return Arrays.toString(arrbig).indexOf(t)/3;
    }
}