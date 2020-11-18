package src.T_2019_07_02;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class Point {
    private int x, y;
    private String name;

    public Point(int x, int y, String name) {
        setX(x);
        setY(y);
        setName(name);
    }
    public Point(Point other) {
        this(other.x, other.y, other.name);
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean equals(Point other){
        return (x == other.x && y == other.y && name.equals(other.name));
    }
}