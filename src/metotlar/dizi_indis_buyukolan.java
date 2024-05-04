package metotlar;

public class dizi_indis_buyukolan {
	public static void main(String[] args) {
		int a []= {1,2,3,-9};
		System.out.println("en kucuk sayının indisi: " +(indisBuyuk(a)));
	}
	public static int indisBuyuk(int []b) {
		int indis = 0;
		int max[]= new int [1];
		max[0] = b[0];
		for (int i = 0; i < b.length; i++) {
			if(max[0] > b[i]) {
				max[0] = b[i];
				indis = i;
			}
		}
		return indis;
	}

}
