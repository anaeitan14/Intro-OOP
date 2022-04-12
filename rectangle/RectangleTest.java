package rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle myRec = new Rectangle(3, 5);
		System.out.println(myRec.getPerimeter());
		System.out.println(myRec.getArea());
		myRec.show();
		myRec.show('+');

	}

}
