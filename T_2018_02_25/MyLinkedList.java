package src.T_2018_02_25;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class MyLinkedList {
    private Node head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }
    public int getSize() {
        return size;
    }
    public void add(int data){
        if (head == null){
            head = new Node(data);
        }
        else{
            Node n = head;
            while(n.getNext()!= null){
                n = n.getNext();
            }
            n.setNext(new Node(data));
        }
        size++;
    }
    public void sort(){
        MyLinkedList sorted = new MyLinkedList();
        Node p = head;
        while(p != null){
            Node temp = p.getNext();
            sorted.addInPlace(p);
            p = temp;
        }
        this.head = sorted.head;
    }
    private void addInPlace(Node newnode){
        if (head == null || head.getData() >= newnode.getData())  { 
            newnode.setNext(head); 
            head = newnode; 
        } 
        else { 
            Node current = head; 
            while( current.getNext() != null 
                && current.getNext().getData() < newnode.getData())  { 
                current = current.getNext(); 
            } 
            newnode.setNext(current.getNext());
            current.setNext(newnode);
        } 
    }

    public String toString() {
        if (head == null)
            return "[]";
        String res = "[";
        Node pointer = head;
        while (pointer.getNext() != null) {
            res = res + pointer.toString() + ", ";
            pointer = pointer.getNext();
        }
        res = res + pointer.toString();
        return res + "]";
    }
}