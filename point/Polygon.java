package point;

public class Polygon {

	private Point1[] _vertices;
	private int _noOfVertices;
	private final int MAX_VERTICES = 10;

	public Polygon() {
		_vertices = new Point1[MAX_VERTICES];
		_noOfVertices = 0;
	}

	public boolean addVertice(int x, int y) {
		Point1 newPoint = new Point1(x, y);
		if (_noOfVertices < _vertices.length) {
			_vertices[_noOfVertices++] = newPoint;
			return true;
		} else {
			return false;
		}
	}

	public Point1 highestVertix() {
		Point1 highestVertix = null;
		int highestVertixY = 0;

		if (_noOfVertices == 0) {
			return null;
		}
		for (int i = 0; i < _noOfVertices; i++) {
			if (_vertices[i].getY() > highestVertixY) {
				highestVertixY = _vertices[i].getY();
				highestVertix = _vertices[i];
			}
		}
		return new Point1(highestVertix);
	}

	public String toString() {
		String vertices = "The polygon has " + _noOfVertices + ":\n" + "(";
		if (_noOfVertices == 0) {
			return "The polygon has 0 vertices";
		}
		for (int i = 0; i < _noOfVertices; i++) {
			vertices += _vertices[i].toString();
			if (i != _noOfVertices - 1) {
				vertices += ",";
			}
		}
		vertices += ")";
		return vertices;
	}

	public double calcPerimeter() {
		double peri = 0.0;
		if (_noOfVertices == 0 || _noOfVertices == 1) {
			return 0;
		} else if (_noOfVertices == 2) {
			return _vertices[0].distance(_vertices[1]);
		} else {
			for (int i = 0; i < _noOfVertices - 1; i++) {
				peri += _vertices[i].distance(_vertices[i + 1]);
			}
		}
		return peri;
	}

	public double calcArea() {
		if (_noOfVertices < 3) {
			return 0;
		}
		double sum = 0.0;
		for (int i = 0; i < _noOfVertices - 2; i++) {
			sum += calcTriangle(_vertices[0], _vertices[i + 1], _vertices[i + 2]);
		}
		return sum;
	}

	private double calcTriangle(Point1 line1, Point1 line2, Point1 line3) {
		double s = line1.distance(line2) + line2.distance(line3) + line3.distance(line1);
		double a = line1.distance(line2);
		double b = line2.distance(line3);
		double c = line3.distance(line1);
		s /= 2;
		double periTriangle = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		return periTriangle;
	}

	public boolean isBigger(Polygon other) {
		if (this.calcArea() > other.calcArea()) {
			return true;
		}
		return false;
	}

	public int findVertex(Point1 p) {
		for (int i = 0; i < _noOfVertices; i++) {
			if (_vertices[i].equals(p)) {
				return i;
			}
		}

		return -1;
	}

	public Point1 getNextVertex(Point1 p) {
		for (int i = 0; i < _noOfVertices; i++) {
			if (_vertices[i].equals(p) && i == _noOfVertices - 1) {
				return new Point1(_vertices[0]);
			} else if (_vertices[i].equals(p) && _noOfVertices == 0) {
				return new Point1(p);
			} else if (_vertices[i].equals(p)) {
				return new Point1(_vertices[i + 1]);
			}
		}
		return null;
	}

	public Polygon getBoundingBox() {
		if (_noOfVertices < 3) {
			return null;
		}

		Polygon poli = new Polygon();
		int height = 0, left = _vertices[0].getX(), right = _vertices[0].getX(), lowest = _vertices[0].getX();
		for (int i = 0; i < _noOfVertices; i++) {
			if (_vertices[i].getY() > height) {
				height = _vertices[i].getY();
			}
			if (_vertices[i].getX() > right) {
				right = _vertices[i].getX();
			}
			if (_vertices[i].getX() < left) {
				left = _vertices[i].getX();
			}
			if (_vertices[i].getY() < lowest) {
				lowest = _vertices[i].getY();
			}
		}
		poli.addVertice(left, 0);
		poli.addVertice(left, height);
		poli.addVertice(right, height);
		poli.addVertice(right, 0);

		return poli;

	}
}