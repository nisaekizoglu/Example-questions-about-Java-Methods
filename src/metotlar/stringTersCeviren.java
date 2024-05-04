package metotlar;
//kendisine parametre olarak gelen stringi ters cevirip geri döndüren metot
public class stringTersCeviren {
	public static void main(String[] args) {
		//String str = "Nisa";
		//String str2 = ters(str);
		System.out.println(ters("Nisa"));
	}
	public static String ters(String a) {
		String str1= "";
		for(int i = a.length()-1; i >= 0; i--) {
				str1 = str1 + a.charAt(i);
			}
		return str1;
	}

}
