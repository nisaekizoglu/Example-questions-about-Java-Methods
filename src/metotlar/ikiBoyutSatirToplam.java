package metotlar;

//kendisine parametre olarak gelen 2 boyutlu tam sayı dizisinin satırlarını toplayıp geri döndüren metod
public class ikiBoyutSatirToplam {
	public static void main(String[] args) {
		int sayi[][] = { { 1, 4 }, { 87, 45 } };
		int satirToplam[] = satir(sayi);
		for (int i = 0; i < satirToplam.length; i++) {
			System.out.println("Satır " + (i + 1) + " toplam: " + satirToplam[i]);
		}
	}

	public static int[] satir(int sayi[][]) {
		int toplam = 0;
		int[] satirToplam = new int[sayi.length];
		for (int i = 0; i < sayi.length; i++) {	
			for (int j = 0; j < sayi[i].length; j++) {
				toplam += sayi[i][j];

			}
			satirToplam[i] = toplam;
		}
		return satirToplam;

	}

}
