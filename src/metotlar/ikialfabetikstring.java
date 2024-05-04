package metotlar;

//kendisine parametre olarak gelen iki strigten büyük olanı döndüren metot(alfabetik).
public class ikialfabetikstring {
	public static void main(String[] args) {
		String str = "nisa";
		String str1 = "şrda";
		System.out.println(buyuk(str, str1));

	}

	public static String buyuk(String str, String str1) {
		String max = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < str1.charAt(i)) {
				max = str1;
			} else {
				max = str;
			}

		}
		return max;
	}
}
