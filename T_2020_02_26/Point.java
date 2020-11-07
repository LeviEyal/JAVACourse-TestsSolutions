package src.T_2020_02_26;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class Point {
    private double xVal;
    private double yVal;

    public Point(double x, double y) {
        xVal = x;
        yVal = y;
    }

    public double getX() {
        return xVal;
    }

    public double getY() {
        return yVal;
    }
}