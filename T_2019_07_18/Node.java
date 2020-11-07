package src.T_2019_07_18;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        next = null;
    }

    public Node(String data, Node next) {
        this.data = data;
        this.next = next;
    }


//---------------------------------------
    /* Added only for testing */
    public String toString() {
        return data;
    }
}