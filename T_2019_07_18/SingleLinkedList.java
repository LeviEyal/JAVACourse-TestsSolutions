package src.T_2019_07_18;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class SingleLinkedList {
    private Node head;
    private int size;

    public SingleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean removeK(int pos, int k){
        if(pos<0 || k<0 || pos+k>size) return false;
        if(pos==0){
            head = at(k);
            return true;
        } 
        at(pos-1).next = at(pos+k);
        return true;
    }
    public Node at(int k){
        for(Node p=head; p!=null; p=p.next, k--)
            if(k==0) return p;
        return null;
    }


/**************************************
*     Added only for testing:
***************************************/

    public void addLast(String element) {
        if (head == null)
            head = new Node(element);
        else {
            Node pointer = head;
            while (pointer.next != null)
                pointer = pointer.next;
            pointer.next = new Node(element);
        }
        size++;
    }
    public String toString() {
        if (head == null)
            return "[]";
        String res = "[";
        Node pointer = head;
        while (pointer.next != null) {
            res = res + pointer.toString() + ", ";
            pointer = pointer.next;
        }
        res = res + pointer.toString();
        return res + "]";
    }
}