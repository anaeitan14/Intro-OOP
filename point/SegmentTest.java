package point;

public class SegmentTest {

	public static void main(String[] args) {
		Segment seg = new Segment(5,3,10,3);
		Segment copy = new Segment(seg);
		System.out.println(seg.toString());
		System.out.println(copy.toString());
		System.out.println(seg.overLap(copy));
		
		
		

	}
	
	
	
	
	
	

}
