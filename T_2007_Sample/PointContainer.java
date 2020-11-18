package src.T_2007_Sample;

import java.util.Arrays;

/*****************************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל
*  https://github.com/LeviEyal
******************************************************************/

public class PointContainer{
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
	
	public void add (Point point) {
		if (point != null){
			if(_sp==_points.length) rescale(RESCALE);
			_points[_sp] = new Point(point);  // deep copy semantic.
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
	public PointContainer intersection(PointContainer pc){
		PointContainer t = new PointContainer();
		for(int i=0; i<this.size(); i++)
			for(int j=0; j<this.size(); j++)
				if(this.at(i).equals(pc.at(j)))
					t.add(this.at(i));
		return t;
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

	public int[] contains(Point p){
		int t[] = new int[size()];
		int count = 0;
		for (int i = 0; i < size(); i++)
			if(p.equals(this.at(i)))
				t[count++] = i;
		return Arrays.copyOf(t, count);
	}

}
