package metotlar;
//kendisine parametre olarak gelen iki boyutlu string dizisindeki en uzun stringi döndüren metod
public class ikiEnuzunString {
	public static void main(String[] args) {
	String kelime [][]= {{"nisa","arda"},{"savas","ebru"}};
	String uzun = kelime[0][0];
	System.out.println("En uzun string: " +(enUzun(kelime,uzun)));
	}
	public static String enUzun(String kelime [][], String uzun) {
		for(int i = 0; i < kelime.length; i++) {
			for (int j = 0; j < 2; j++) {
				if(uzun.length() < kelime[i][j].length()) {
					uzun = kelime [i][j];
				}
			}
		}
		return uzun;
	}
}
