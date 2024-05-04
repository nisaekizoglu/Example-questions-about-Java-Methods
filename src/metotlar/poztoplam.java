package metotlar;

public class poztoplam {
	public static void main(String[] args) {
		int sayi = 5;
		int x = pozitifToplam(sayi);
		System.out.println("Sayinin kendisine kadarki pozitif sayilarin toplami: " + x);
	}

	public static int pozitifToplam(int a) {
		int c = 0;
		for (int i = 0; i <= a; i++) {
			if (a < 0) {
				a = -a;
				c += i;

			} else {
				c += i;
			}
		}
		return c;

	}
}