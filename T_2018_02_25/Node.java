package src.T_2018_02_25;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class Node {
    private int data;
    private Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
    public int getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node n){
        next = n;
    }
    public String toString() { 
        return "" + data;
    }
}
