package metotlar;

//10 elemanlı iki tam sayı dizisinin toplamını geri döndüren metod
public class ikiTamSayiDiziTpl {
	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int B[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int C[] = new int[10];
		for (int i = 0; i < 10; i++) {
			C = ikiDizi(A, B);
			System.out.println(C[i]);
		}
	}

	public static int[] ikiDizi(int A[], int B[]) {
		int C[] = new int[10];
		for (int i = 0; i < 10; i++) {
			C[i] = A[i] + B[i];
		}

		return C;
	}
}
