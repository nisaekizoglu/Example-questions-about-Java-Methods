package metotlar;

public class kelime_sayisi {
	public static void main(String[] args) {
		String str = "Nİsa  arda savas ebru   b  ekizoglu ";
		System.out.println(kac_adet(str));
	}
	public static int kac_adet(String str) {
		int sayac = 0;
		boolean kelimeSayisi = true;
		for (int i = 0; i< str.length(); i++) {
			if (str.charAt(i) == ' ' ) {
				kelimeSayisi = true;
				
			}else if (kelimeSayisi) {
				kelimeSayisi = false;
				sayac++;
			}
		}
		
		return sayac;
	}

}
