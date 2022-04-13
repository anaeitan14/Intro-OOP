package point;

public class SegmentTest {

	public static void main(String[] args) {
		Point1 me = new Point1(5,10);
		Point1 you = new Point1(1,9);
		Point1 not = new Point1(3,9);
		Point1 m = new Point1(43, 12);
		
		Segment mySeg = new Segment(you, me);
		Segment otherSeg = new Segment(not, m);
		System.out.println(mySeg.toString());
		System.out.println(otherSeg.toString());
		System.out.println(otherSeg.isBigger(mySeg));
		
		
		//(12,43)---(11,43)
		

	}
	
	
	
	
	
	

}
