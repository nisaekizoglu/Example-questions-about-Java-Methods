package metotlar;

//kendisine parametre olarak gelen tam sayının asal olup olmadığını kontrol edip döndüren metod
public class asalmi {
	public static void main(String[] args) {
		int a = 10;
		if (asal(a)) {
			System.out.println("Sayi asal");
		} else {
			System.out.println("Sayi asal degil.");
		}
	}

	public static boolean asal(int a) {
		if (a <= 1) {
			return false;
		}
		for (int i = 2; i < (a / 2); i++) {
			if ((a % i) == 0) {
				return false;
			}
		}
		return true;

	}

}
