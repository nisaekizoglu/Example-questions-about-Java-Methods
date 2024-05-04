package metotlar;
//en küçük elemanın indisini döndüren metot
public class enkucuksayi {
	public static void main(String[] args) {
		int a []= {1,2,3,4,5};
		System.out.println(enkucuk(a));
	}
	public static int enkucuk(int []a ) {
		int enk = a[0];
		int indis =0;
		for(int i = 1; i < a.length; i++) {
			if(enk > a[i]) {
				enk = a[i];
				indis=i;
			}
		}
		return indis;
	}

}
