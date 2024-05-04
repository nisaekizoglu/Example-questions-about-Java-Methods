package metotlar;
//kendisine parametre olarak gelen tam sayı dizisindeki tek sayıların ortalamasını döndüren metod
public class teklerinOrtalamasi {
	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sayac = 0;
		int ortalama = 0;
		System.out.println("Tek sayilarin ortalamasi: "+ort(A,sayac,ortalama));
	}
	public static int ort(int A[],int sayac,int ortalama) {
		for(int i = 0; i < 10; i++) {
			if(A[i]%2 !=0) {
				sayac++;
				ortalama += A[i]/sayac;
			}
		}
		return ortalama;
	}

}
