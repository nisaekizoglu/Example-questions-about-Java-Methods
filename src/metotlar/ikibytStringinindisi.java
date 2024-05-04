package metotlar;
//kendisine parametre olarak gelen 2 boyutlu string dizisi içinde en uzun karaktere sahip olan stringi ve yerini
//(satır,sütün) geri döndüren metod.
public class ikibytStringinindisi {
	public static void main(String[] args) {
		String kelime [][]= {{"nisa","arda"},{"savas","ebru"}};
		System.out.println(uzun(kelime));

}
	public static String uzun(String kelime [][]){
		String yeni = "";
		int satir = 0;
		int sutun = 0;
		for(int i = 0; i < kelime.length; i++) {
			for(int j = 0; j < 2; j++) {
				if(yeni.length() < kelime[i][j].length()) {
					yeni = kelime[i][j];
					satir = i;
					sutun = j;
				
				}
				
			}
		}
		return yeni+" " +satir+ " "+ sutun;
	}
}