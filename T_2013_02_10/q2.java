package src.T_2013_02_10;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q2 {

    public static void main(String[] args) {
        Point a[] = new Point[6];
        a[0] = new Point(0,3);
        a[1] = new Point(2,5);
        a[2] = new Point(-1,-1);
        a[3] = new Point(0,-3);
        a[4] = new Point(-2,-5);
        a[5] = new Point(0.3,5);
        a[5] = new Point(0,2);
        a[5] = new Point(0,0);
        System.out.println(opposite(a));
    }
    public static int opposite(Point pArr[]){
        int count=0;
        for (int i = 0; i < pArr.length; i++) {
            for (int j = i; j < pArr.length; j++) {
                if(pArr[i].x()==-pArr[j].x() && pArr[i].y()==-pArr[j].y())
                    count++;
            }
        }
        return count;
    }
}