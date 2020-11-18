package src.T_2020_07_26;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

class Node {

	private Point data;
	private Node next;
	
	public Node( Node next, Point p){
		this.data = new Point(p);
		this.next = next;
	}
	
	public String toString(){return data.toString();}
	public Node getNext() {return next;}
	public Point getData() {return data;}
	public void setNext(Node n) {next = n;}
	
}