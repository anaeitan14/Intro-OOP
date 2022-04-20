package point;

public class SegmentTest {

	public static void main(String[] args) {
		Segment copy = new Segment(2,2,6,6);
		Segment seg = new Segment(copy);
		System.out.println(copy.toString());
		System.out.println(seg.toString());
		System.out.println(copy.overLap(seg));
	}
	
}
