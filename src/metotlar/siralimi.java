package metotlar;
//kendisine parametre olarak gelen tam sayı dizisinin sıralı olup olmadığını geri döndüren metot(küçükten büyüğe)
public class siralimi {
	public static void main(String[] args) {
		int []a = {5,4,3,2,1,0};
		if(siralama(a)) {
			System.out.println("Siralidir.");
		}else {
			System.out.println("Sirali degildir.");
	}
	}

	public static boolean siralama(int []b) {
		for(int i = 1; i < b.length; i++) {
			if(b[i] < b[i-1]) {
				return false;
			}
		}
		return true;
	}

}
