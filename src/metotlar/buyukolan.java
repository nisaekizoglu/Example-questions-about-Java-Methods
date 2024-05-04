package metotlar;

public class buyukolan {
	public static void main(String[] args) {
		int a = 1;
		int b = -4;
		int y = buyukSayi(a, b);
		System.out.println("Buyuk olan sayi: " + y);

	}

	public static int buyukSayi(int sayi1, int sayi2) {
		int max = sayi1;
		if (sayi1 > sayi2) {
			max = sayi1;
		} else {
			max = sayi2;
		}
		return max;
	}
}
