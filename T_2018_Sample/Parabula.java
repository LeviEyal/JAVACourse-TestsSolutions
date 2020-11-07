package src.T_2018_Sample;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class Parabula {

    private double a,b,c;

    public Parabula(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Parabula(Parabula other) {
        this(other.a, other.b, other.c);
    }

    public double f(double x){
        return a*x*x + b*x +c;
    }
    
    public boolean above(Point p){
        return p.y() > f(p.x());
    }


    
}