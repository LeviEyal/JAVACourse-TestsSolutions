package src.T_2018_07_08;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public String toString() { 
        return "" + data;
    }
}

public class SingleLinkedList {
    Node head;
    int size;

    public SingleLinkedList() {
        head = null;
        size = 0;
    }

    public void addInPlace(int num){
        Node newNode = new Node(num);
        if(head == null){
            head = newNode;
        }
        else if(num < head.data){
            Node t = head;
            head = newNode;
            newNode.next = t;
        }
        else{
            for(Node p=head ; p!=null ; p=p.next){
                if(p.next == null || p.next.data > num){
                    Node t = p.next;
                    p.next = newNode;
                    newNode.next = t;
                }
            }
        }
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