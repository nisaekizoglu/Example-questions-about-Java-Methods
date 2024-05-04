package metotlar;

//kendisine parametre olarak gelen tam sayı dizisindeki en büyük ikinci sayıyı geri döndüren metod
public class enbBuyukIki {
	public static void main(String[] args) {
		int sayilar[] = { 1, 3, 4, 5, 8, 9 };
		int enb = 0;
		int enb2 = 0;
		System.out.println("En buyuk ikinci sayi: " + (enbuyukiki(sayilar, enb, enb2)));
	}

	public static int enbuyukiki(int sayilar[], int enb, int enb2) {
		for (int i = 0; i < sayilar.length; i++) {
			if (enb < sayilar[i]) {
				enb2 = enb;
				enb = sayilar[i];

			} else if (enb2 > sayilar[i]) {

				enb2 = sayilar[i];
			}
		}
		return enb2;
	}

}
