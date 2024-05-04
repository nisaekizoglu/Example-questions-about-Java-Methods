package metotlar;
//kendisine parametre olarak gelen string dizisindeki en uzun stringi bulup indisini geri döndüren metot
public class stringEnUzunun_indisi {
	public static void main(String[] args) {
		String str [] = {"nisffga","arda","savas","ebru"};
		System.out.println(enUzun(str,0));
		
	}
	public static int enUzun (String s [],int indis) {
		for (int i = 0; i < s.length-1; i++) {
			if(s[0].length() < s[i].length()) {
				s[0] = s[i];
				indis = i;
			}
		}
		return indis;
	}

}
