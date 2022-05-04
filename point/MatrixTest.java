package point;

public class MatrixTest {

	public static void main(String[] args) {
		
		int[][] mat = {{4,3,8},{123,64,43}};
		Matrix sec = new Matrix(mat);
		System.out.println("----------------------");
		System.out.println(sec.toString());
		System.out.println("----------------------");
		Matrix copy = sec.makeNegative();
		System.out.println("----------------------");
		System.out.println(copy.toString());
		Matrix HD = copy.imageFilterAverage();
		System.out.println(HD.toString());
	}

}
