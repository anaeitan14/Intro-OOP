package point;

public class Segment {
	private Point1 _poLeft;
	private Point1 _poRight;

	public Segment(Point1 left, Point1 right) {
		_poLeft = left;
		if (right.getY() != left.getY()) {
			right.setY(left.getY());
			_poRight = right;
		} else {
			_poRight = right;
		}
	}

	public Segment(int leftX, int leftY, int rightX, int rightY) {
		Point1 left = new Point1(leftX, leftY);
		Point1 right = new Point1(rightX, rightY);
		_poLeft = left;
		if (right.getY() != left.getY()) {
			right.setY(left.getY());
			_poRight = right;
		} else {
			_poRight = right;
		}
	}

	public Segment(Segment other) {
		this(other._poLeft, other._poRight);
	}

	public Point1 getPoLeft() {
		return _poLeft;
	}

	public Point1 getPoRight() {
		return _poRight;
	}

	public String toString() {
		return _poLeft.toString() + "---" + _poRight.toString();
	}

	public boolean equals(Segment other) {
		if (this.getPoLeft() == other.getPoLeft() && other.getPoRight() == other.getPoRight()) {
			return true;
		}
		return false;
	}

	public boolean isAbove(Segment other) {
		if (this.getPoLeft().getY() > other.getPoLeft().getY()) {
			return true;
		}
		return false;
	}

	public boolean isUnder(Segment other) {
		if (other.isAbove(this)) {
			return true;
		}
		return false;
	}

	public boolean isLeft(Segment other) {
		if (this.getPoRight().getX() < other.getPoLeft().getX()) {
			return true;
		}
		return false;
	}

	public boolean isRight(Segment other) {
		if (this.getPoLeft().getX() > other.getPoRight().getX()) {
			return true;
		}
		return false;
	}

	public void moveHorizontal(int delta) {
		this._poLeft.setX(this._poLeft.getX() + delta);
		this._poRight.setX(this._poRight.getX() + delta);
	}

	public void moveVertical(int delta) {
		this._poLeft.setY(this.getPoLeft().getY() + delta);
		this._poRight.setY(this.getPoRight().getY() + delta);
	}

	public void changeSize(int delta) {
		if (this.getPoRight().getX() + delta < this.getPoLeft().getX()) {
			return;
		}
		this.getPoRight().setX(this.getPoRight().getX() + delta);

	}

	public boolean pointOnSegment(Point1 p) {
		if ((p.getX() >= this.getPoLeft().getX()) && (p.getX() <= this.getPoRight().getX())
				&& p.getY() == this._poLeft.getY()) {
			return true;
		}
		return false;
	}

	public boolean isBigger(Segment other) {
		if (this._poLeft.distance(this._poRight) > other._poLeft.distance(other._poRight)) {
			return true;
		}
		return false;
	}

	public int overLap(Segment other) {
		return 0;
	}

	public double trapezePerimeter(Segment other) {
		return 0.0;
	}
}
