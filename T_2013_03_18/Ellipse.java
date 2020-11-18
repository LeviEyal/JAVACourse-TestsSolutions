package src.T_2013_03_18;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class Ellipse {

    private Point p;
    private double a,b;

    public Ellipse(Point p, double a, double b) {
        this.p = p;
        this.a = a;
        this.b = b;
    }

    public double area(){
        return Math.PI*a*b;
    }

    public boolean equals(Ellipse e){
        return (a==e.a && b==e.b && p.equals(e.p));
    }
}