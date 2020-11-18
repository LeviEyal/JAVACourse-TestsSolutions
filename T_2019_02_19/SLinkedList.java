package src.T_2019_02_19;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class SLinkedList {

    Node head;
    int size;

    public SLinkedList() {
        head = null;
        size = 0;
    }

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
    
    public void removeDuplicate(){
        for(Node i=head; i!=null; i=i.next)
            for(Node j=i.next; j!=null; j=j.next)
                if(i.data.equals(j.data))
                    remove(j);
    }
    public void remove(Node j){
        if(j==head) head=j.next;
        for(Node i=head; i!=null; i=i.next)
            if(i.next==j)
                i.next=j.next;
    }
}