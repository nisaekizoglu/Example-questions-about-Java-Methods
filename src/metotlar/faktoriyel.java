package metotlar;

public class faktoriyel {
	public static void main(String[] args) {
		int sayi = 4;
		int x = Faktoriyel(sayi);
		System.out.println("sayinin faktoriyeli: " +x);
	}
	public static int Faktoriyel(int a) {
		int c = 1;
		for(int i = 1; i <= a; i++) {
			c *= i;
		}
		return c;
	}

}
