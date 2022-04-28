package point;

public class Matrix {
	private int[][] mat;

	public Matrix(int[][] array) {
		mat = new int[array.length][array[0].length];
	}

	public Matrix(int size1, int size2) {
		mat = new int[size1][size2];
	}

	public String toString() {
		String res = "";
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				res += mat[i][j];
				if (j != mat[0].length - 1) {
					res += "\t";
				}
			}
			res += "\n";
		}
		return res;
	}

	public Matrix makeNegative() {
		Matrix copy = new Matrix(mat);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				int currentNum = mat[i][j];
				mat[i][j] = 255 - currentNum;
			}
		}
		return copy;

	}

	public Matrix imageFilterAverage() {
		Matrix copy = new Matrix(mat);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (j == 0 && i == 0 || i == 0 && j == mat[0].length - 1) {

				} else if (i == mat.length - 1 && j == 0 || i == mat.length - 1 && j == mat[0].length - 1) {

				} else if (i == 0 || i == mat.length - 1) {

				} else {

				}
			}
		}
		return copy;
	}
}