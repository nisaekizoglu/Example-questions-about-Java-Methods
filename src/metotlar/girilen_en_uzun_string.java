package metotlar;

public class girilen_en_uzun_string {
	//kendisine parametre olarak gelen string dizisindeki en uzun karakteri bulup ekrana yazdıran metodu yazınız.

	public static void main(String[] args) {
		String str4 [] = { "nisa", "arda", "savas", "ebru" };
		uzunluk(str4);

}
	public static void uzunluk( String str4 []) {
		int max = str4[0].length();
		int indis = 0;
		for (int i = 1; i < str4.length; i++) {
			if(max < str4[i].length()) {
				max = str4[i].length();
				indis = i;
				
			}
		}
		System.out.println("En uzun string: "+ str4[indis]+ "  " + "Uzunlugu: " + max );
	}

}
