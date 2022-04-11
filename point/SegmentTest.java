package point;

public class SegmentTest {

	public static void main(String[] args) {
		Point1 me = new Point1(5,10);
		Point1 you = new Point1(5,9);
		
		Segment myOtherSegment = new Segment(12, 12, 11, 766);
		System.out.println(you.isUnder(me));
		
		//(12,43)---(11,43)
		

	}
	
	
	
	
	
	

}
