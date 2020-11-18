package src.T_2019_02_03;

import java.util.Scanner;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q2 {

    public static void main(String[] args) {
        simCoin();
    }

    private static void simCoin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert the probably for 0:");
        double p = sc.nextDouble();
        System.out.println("Please insert the number of tries:");
        int t = sc.nextInt();
        sc.close();

        int count = 0;
        for (int i = 0; i < t; i++){
            int roll = (int)(Math.random()*2);
            if(roll == 0)
                count++;
        }
        double dif = p-(double)count/t;
        System.out.println("The difference is: "+dif);
    }
}