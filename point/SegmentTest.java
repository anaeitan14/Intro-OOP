package point;

public class SegmentTest {

	public static void main(String[] args) {
		Point1 me = new Point1(10,10);
		Point1 you = new Point1(23,10);
		Point1 not = new Point1(20,10);
		Point1 m = new Point1(55, 12);
		
		Segment mySeg = new Segment(me, you);
		Segment otherSeg = new Segment(not, m);
		System.out.println(mySeg.toString());
		System.out.println(otherSeg.toString());
		System.out.println(mySeg.overLap(otherSeg));
		
		//(12,43)---(11,43)
		

	}
	
	
	
	
	
	

}
