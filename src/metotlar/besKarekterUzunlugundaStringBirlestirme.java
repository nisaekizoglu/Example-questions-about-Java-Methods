package metotlar;

import java.util.Scanner;

public class besKarekterUzunlugundaStringBirlestirme {
	//klavyeden rastgele stringler giriliyor. Karakter uzunluğu 5 olanları birleştirip geri döndüren
	//metodu yazınız.(string uzunlugu 40 olunca program duracaktır.)
	public static void main(String[] args) {
		int toplam = 0;
		String birlestir = " ";
		birlestir = birlestir(toplam, birlestir);
		System.out.println("Birleştirilen string: " + birlestir);

	}

	public static String birlestir(int toplam, String birlestir) {

		Scanner k = new Scanner(System.in);
		System.out.println("Kac adet eleman gireceksiniz? ");
		int adet;
		adet = k.nextInt();

		for (int i = 0; i < adet; i++) {
			System.out.println("String giriniz :");
			String kelime = k.next();
			if (kelime.length() == 5) {
				toplam += kelime.length();
				birlestir += kelime;
				if (toplam >= 40) {
					break;
				}
			}
		}
		return (birlestir);

	}

}
