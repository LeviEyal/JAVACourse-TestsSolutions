package src.T_2020_02_03;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class Ellipse {
    private Point p;
    private Point q;
    private int n;

    public Ellipse(double xp, double yp, double xq, double yq, int n){
        this.p = new Point(xp,yp);
        this.q = new Point(xq,yq);
        this.n = n;
    }
    public Ellipse(Ellipse other){
        this.p = new Point(other.p);
        this.q = new Point(other.q);
        this.n = other.n;
    }
    public int where(Point r){
        double a = p.distance(r);
        double b = q.distance(r);
        if(a+b==n) return 0;
        if(a+b>n) return 1;
        return -1;
    }
    public boolean equals(Ellipse e){
        if(p.equals(e.p) && q.equals(e.q) && n==e.n)
            return true;
        else return false;
    }  
}