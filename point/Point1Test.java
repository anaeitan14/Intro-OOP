package point;

public class Point1Test {

	public static void main(String[] args) {
		Point1 myPoint = new Point1(53,12);
		Point1 yourPoint = new Point1(myPoint);
		
		
		myPoint.setY(19);
		System.out.println(myPoint.toString());
		System.out.println(yourPoint.toString());
		System.out.println(yourPoint.isUnder(myPoint));
		System.out.println(myPoint.distance(yourPoint));
		myPoint.move(15, 12);
		System.out.println(myPoint.toString());

	}

}
