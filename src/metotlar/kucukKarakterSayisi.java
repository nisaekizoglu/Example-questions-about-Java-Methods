package metotlar;

public class kucukKarakterSayisi {
	public static void main(String[] args) {
		String k = "nisa";
		int str = kucuk(k);
		System.out.println("kucuk karakter sayisi: " +str);
	}
	public static int kucuk(String a) {
		int sayac = 0;
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) <= 'z' && a.charAt(i) >= 'a') {
				sayac++;
			}
		}
		return sayac;
	}

}
