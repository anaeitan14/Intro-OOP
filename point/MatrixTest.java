package point;

public class MatrixTest {

	public static void main(String[] args) {

		int[][] mat = { { 19},{129 } };
		Matrix sec = new Matrix(mat);
		System.out.println(sec.toString());
		System.out.println("----------------------");
		Matrix neg = sec.makeNegative();
		System.out.println(neg.toString());
		System.out.println("----------------------");
		System.out.println(sec.toString());
		System.out.println("----------------------");
		Matrix HD = sec.imageFilterAverage();
		System.out.println(HD.toString());
	}

}
