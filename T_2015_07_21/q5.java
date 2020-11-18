package src.T_2015_07_21;

public class q5 {
    public static void main(String[] args) {
        RingCollection rc = new RingCollection();
        Ring r0 = new Ring(new Point(3, 4), 1, 2);
        Ring r1 = new Ring(new Point(3, 5), 2, 3);
        Ring r2 = new Ring(new Point(1, 2), 1, 5);
        Ring r3 = new Ring(new Point(2, 6), 7, 10);
        Ring r4 = new Ring(new Point(3, 8), 5, 6);
        Ring r5 = new Ring(new Point(7, 9), 2, 8);
        rc.addDifferent(r0);
        rc.addDifferent(r1);
        rc.addDifferent(r2);
        rc.addDifferent(r3);
        rc.addDifferent(r4);
        rc.addDifferent(r5);
        System.out.println(rc);
        System.out.println(rc.contains(r3));
        rc.remove(1);
        System.out.println(rc);
        Ring r6 = new Ring(new Point(7, 9), 3, 11);
        Ring r7 = new Ring(new Point(0.3, 2), 2, 34);
        Ring r8 = new Ring(new Point(7, 0), 1, 3);
        rc.addDifferent(r6);
        rc.addDifferent(r7);
        rc.addDifferent(r8);
        System.out.println(rc);
    }
}
