package metotlar;

public class kacBasamakli {
	public static void main(String[] args) {
		int x = basamak(123);
		System.out.println(x);
	}

	public static int basamak(int a) {
		int b = 0;
		while (a > 0) {
			a = a / 10;
			b++;
		}
		return b;
	}

}
