package metotlar;

public class matrisTopalm {
	public static void main(String[] args) {
		int[][] x = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] y = { { 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 1 } };
		int[][] z = new int[3][3];
		z = toplam(x, y);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(z[i][j]);
			}
		}
	}

	public static int[][] toplam(int[][] a, int[][] b) {
		int[][] c = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;

	}

}

