package point;

public class Point1 {
	private int _x;
	private int _y;

	public Point1(int x, int y) {
		if (x >= 0) {
			this._x = x;
		} else {
			this._x = 0;
		}
		if (y >= 0) {
			this._y = y;
		} else {
			this._y = 0;
		}
	}

	public Point1(Point1 other) {
		this(other._x, other._y);
	}

	public int getX() {
		return this._x;
	}

	public int getY() {
		return this._y;
	}

	public void setX(int num) {
		if (num < 0) {
			return;
		}
		this._x = num;
	}

	public void setY(int num) {
		if (num < 0) {
			return;
		}
		this._y = num;
	}

	public String toString() {
		return "(" + _x + "," + _y + ")";
	}

	public boolean equals(Point1 other) {
		if (this._x == other._x && this._y == other._y) {
			return true;
		}
		return false;
	}

	public boolean isAbove(Point1 other) {
		if (this._y > other._y) {
			return true;
		}
		return false;
	}

	public boolean isUnder(Point1 other) {
		if (other.isAbove(this)) {
			return true;
		}
		return false;
	}

	public boolean isLeft(Point1 other) {
		if (this._x > other._x) {
			return false;
		}
		return true;
	}

	public boolean isRight(Point1 other) {
		if (other.isLeft(this)) {
			return true;
		}
		return false;
	}

	public double distance(Point1 p) {
		double res = Math.pow((p._y - this._y), 2) + Math.pow((p._x - this._x), 2);
		return Math.sqrt(res);
	}

	public void move(int dx, int dy) {
		if (dx < 0 || dy < 0) {
			return;
		} else {
			this._x = dx;
			this._y = dy;
		}
	}

}
