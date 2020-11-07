package src.T_2018_Sample;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class Rectangle {

    private Point p1;
    private Point p2;

    public Rectangle(Point p1, Point p2) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }
    
}