package metotlar;
//dizinin toplamını geri döndüren metot
public class diziToplami {
	public static void main(String[] args) {
		int a []= {1,2,3,4,5};
		System.out.println(toplam(a));
	}
	public static int toplam(int a []) {
		int toplam =0;
		for(int i = 0; i < a.length; i++) {
			toplam = toplam + a[i];
		}
		return toplam;
	}

}
