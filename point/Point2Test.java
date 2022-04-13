package point;

public class Point2Test {

	public static void main(String[] args) {
		Point2 myX = new Point2(12, 8);
		Point2 MyOther = new Point2(43, 12);

		System.out.println(myX.toString());
		System.out.println(MyOther.toString());
		System.out.println(myX.distance(MyOther));
		myX.move(6, 87);
		System.out.println(myX.toString());
		System.out.println(myX.distance(MyOther));
		System.out.println(MyOther.isUnder(myX));

	}
}
