package src.T_2013_02_10;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class Triangle {

    private double a;
    private double b;

    public Triangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double getArea(){
        return (a*b)/2;
    }
    public boolean isEqual(Triangle t){
        return (a==t.a && b==t.b);
    }
}