package metotlar;

//kendisine parametre olarak gelen stringteki küçük karakterleri geri döndüren metot
public class kucukKarakter {
	public static void main(String[] args) {
		String a = "Nİsa";
		String str1 = kucuk(a);
		System.out.println(str1);

	}

	public static String kucuk(String str) {
		String s1 = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) <= 'z' && str.charAt(i) >= 'a') {
				s1 = s1 + str.charAt(i);

			}
		}
		return s1;

	}

}
