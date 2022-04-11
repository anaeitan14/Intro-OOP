package point;

public class Point2 {
	private double _radius;
	private double _alpha;

	public Point2(int x, int y) {
		_radius = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		_alpha = Math.atan2(y, x);

	}

	public Point2(Point2 other) {
		this(other.getX(), other.getY());
	}

	public int getX() {
		return (int) (Math.round(Math.cos(_alpha) * _radius));
	}

	public int getY() {
		return (int) (Math.round(Math.sin(_alpha) * _radius));

	}

	public void setX(int x) {
		if (x < 0) {
			return;
		}
		int y = getY();
		_radius = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		_alpha = Math.atan2(y, x);
	}

	public void setY(int y) {
		if (y < 0) {
			return;
		}
		int x = getX();
		_radius = Math.sqrt(Math.pow(y, 2) + Math.pow(x, 2));
		_alpha = Math.atan2(y, x);

	}

	public boolean equals(Point2 other) {
		if (this._radius == other._radius && this._alpha == other._alpha) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "(" + getX() + "," + getY() + ")";
	}
}
