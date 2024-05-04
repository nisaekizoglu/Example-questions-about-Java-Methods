package metotlar;

import java.util.Scanner;

public class girilen_en_buyuk_sayi {
	//klavyeden girilen sayılar içinde her zaman en büyüğü yazdıran, girilen sayı -9999 ise duran metodu yazınız.

	public static void main(String[] args) {
		enBuyuk();
	}

	public static void enBuyuk() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz: ");
		int sayi = scanner.nextInt();

		int max = sayi;
		for (;;) {
			System.out.println("En buyuk sayi:  " + max);
			sayi = scanner.nextInt();
			if (sayi == -9999) {
				System.out.println("Program sonlandırılıyor...");
				System.exit(0);
			}
			if (max < sayi) {
				max = sayi;

			}
		}
	}

}
