package src.T_2019_07_18;

public class moedB{
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        int r1 = a/b;
        int r2 = (int)((double)a/b);
        double r3 = a/b;
        double r4 = (double)a/b;
        double r5 = (double)(a/b);
        String str = r1 + "," + r2 + "," + r3 + "," + r4 + "," + r5;
        System.out.println(str);
        System.out.println("1+2 = " + 1 + 2);
        int[] array1= {1,2,3,4,5};
        int[] array2= {1,2,3,4,5};
        System.out.println(array1 == array2);
    }
}