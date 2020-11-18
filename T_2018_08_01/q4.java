package src.T_2018_08_01;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class q4 {

    public static void main(String[] args) {
        WorldTimes wt1 = new WorldTimes(7);
        WorldTimes wt2 = new WorldTimes(7);
        WorldTimes wt3 = new WorldTimes(wt2);
        for (int i = 0; i < wt1.getNumOfClocks(); i++) {
            System.out.println(wt1.getTimeIndex(i));
        }
        wt2.addOne();
        System.out.println();
        for (int i = 0; i < wt2.getNumOfClocks(); i++) {
            System.out.println(wt2.getTimeIndex(i));
        }
        System.out.println(WorldTimes.getNumOfObjects());
        System.out.println();
        for (int i = 0; i < wt3.getNumOfClocks(); i++) {
            System.out.println(wt3.getTimeIndex(i));
        }
    }
}