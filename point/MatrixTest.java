package point;

public class MatrixTest {

	public static void main(String[] args) {
		Matrix myObj = new Matrix(5, 3);
		System.out.println(myObj.toString());
		Matrix copy = myObj.makeNegative();
		System.out.println();
		System.out.println(copy.toString());

	}

}
