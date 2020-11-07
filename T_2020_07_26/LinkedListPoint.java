
/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class LinkedListPoint {
	
	private int size;		//the amount of nodes in the list
	Node head;				//the first node of the list
	
	//empty constructor
	public LinkedListPoint() {
		head = null;
		size=0;
	}

	//constructor of linked list getting next Node and a point
	public LinkedListPoint(Node next, Point p) {
		head = new Node(next,p);
		size=1; 
	}
	
	public void add(Point p ) {
		if(p==null) return;
		Point zer = new Point(0,0);			//zero point
		Node newNode = new Node(null,p);	//the new point to insert
		double key = p.distance(zer);		//the distance of new point to zero point

		//if list empty, make newnode its head
		if(head == null) head = newNode;
		//case of need to insert the newnode before head	
        else if(key < head.getData().distance(zer)){
            newNode.setNext(head);
            head = newNode;
        }
        else{
			Node i=head;
            while(i.getNext()!=null && key > i.getNext().getData().distance(zer)){
				i=i.getNext();	
			}
			newNode.setNext(i.getNext());
			i.setNext(newNode);
        }
        size++;
	}

	//method to remove all occernces of a given point
	public void remove(Point p) {
		if(p==null) return;
		//while the point is in
		while(contains(p)){
			if(head.getData().equals(p)){
				head = head.getNext();
			}
			else{
				Node i=head;
				while(i.getNext()!=null && i.getNext().getData().equals(p)==false){
					i=i.getNext();	
				}
				i.setNext(i.getNext().getNext());
			}
			size--;
		}
	}
	
	public int size() {		//return the size of the linked list
		return size;
	}
	
	//checks if a given point is in the list
	public boolean contains(Point p) {
		if(p==null || size==0) return false;
		for(Node i=head; i!=null; i=i.getNext())
			if(i.getData().equals(p))
				return true;
		return false;
	}
	
	
	@Override
	public String toString() {
		String s="";
		Node t=head;
		while(t!=null) {
			s+=" "+t.toString();
			t=t.getNext();
		}
		return "LinkedListPoint ["+s+"]";
	}
	
	
	public static void main(String[] args) {
		Point p1= new Point(1,0);
		Point p2= new Point(-2,-3.5);
		Point p3= new Point();
		Point p4= new Point(-3,0);
		Point p5= new Point(5,0);
		Point p6 = new Point();
        Point p7 = new Point(1, 2);
        Point p8 = new Point(0.3, 2);
        Point p9 = new Point(1, 2);
        Point p10 = new Point(1, 54);
        Point p11 = new Point(7.5, 8);
		LinkedListPoint ll= new LinkedListPoint();
		System.out.println(ll +" list size:" +ll.size());
		ll.add(p1); 
		System.out.println(ll +" list size:" +ll.size());
		ll.add(p2); 
		System.out.println(ll +" list size:" +ll.size());
		ll.add(p3); 
		System.out.println(ll +" list size:" +ll.size());
		ll.add(p4); 
		System.out.println(ll +" list size:" +ll.size());
		// ll.add(p1); 
		// ll.add(p1); 
		// ll.add(p1);
		// ll.add(p1);
		// ll.add(p1);
		// ll.add(p1);
		// ll.add(p1);
		// ll.add(p1);
		System.out.println("does the list contains p1? "+ ll.contains(p1));
		ll.remove(p2);
		ll.remove(null);
		// ll.remove(p4);
		// ll.remove(p3);
		// ll.remove(p2);
		System.out.println("after removing  2 points: "+ ll);
		System.out.println("list size:" +ll.size());
	}

}