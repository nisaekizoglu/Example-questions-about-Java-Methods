package metotlar;

public class sayininRakamsalDegeriniBulma {
	//kendisine parametre olarak gelen sayının rakamsal degerlerini toplamını ekrana yazan metodu yazın
	//3-4 satır olacak şekilde 
	public static void main(String[] args) {
		int sayi = 123;
		sayisalDeger(sayi);
	}
	
	public static void sayisalDeger (int sayi) {
		
		int toplam = 0; 
		while (sayi != 0) {
			toplam += sayi%10;
			sayi /= 10;
		}
		System.out.println(toplam);
	}

}
