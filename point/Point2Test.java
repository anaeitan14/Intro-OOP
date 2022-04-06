package point;

public class Point2Test {

	public static void main(String[] args) {
		Point2 myX = new Point2(32,421);
		
		System.out.println(myX.toString());
		myX.setX(123);
		myX.setY(4213);
		System.out.println(myX.toString());
	}

}
