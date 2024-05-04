package metotlar;

public class dizisiralama {
	public static void main(String[] args) {
		int[] x = { 7, 3, 1, -6, 4, 9, 16, 13, 8, 5 };
		int[] y = new int[2];
		y = bul(x);
		System.out.println(y[0] + " " + y[1]);
	}

	public static int[] bul(int[] a) {
		int enk = a[0];
		int ind = 0;
		for (int i = 1; i < a.length; i++) {
			if (enk > a[i]) {
				enk = a[i];
				ind = i;
			}
		}
		int[] yeni = new int[2];
		yeni[0] = enk;
		yeni[1] = ind;
		return yeni;
	}

}
