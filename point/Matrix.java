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
				if (i == 0 && j == 0) {
					copy.mat[i][j] = topLeftCorner(mat, i, j);
				} else if (i == 0 && j == mat[0].length - 1) {
					copy.mat[i][j] = topRightCorner(mat, i, j);
				} else if (i == mat.length - 1 && j == 0) {
					copy.mat[i][j] = bottomLeftCorner(mat, i, j);
				} else if (i == mat.length - 1 && j == mat[0].length - 1) {
					copy.mat[i][j] = bottomRightCorner(mat, i, j);
				} else if (i == 0 && (j != 0 || j != mat[0].length - 1)) {
					copy.mat[i][j] = averageSixTop(mat, i, j);
				} else if (i == mat.length - 1 && (j != 0 || j != mat[0].length - 1)) {
					copy.mat[i][j] = averageSixDown(mat, i, j);
				} else if ((i != 0 || i != mat.length - 1) && j == 0) {
					copy.mat[i][j] = fiveAverageLeft(mat, i, j);
				} else if ((i != 0 || i != mat.length - 1) && (j == mat[0].length - 1)) {
					copy.mat[i][j] = fiveAverageRight(mat, i, j);
				} else {           
					copy.mat[i][j] = averageNine(mat, i, j);
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

	public static int fiveAverageLeft(int[][] matrice, int i, int j) {
		return (matrice[i][j] + matrice[i - 1][j] + matrice[i + 1][j] + matrice[i][j + 1] + matrice[i + 1][j + 1]
				+ matrice[i - 1][j + 1]) / 6;
	}

	public static int fiveAverageRight(int[][] matrice, int i, int j) {
		return (matrice[i][j] + matrice[i - 1][j] + matrice[i + 1][j] + matrice[i][j - 1] + matrice[i + 1][j - 1]
				+ matrice[i - 1][j - 1]) / 6;
	}

}