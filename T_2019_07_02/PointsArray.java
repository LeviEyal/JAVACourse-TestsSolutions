package src.T_2019_07_02;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class PointsArray {
    private Point[] array;

    public PointsArray(PointsArray other){
        this.array = new Point[other.array.length];
        for(int i=0; i<other.array.length; i++){
            this.array[i] = new Point(other.array[i]);
        }
    }
    public boolean equals(PointsArray other){
        if(array.length != other.array.length)
            return false;
        for(int i=0; i<array.length; i++){
            if(array[i].equals(other.array[i]) == false)
                return false;
        }
        return true;
    }
    public Point[] copyArrayFromTo(int x, int y){
        if(x>y||x<0||y<0||y>=array.length) return null;
        Point t[] = new Point[y-x+1];
        for(int i=x, j=0; i<y; i++, j++){
            t[j] = new Point(array[i]);
        }
        return t;
    }
}