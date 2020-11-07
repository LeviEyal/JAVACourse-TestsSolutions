package src.T_2019_07_18;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q4 {

    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.addLast("a");
        sll.addLast("b");
        sll.addLast("c");
        sll.addLast("d");
        sll.addLast("e");
        sll.addLast("f");
        System.out.println("Before: "+sll);
        System.out.println(sll.removeK(2, 3));
        System.out.println("After: "+sll);

    }
}