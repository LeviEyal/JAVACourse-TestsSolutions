package src.T_2018_07_08;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q2 {

    public static void main(String[] args) {
        SingleLinkedList sl = new SingleLinkedList();
        sl.addInPlace(3);
        System.out.println(sl);
        sl.addInPlace(4);
        System.out.println(sl);
        sl.addInPlace(0);
        System.out.println(sl);
        sl.addInPlace(7);
        System.out.println(sl);
        sl.addInPlace(15);
        System.out.println(sl);
        sl.addInPlace(5);
        System.out.println(sl);
        sl.addInPlace(0);
        System.out.println(sl);
        sl.addInPlace(15);
        System.out.println(sl);
        sl.addInPlace(2);
        System.out.println(sl);

        String s = "abcdefghijk";
        int removeIndex = 0;
        String s1 = s.substring(0, removeIndex)+s.substring(removeIndex+1);
        System.out.println(s1); //"ada yada bulshit"
        removeIndex = 3;
        String s2 = s.substring(0, removeIndex)+s.substring(removeIndex+1);
        System.out.println(s2);
        removeIndex = 5;
        String s3 = s.substring(0, removeIndex)+s.substring(removeIndex+1);
        System.out.println(s3);
        removeIndex = 10;
        String s4 = s.substring(0, removeIndex)+s.substring(removeIndex+1);
        System.out.println(s4);
    }
}