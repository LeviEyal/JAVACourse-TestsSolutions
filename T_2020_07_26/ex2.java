package src.T_2020_07_26;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

import java.util.Arrays;

public class ex2 {

    // question 1:
    //return a decimal representation of a binary string
    public static int Binary2Dec(String S) {
        int n = 0;
        int l = S.length() - 1; // the length of the string
        for (int i = 0; i <= l; i++) {
            if(S.charAt(i) != '0' && S.charAt(i) != '1')
                return -1;
            int digit = Integer.parseInt("" + S.charAt(i)); 
            n += digit * (int) Math.pow(2, l - i);
        }
        return n;
    }

    // question 2:
    public static int[][] rgb2gray(int[][][] imRGB) {
        int w = imRGB[0][0].length; // weith of the image
        int h = imRGB[0].length; // height of the image
        int gray[][] = new int[h][w]; // declaring the desired image's array
        for (int i = 0; i < h; i++)
            for (int j = 0; j < w; j++)
                gray[i][j] = (int) (  0.30 * imRGB[0][i][j] 
                                    + 0.59 * imRGB[1][i][j] 
                                    + 0.11 * imRGB[2][i][j]) * 255;
        return gray;
    }

    // question 3:
    public static int[] interlace(int[] a, int b[]) {
        int i = 0, j = 0, k = 0; // declaring the pointers
        int alen = a.length, blen = b.length; // declaring the arrays's lengths
        int c[] = new int[alen + blen]; // declaring the result array's length

        while (i < alen && j < blen) { // adding one by one
            c[k++] = a[i++];
            c[k++] = b[j++];
        }
        while (i < alen)
            c[k++] = a[i++]; // adding the leftovers of a
        while (j < blen)
            c[k++] = b[j++]; // adding the leftovers of b
        return c;
    }

    // question 4:
    // bubble sort of points array
    public static void Psort(Point[] p) {
        Point zer = new Point(0, 0); // the zero point
        for (int i = 0; i < p.length - 1; i++)
            for (int j = 0; j < p.length - 1 - i; j++)
                if (p[j].distance(zer) > p[j + 1].distance(zer)) {
                    // swap:
                    Point temp = new Point(p[j]);
                    p[j] = new Point(p[j + 1]);
                    p[j + 1] = new Point(temp);
                }
    }

    public static void main(String[] args) {

        // question 1:
        String S = "11010";
        int sum = Binary2Dec(S);
        System.out.println("sum = "+sum);

        // //question 2:
        int [][][] im=MyImageIO.readImageFromFile("src\\cat.jpeg");
        int[][] gray= rgb2gray(im);
        MyImageIO.writeImageToFile("src\\catGray3.jpg",gray);

        // question 3
        int[] a = {0,2,4,6,8};
        int[] b = {1,3,5,7};
        System.out.println(Arrays.toString(interlace(a,b)));

        // //question 4
        Point p1 = new Point();
        Point p2 = new Point(1, 2);
        Point p5 = new Point(0.3, 2);
        Point p6 = new Point(1, 2);
        Point p3 = new Point(1, 54);
        Point p4 = new Point(7.5, 8);
        Point[] p = {p3,p3,p3,p1,p2,p4,p5,p6};
        Psort(p);
        System.out.println(Arrays.toString(p));
    }

}
