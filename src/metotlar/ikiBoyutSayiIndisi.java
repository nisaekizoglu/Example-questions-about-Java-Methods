package metotlar;
//kendisine parametre olarak gelen 2 boyutlu tam sayı dizisindeki en büyük sayının indisini geri döndüren metod.
public class ikiBoyutSayiIndisi {
	public static void main(String[] args) {
		int sayi [][] = {{1,4,6,880},{87,45,21,909}};
		int enb = sayi[0][0];
		int indis = 0;
		int satir = 0;
		System.out.println("En buyuk sayinin indisi: " +(sayilarinEnByk(sayi,enb,indis,satir)));
	}
	public static String sayilarinEnByk(int sayi [][],int enb,int indis,int satir) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				if(enb < sayi[i][j]) {
					enb = sayi[i][j];
					indis = i;
					satir = j;
				}
			}
		}
		return indis + "," +  satir;
	}

}

