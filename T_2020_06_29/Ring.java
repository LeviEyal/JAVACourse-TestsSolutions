package src.T_2020_06_29;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class Ring {
    private Point p;
    private double r1,r2;

    public Ring(Point p, double r1, double r2){
        this.p = new Point(p);
        this.r1 = r1;
        this.r2 = r2;
    }

    public Ring(Ring other){
        this.p = new Point(other.p);
        this.r1 = other.r1;
        this.r2 = other.r2;
    }

    public int inArea(Point t){
        double distanceFromCenter = p.distance(t);
        if(distanceFromCenter < r1) return 1;
        if(distanceFromCenter <= r2) return 2;
        return 3;
    }
}