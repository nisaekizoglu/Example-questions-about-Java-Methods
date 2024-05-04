package metotlar;
//parametre olarak verilen iki stringi birlestirip geri döndüren methodu yazınız. 

public class stringBirlestir {
	public static void main(String[] args) {
		String isim = "Nisa";
		String soyisim = "Ekizoglu";
		String str1 = birlestir(isim, soyisim);
		System.out.println(str1);

	}

	public static String birlestir(String isim, String soyisim) {
		return (isim + soyisim);
	}


}
