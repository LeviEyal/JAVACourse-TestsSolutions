package src.T_2018_01_30;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q5 {

    public static void main(String[] args) {
        MyLinkedList ls = new MyLinkedList();
        ls.add("a");
        ls.add("b");
        ls.add("c");
        ls.add("d");
        ls.add("e");
        ls.add("f");
        System.out.println(ls);
        System.out.println(ls.swap2(0, 5));
        System.out.println(ls);
    }
}