package metotlar;

public class diziArtir {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		a = artir(a);
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
}

	public static int[] artir(int[] b) {
		for (int i = 0; i < b.length; i++) {
			b[i] = b[i] + 1;
		}

		return b;
	}
}
