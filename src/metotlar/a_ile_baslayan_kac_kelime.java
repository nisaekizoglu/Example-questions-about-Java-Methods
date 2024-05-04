package metotlar;

public class a_ile_baslayan_kac_kelime {
	//kendisisne parametre olarak gelen string dizisindeki elemanların kaç tanesi 'a' ile başlıyor bulup

	//geri döndüren metodu yazınız.

	public static int kucukharf(String str4[]) {
		int sayac = 0;
		for (int i = 0; i < str4.length; i++) {
			if (str4[i].charAt(0) == 'a') {
				sayac++;
			}
		}
		System.out.println("Kucuk a ile baslayan eleman sayisi: " + sayac);
		return sayac;

	}

	public static void main(String[] args) {
		String str4[] = { "nisa", "arda", "savas", "ebru" };
		kucukharf(str4);

	}
}
