package src.T_2020_06_29;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q5 {
    public static void main(String[] args) {
        LinkedListDouble dll = new LinkedListDouble();
        dll.add(1);
        dll.add(2);
        dll.add(3);
        dll.add(4);
        dll.add(5);
        dll.add(6);

        System.out.println("Before reverse: " + dll);
        reverse(dll);
        System.out.println("After reverse:  " + dll);
    }

    public static void reverse(LinkedListDouble dll) {
        LinkedListDouble t = new LinkedListDouble();
        for(NodeD p = dll.getTail(); p!=dll.getHead(); p=p.getPrev())
            t.add(p.getData());
        t.add(dll.getHead().getData());
        dll.setHead(t.getHead());
        dll.setTail(t.getTail());   
    }
}