package src.T_2020_02_26;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q5_cycleLL {

    public static void main(String[] args) {
        Node a1 = new Node(-2);
        Node a2 = new Node(3);
        Node a3 = new Node(100);
        Node a4 = new Node(9);
        Node a5 = new Node(-30);
        Node a6 = new Node(11);
        Node a7 = new Node(5);
        Node a8 = new Node(3);
        a1.setNext(a2);
        a2.setNext(a3);
        a3.setNext(a4);
        a4.setNext(a5);
        a5.setNext(a6);
        a6.setNext(a7);
        a7.setNext(a8);
        a8.setNext(a5);
        System.out.println(cycle(a1).getData());
        System.out.println(cycle2(a1).getData());
    }

    private static Node cycle(Node p) {
        for(Node A=p; A!=null; A=A.getNext())
            for(Node B=p; B!=A; B=B.getNext())
                if(A.getNext() == B.getNext())
                    return A.getNext();
        return null;
    }

    //option 2:
    public static Node cycle2(Node p) {
        Node slow = p;
        Node fast = p.getNext();
        while (slow != fast) {
            if (fast == null || fast.getNext() == null) {
                return null;
            }
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow.getNext();
    }


}