package metotlar;

//kendisine parametre olarak gelen 3*3 lük A ve B matrislerinin toplamını geri döndüren metod.
public class matris {
	public static void main(String[] args) {
		int A[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int B[][] = { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };
		int C[][] = new int[3][3];
		C = matrisToplam(A,B);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(C[i][j]);
			}
		}
	}

	public static int[][] matrisToplam(int A[][], int B[][]) {
		int C[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				C[i][j] = A[i][j] + B[i][j];

			}
		}
		return C;
	}

}
