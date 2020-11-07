package src.T_2020_02_26;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class Segment {
    private Point a,b;

    public Segment(Point a, Point b) {
        this.a = new Point(a.getX(),a.getY());
        this.b = new Point(b.getX(),b.getY());
    }

    public Segment(Segment other) {
        this.a = new Point(other.a.getX(),other.a.getY());
        this.b = new Point(other.b.getX(),other.b.getY());
    }

    public double length(){
        double t1 = Math.pow(a.getX()-b.getX(), 2);
        double t2 = Math.pow(a.getY()-b.getY(), 2);
        return Math.sqrt(t1+t2);
    }

    public boolean isOn(Point p){
        Segment p_a = new Segment(a, p);
        Segment p_b = new Segment(b, p);
        if(length() == p_a.length()+p_b.length())
            return true;
        return false;
    }
}