package src.T_2013_03_18;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class PointContainer {
	public static final int INIT_SIZE = 10;
	public static final int RESCALE = 10;
	private int _sp = 0;
	private Point[] _points;

	public PointContainer() {
		_sp = 0;
		_points = new Point[INIT_SIZE];
	}

	public int size() {
		return _sp;
	}

	public void add(Point point) {
		if (point != null) {
			if (_sp == _points.length)
				rescale(RESCALE);
			_points[_sp] = new Point(point); // deep copy semantic.
			// _points[_sp] = p; // copy reference, (not deep).
			_sp++;
		}
	}

	public Point at(int p) {
		if (p >= 0 && p < size())
			return _points[p];
		return null;
	}

	private void rescale(int t) {
		Point[] tmp = new Point[_sp + t];
		for (int i = 0; i < _sp; i++)
			tmp[i] = _points[i];
		_points = tmp;
	}

	public boolean contains(Point p){
		boolean ans = false;
		for (int i=0; !ans&&i<_sp; i++){
			if(p.equals(_points[i]) == true){
				ans = true;
			}
		}
		return ans;
	}

	public void delete(Point[] pArr) {
		PointContainer t = new PointContainer();
			for (int i = 0; i < pArr.length; i++)
				if (!this.contains(pArr[i]))
					t.add(pArr[i]);
		this._points = t._points;
		this._sp = t.size();
	}

}
