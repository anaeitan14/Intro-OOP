package point;

public class Matrix {
	private int[][] mat;

	public Matrix(int[][] array) {
		mat = new int[array.length][array[0].length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				mat[i][j] = array[i][j];
			}
		}
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
				copy.mat[i][j] = 255 - currentNum;
			}
		}
		return copy;

	}

	public Matrix imageFilterAverage() {
		Matrix copy = new Matrix(mat);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if ((i == 1 || i == mat.length - 2) && (j == 1 || j == mat[0].length - 2)) {
					int num = averageNine(mat, i, j);
					copy.mat[i][j] = num;
				} else if (i == 0 && (j == 1 || j == mat[0].length - 2)) {
					int num = averageSixTop(mat, i, j);
					copy.mat[i][j] = num;
				} else if (i == mat.length - 1 && (j == 1 || j == mat[0].length - 2)) {
					int num = averageSixDown(mat, i, j);
					copy.mat[i][j] = num;
				} else if (i == 0 && j == 0) {
					copy.mat[i][j] = topLeftCorner(mat, i, j);
				} else if (i == 0 && j == mat[0].length - 1) {
					copy.mat[i][j] = topRightCorner(mat, i, j);
				} else if (i == mat.length - 1 && j == 0) {
					copy.mat[i][j] = bottomLeftCorner(mat, i, j);
				} else if (i == mat.length - 1 && j == mat[0].length - 1) {
					copy.mat[i][j] = bottomRightCorner(mat, i, j);
				}

			}
		}
		return copy;

	}

	public static int averageNine(int[][] matrice, int i, int j) {
		return (matrice[i][j] + matrice[i + 1][j - 1] + matrice[i + 1][j] + matrice[i + 1][j + 1] + matrice[i][j - 1]
				+ matrice[i][j + 1] + matrice[i - 1][j - 1] + matrice[i - 1][j] + matrice[i - 1][j + 1]) / 9;
	}

	public static int averageSixTop(int[][] matrice, int i, int j) {
		return (matrice[i][j] + matrice[i][j - 1] + matrice[i][j + 1] + matrice[i + 1][j - 1] + matrice[i + 1][j]
				+ matrice[i + 1][j + 1]) / 6;
	}

	public static int averageSixDown(int[][] matrice, int i, int j) {
		return (matrice[i][j] + matrice[i - 1][j - 1] + matrice[i - 1][j] + matrice[i - 1][j + 1] + matrice[i][j - 1]
				+ matrice[i][j + 1]) / 6;
	}

	public static int topLeftCorner(int[][] matrice, int i, int j) {
		return (matrice[i][j] + matrice[i][j + 1] + matrice[i + 1][j] + matrice[i + 1][j + 1]) / 4;
	}

	public static int topRightCorner(int[][] matrice, int i, int j) {
		return (matrice[i][j] + matrice[i][j - 1] + matrice[i + 1][j - 1] + matrice[i + 1][j]) / 4;
	}

	public static int bottomLeftCorner(int[][] matrice, int i, int j) {
		return (matrice[i][j] + matrice[i - 1][j] + matrice[i - 1][j + 1] + matrice[i][j + 1]) / 4;
	}

	public static int bottomRightCorner(int[][] matrice, int i, int j) {
		return (matrice[i][j] + matrice[i - 1][j] + matrice[i - 1][j - 1] + matrice[i][j - 1]) / 4;
	}

}