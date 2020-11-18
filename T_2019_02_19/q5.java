package src.T_2019_02_19;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

/*
Anser:
------------------
3 7
4 6
4 6
ABC wxz
3 0 4 5 1
------------------
*/

public class q5 {
    public static void main(String[] args) {
        int x = 3, y = 7;
        swap(x, y); //do Nothing
        System.out.println(x + " " + y); //3 7
        int[] array = { 6, 4, 2, 0, 5, 1 };
        swap(array, 0, 1); //{4,6,2,0,5,1}
        System.out.println(array[0] + " " + array[1]); //4 6
        swap(array[0], array[1]); //do nothing
        System.out.println(array[0] + " " + array[1]); //4 6
        String a = "ABC";
        String b = "wxz";
        swap(a, b); //do nothing
        System.out.println(a + " " + b); //ABC wxz
        int cell = 3;
        while (cell >= 0 && cell <= 5) {
            System.out.print(cell + " ");
            cell = array[cell];
        }
        System.out.println();
    }

    public static void swap(int x, int y) {
        int help = x;
        x = y;
        y = help;
    }

    public static void swap(int[] arr, int i, int j) {
        int help = arr[i];
        arr[i] = arr[j];
        arr[j] = help;
    }

    public static void swap(String a, String b) {
        String help = a;
        a = b;
        b = help;
    }
}
