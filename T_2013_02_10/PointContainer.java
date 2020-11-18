package src.T_2013_02_10;

import java.util.Arrays;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class PointContainer {

    public static final int INIT_SIZE = 10;
    public static final int RESCALE = 10;
    private int _sp = 0;
    Point[] _points;

    public PointContainer() {
        _sp = 0;
        _points = new Point[INIT_SIZE];
    }

    public int size() {
        return _sp;
    }

    public void add(Point p) {
        if (p != null) {
            if (_sp == _points.length)
                rescale(RESCALE);
            _points[_sp] = new Point(p);
            _sp++;
        }
    }

    public Point at(int p) {
        if (p >= 0 && p < size())
            return _points[p];
        return null;
    }

    public boolean contains(Point p) {
        boolean ans = false;
        for (int i = 0; !ans && i < _sp; i++) {
            if (p.equals(_points[i]) == true) {
                ans = true;
            }
        }
        return ans;
    }

    private void rescale(int t) {
        Point[] tmp = new Point[_sp + t];
        for (int i = 0; i < _sp; i++)
            tmp[i] = _points[i];
        _points = tmp;
    }

    public void disk(){
        int count = 0;
        Point z = new Point(0,0);
        Point t[] = new Point[_points.length];
        for(int i=0; i<_points.length && _points[i] != null; i++){
            if(_points[i].distance(z)<1){
                t[count] = new Point(_points[i]);
                count++;
            }
        }
        _points = Arrays.copyOf(t,count);
        
    }

}