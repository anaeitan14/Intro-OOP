package rectangle;

public class Rectangle {
	private int length;
	private int width;

	public Rectangle() {
		this.length = 10;
		this.width = 10;
	}

	public Rectangle(int length, int width) {
		setLength(length);
		setWidth(width);
	}

	public Rectangle(Rectangle other) {
		this(other.length, other.width);
	}

	public void setLength(int length) {
		if (length >= 0) {
			this.length = length;
		}
	}

	public void setWidth(int width) {
		if (width >= 0) {
			this.width = width;
		}
	}

	public int getLength() {
		return this.length;
	}

	public int getWidth() {
		return this.width;
	}

	public int getPerimeter() {
		return length * 2 + width * 2;
	}

	public int getArea() {
		return width * length;
	}

	public void show() {
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {
				if (j == 0 || j == width - 1 || i == 0 || i == length - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void show(char character) {
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {
				if (j == 0 || j == width - 1 || i == 0 || i == length - 1) {
					System.out.print(character);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}


}
