package src.T_2018_Sample;

import java.util.Arrays;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class PointContainer {
	public static final int INIT_SIZE=10;
	public static final int RESCALE=10;
	private int _sp=0;
	private Point[] _points;
	
	public PointContainer(){
		_sp=0;
		_points = new Point[INIT_SIZE];
	}
	
	public int size() {
        return _sp;
    }
	
	public void add (Point p){
		if (p != null){
			if(_sp==_points.length) rescale(RESCALE);
			_points[_sp] = new Point(p);  // deep copy semantic.
			//_points[_sp] = p;           // copy reference, (not deep).
			_sp++;
		}
	}
		
	public Point at(int p){
		if (p>=0 && p<size()) return _points[p];
		return null;
	}
	
	private void rescale(int t) {
		Point[] tmp = new Point[_sp+t];
		for(int i=0;i<_sp;i++) tmp[i] = _points[i];
		_points = tmp;
    }
    
    public Point[] maxIn(Rectangle[] arr){
        Point t[] = new Point[size()];
        int count=0, count2=0;
        for (int i = 0; i < size(); i++) { //   מעבר נקודה נקודה
            double x0 = _points[i].x();
            double y0 = _points[i].y();
			count=0;
            for (int j = 0; j < arr.length; j++) { //   מעבר מלבן מלבן
				double x1 = arr[j].getP1().x(), y1 = arr[j].getP1().y();
                double x2 = arr[j].getP2().x(), y2 = arr[j].getP2().y(); 
                if(x0<x1 || x0>x2 || y0<y1 || y0>y2){
					count++;
				}
            }
			if(count==arr.length)
				t[count2++] = new Point(_points[i]);
        }
        return Arrays.copyOf(t,count2);
	}

	public void sort(){
		int s = size();
		Point z = new Point(0,0);
		for (int i = 0; i < s; i++) {
			for (int j = 0; j < s-i-1; j++) {
				if(_points[j].distance(z)>_points[j+1].distance(z)){
					Point t = new Point(_points[j]);
					_points[j] = new Point(_points[j+1]);
					_points[j+1] = new Point(t);
				}
			}
		}
	}
}
