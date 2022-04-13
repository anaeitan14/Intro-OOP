package point;

public class Point2 {
	private double _radius;
	private double _alpha;

	public Point2(int x, int y) {
		_radius = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		_alpha = Math.atan2(y, x)*(180/Math.PI);
	}

	public Point2(Point2 other) {
		this(other.getX(), other.getY());
	}

	public int getX() {
		return (int) (Math.round(Math.cos(_alpha/(180/Math.PI)) * _radius));
	}

	public int getY() {
		return (int) (Math.round(Math.sin(_alpha/(180/Math.PI)) * _radius));

	}

	public void setX(int x) {
		if (x < 0) {
			return;
		}
		int y = getY();
		_radius = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		_alpha = Math.atan2(y, x)*(180/Math.PI);
	}

	public void setY(int y) {
		if (y < 0) {
			return;
		}
		int x = getX();
		_radius = Math.sqrt(Math.pow(y, 2) + Math.pow(x, 2));
		_alpha = Math.atan2(y, x)*(180/Math.PI);

	}

	public boolean equals(Point2 other) {
		if (this._radius == other._radius && this._alpha == other._alpha) {
			return true;
		}
		return false;
	}

	public boolean isAbove(Point2 other) {
		if (this.getY() > other.getY()) {
			return true;
		}
		return false;
	}

	public boolean isUnder(Point2 other) {
		if (other.isAbove(this)) {
			return true;
		}
		return false;
	}

	public boolean isLeft(Point2 other) {
		if (this.getX() < other.getX()) {
			return true;
		}
		return false;
	}

	public boolean isRight(Point2 other) {
		if (other.isLeft(this)) {
			return true;
		}
		return false;
	}

	public double distance(Point2 other) {
		double dist = Math.pow(this.getY() - other.getY(), 2) + Math.pow(this.getX() - other.getX(), 2);
		return Math.sqrt(dist);
	}

	public void move(int dX, int dY) {
		if (dX < 0 || dY < 0) {
			return;
		} else {
			this.setX(dX);
			this.setY(dY);
		}
	}

	public String toString() {
		return "(" + getX() + "," + getY() + ")";
	}
}
