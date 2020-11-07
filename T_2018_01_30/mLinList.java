package src.T_2018_01_30;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class mLinList {
    Node head;
    int mLinList;
    int size;

    public mLinList() {
        head = null;
        size = 0;
    }

    public void add(String data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new Node(data);
        }
        size++;
    }

    public String toString() {
        String ans = "[";
        if (head == null)
            ans = "[]";
        else {
            Node n = head;
            while (n.next != null) {
                ans = ans + n.data + ", ";
                n = n.next;
            }
            ans = ans + n.data + "]";
        }
        return ans;
    }

    public boolean swap(int i, int j){
        if(i<0 || j<0 || i>=size || j>=size) return false;
        int k=0, m=0;
        for(Node p=head; p!=null; p=p.next, m++){
            k=0;
            for(Node p2=head; p2!=null; p2=p2.next, k++){
                if(k==i && m==j){
                    String t = p.data;
                    p.data = p2.data;
                    p2.data = t;
                    return true;
                }
            }
        }
        return false;
    }

    //option 2
    public boolean swap2(int i, int j){
        if(i<0 || j<0 || i>=size || j>=size) return false;
        String t = index(i).data;
        index(i).data = index(j).data;
        index(j).data = t;
        return true;
    }
    public Node index(int i){
        for(Node p=head; p!=null; p=p.next, i--)
            if(i==0) return p;
        return null;
    }


}