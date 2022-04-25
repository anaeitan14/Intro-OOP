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
		String vertices = "The polygon has "+_noOfVertices+":\n"+"(";
		if (_noOfVertices == 0) {
			return "The polygon has 0 vertices";
		}
		for (int i = 0; i < _noOfVertices; i++) {
			vertices += _vertices[i].toString();
			vertices += ",";
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
	}
}
