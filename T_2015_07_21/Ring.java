package src.T_2015_07_21;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class Ring {

    private Point p;
    private double r1, r2;

    public Ring(Point p, double r1, double r2) {
        this.p = new Point(p);
        this.r1 = r1;
        this.r2 = r2;
    }

    public Ring(Ring other) {
        this(other.p, other.r1, other.r2);
    }

    public boolean isIn(Point p){
        return (p.distance(this.p)>r2 &&
                 p.distance(this.p)<r1);
    }

    public boolean equals(Ring other){
        return (p.equals(other.p) 
                && r1==other.r1 
                && r2==other.r2 );
    }

    @Override
    public String toString() {
        return "[p=" + p + ", r1=" + r1 + ", r2=" + r2 + "]";
    }
}