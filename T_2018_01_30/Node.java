package src.T_2018_01_30;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public String toString() {
        return data;
    }
}