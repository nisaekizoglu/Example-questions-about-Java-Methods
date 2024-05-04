package metotlar;

public class dizide_a_ile_baslayan_kelimeler {
	//kendisine parametre olarak gelen string dizisinde 'a' ile başlayan kelimeleri bulan metodu yazınız.
	
	public static void main(String[] args) {
		String str3[] = { "nisa", "arda", "savaş", "ebru" };
		kucuk_a(str3);
		
	}

	public static void kucuk_a(String str3[]) {
		for (int i = 0; i < str3.length; i++) {
			if (str3[i].charAt(0) == 'a') {
				System.out.println(str3[i]);
			}
			
		}

	}
}
