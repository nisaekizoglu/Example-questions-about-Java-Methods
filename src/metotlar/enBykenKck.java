package metotlar;

public class enBykenKck {
	public static void main(String[] args) {
		int sayilar[] = { 1, 3, 4, 5, 8, 9 };
		int sonuc[] = sayi(sayilar);
		System.out.println("En buyuk sayi: " +sonuc[0] + "En kucuk sayi: " +sonuc[1]);
	}

	public static int[] sayi(int sayilar[]) {
		int enb = 0;
		int enk = sayilar[0];
		for (int i = 0; i < sayilar.length; i++) {
			if (enb < sayilar[i]) {
				enb = sayilar[i];
			} else if (enk > sayilar[i]) {
				enk = sayilar[i];

			}

		}
		int[] sonuc = { enb, enk };
		return sonuc;
	}

}
