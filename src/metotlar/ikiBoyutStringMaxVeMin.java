package metotlar;

import metotlar.ikiBoyutStringMaxVeMin;

public class ikiBoyutStringMaxVeMin {
	public static void main(String[] args) {
		String a[][] = { { "nisa", "nigde" }, { "elazig", "arda" } };
		ikiBoyutStringMaxVeMin n = new ikiBoyutStringMaxVeMin ();
		n.uzunVeKisa(a);
	}

	public int uzunVeKisa(String a[][]) {
		int max = a[0][0].length();
		int min = a[0][0].length();
		int indis = 0;
		int kelime = 0;
		int indis1 = 0;
		int kelime1 = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (max < a[i][j].length()) {
					max = a[i][j].length();
					indis = i;
					kelime = j;
					if (min > a[i][j].length()) {
						min = a[i][j].length();
						indis1 = i;
						kelime1 = i;
					}
				}
			}
		}
		System.out.println("En uzun karakter: " + a[indis][kelime] + " En kisa karakter: " + a[indis1][kelime1]);
		return (max + min);
		
	}

}
