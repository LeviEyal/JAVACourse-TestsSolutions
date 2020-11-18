package src.T_2015_07_21;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class Point {
    private double _x, _y;

    public Point(double x1, double y1) {
        _x = x1;
        _y = y1;
    }
    public Point(Point p) {
        _x = p.x();
        _y = p.y();
    }

    public double x() {return _x;}
    public double y() {return _y;}

    public double distance(Point p) {
        double temp = Math.pow(p.x() - _x, 2) 
                    + Math.pow(p.y() - _y, 2);
        return Math.sqrt(temp);
    }

    public String toString() {
        return "[" + _x + "," + _y + "]";
    }
    public boolean equals (Point p) {
        return (p!=null 
                && p. x() == _x 
                && p. y()==_y );
    }
}