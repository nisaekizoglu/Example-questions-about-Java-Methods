package metotlar;

//kendisine parametre olarak gelen stringteki "aa" stringinden kac tane oldugunu geri döndüren metot
public class aa {
	public static void main(String[] args) {
		String a = "nisaaaaardaasaavaasebru";
		System.out.println(kac_aa(a));
	}

	public static int kac_aa(String a) {
		int sayac = 0;
		int sayac1 = 0;
		for (int i = 0; i < a.length(); i++) {
			// String [] ch = new String [a.length()];
			if (a.charAt(i) == 'a') {
				sayac1++;
				if (sayac1 >= 3) {
					sayac1 = 0;
					sayac++;
				}
			}

		}
		return sayac;
	}
}
