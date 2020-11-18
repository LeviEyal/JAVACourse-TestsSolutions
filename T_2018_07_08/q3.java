package src.T_2018_07_08;

import java.util.Arrays;
import java.util.Scanner;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q3 {
    public static void main(String[] args) {
        int array[][] = makeArray("2x7,6x3,1x0");
        System.out.println(Arrays.deepToString(array));
        // System.out.println();
        int array2[][] = makeArray("3x3,4x-2");
        System.out.println(Arrays.deepToString(array2));

        System.out.println();
        int array3[][] = makeArray2("2x7,6x3,1x0");
        System.out.println(Arrays.deepToString(array3));
        int array4[][] = makeArray2("3x3,4x-2");
        System.out.println(Arrays.deepToString(array4));
    }

    private static int[][] makeArray(String s) {
        s = s.replace('x', ',');
        String t[] = s.split(",");
        // String t[] = s.split("[x,]");
        int a[][] = new int[t.length/2][];
        int k=0;
        for (int i = 0; i < t.length; i+=2) {
            int count = Integer.parseInt(t[i]);
            int num = Integer.parseInt(t[i+1]);
            a[k] = new int[count];
            Arrays.fill(a[k], num);
            k++;
        }
        return a;
    }
    
    //option 2:
    private static int[][] makeArray2(String s) {
        int numRaws = 1;
        for(int i=0; i<s.length(); i++)
            if(s.charAt(i)==',')
                numRaws++;
        s = s.replace('x' ,' ');
        s = s.replace(',' ,' ');
        int array[][] = new int[numRaws][];
        Scanner sc = new Scanner(s);
        int i=0;
        while(sc.hasNextInt()){
            int m = sc.nextInt();
            int n = sc.nextInt();
            array[i] = new int[m];
            for(int j=0; j<array[i].length; j++)
                array[i][j] = n;
            i++;
        }
        sc.close();
        return array;
    }
    
}