package src.T_2019_02_19;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q4 {

    public static void main(String[] args) {
        SLinkedList sll = new SLinkedList();
        sll.addLast("1");
        sll.addLast("6");
        sll.addLast("2");
        sll.addLast("3");
        sll.addLast("6");
        sll.addLast("1");
        sll.addLast("1");
        sll.addLast("4");
        sll.addLast("9");
        sll.addLast("4");
        System.out.println(sll);
        sll.removeDuplicate();
        System.out.println(sll);
    }
}