package metotlar;

import java.util.Scanner;

public class isim_soyisim_yazdirma {
	
	public static void main(String[] args) {
		int a = 0;
		String isim = null;
		isim_soyisim(a, isim);
	}

	public static void isim_soyisim(int a, String isim) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("İsmini ve soyisminizi kac kere yazdırmak istiyorsunuz?");
		a = scanner.nextInt();
		while (a < 0) {
			System.out.println("Lütfen pozitif bir deger giriniz!");
			System.out.println("İsminizi kac kere yazdırmak istiyorsunuz?");
			a = scanner.nextInt();
		}
		scanner.nextLine();
		System.out.print("İsim ve soyisminizi giriniz: ");
		isim = scanner.nextLine();
		for (int i = 0; i < a; i++) {
			System.out.println(isim);
		}

	}
}
