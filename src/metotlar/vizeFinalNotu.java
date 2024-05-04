package metotlar;

//vize final notlarının bulunduğu iki diziyi parametre olarak alıp öğrencilerin ortalamasını hesaplayıp geri döndüren
//metod
public class vizeFinalNotu {
	public static void main(String[] args) {
		double vize[] = { 12, 1, 2 };
		double finall[] = { 3, 1, 2 };
		
		System.out.println("Vize ve final notlarının ortalamasi: " + (ortalama(vize, finall)));
	}

	public static double ortalama(double vize[], double finall[]) {
		double ort = 0;
		double sonuc = 0;
		for (int i = 0; i < 3; i++) {
			ort = (vize[i] + finall[i]) / 2;

			sonuc = sonuc + ort;
		}
		return ort;
	}
}