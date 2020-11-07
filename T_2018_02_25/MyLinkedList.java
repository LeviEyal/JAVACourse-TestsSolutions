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
        for(Node i=head; i!=null; i=i.getNext()){
            for(Node j=head; j!=null; j=i.getNext()){
                
            }
        }
    }
}