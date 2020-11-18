package src.T_2020_06_29;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public final class Point {
    // ******** private data members ********
    private double _x, _y;  // we "mark" data members of the classusing.

    // ********* constructors ********
    // initilizesthe point according to its coordinates: (x1,y1)
    public Point (double x1, double y1){
        _x = x1;
        _y = y1;
    }

    // initializesthe point -origin (0,0)
    public Point (){
        _x = 0;
        _y = 0;
    }

    //copy constructor
    public Point (Point p){
        _x = p._x;
        _y = p._y;
    }

    // ********** public methodes*********
    // returns the first coordinate of the point
    public double x() {
        return _x;
    }

    // returns the second coordinate of the point
    public double y() {
        return _y;
    }

    /** @return the distance between two points
     * @param p - other Point.
     */
    public double distance (Point p)  {
        double temp = (p.x()-_x)*(p.x()-_x)+(p.y()-_y)*(p.y()-_y);
        return Math.sqrt(temp);
    }

    /** @return a String contains the Point data
    */
    public String toString()  {
        String s = " (" + _x + "," + _y+")";
        return s;
    }

    /** logical equals: 
     * @param p other Point.
     * @return true if p logicly the same)
     */
    public boolean equals (Point p) {
        boolean ans = false;
        if((p!=null) && (p.x()==_x) && (p.y()==_y)){
            ans = true;
        }
        return ans;
    }
}