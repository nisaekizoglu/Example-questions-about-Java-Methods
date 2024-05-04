package metotlar;
//kendisine parametre olarak gelen 2 boyutlu tam sayı dizisindeki en büyük sayıyı geri döndüren metod.
public class ikiBoyutEnb {
	public static void main(String[] args) {
		
		int sayi [][] = {{1,4,6,880},{87,45,21,99}};
		int enb = sayi[0][0];
		System.out.println("En buyuk sayi: " +(sayilarinEnByk(sayi,enb)));
	}
	public static int sayilarinEnByk(int sayi [][],int enb) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				if(enb < sayi[i][j]) {
					enb = sayi[i][j];
				}
			}
		}
		return enb;
	}

}
