package src.T_2015_06_23;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class TrIangle {

    private double a;
    private double b;
    private Point p;

    public TrIangle(Point p, double a, double b) {
        this.p = new Point(p);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }
    

    
}