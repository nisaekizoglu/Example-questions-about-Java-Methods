package metotlar;
//kendisine parametre olarak gelen strinteki küçük karakterleri büyük, büyükleri küçük yapan 
public class buyukleriKucuk {
	public static void main(String[] args) {
		String str = "EKizogLu";
		String b = name(str);
		System.out.println(b);
		//System.out.println(name(str)); //daha basit şekli 
	}
	public static String name(String str) {
		String string = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch <= 'z' && ch >= 'a' ) {
				string = string + (char)(ch - 32);
				
			}
			if (ch <= 'Z' && ch >= 'A') {
				string = string + (char)(ch + 32);
			}
		}
		return string;
	}

}
