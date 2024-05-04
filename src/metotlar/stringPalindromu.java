package metotlar;

public class stringPalindromu {
	public static void main(String[] args) {
		String str = "nisink";
		if (Palindrom(str)) {
			System.out.println("String palindromdur.");
		}else {
			System.out.println("String palindrom degildir.");
		}
	}
	public static boolean Palindrom(String str) {
		for (int i = 0; i < str.length()/2; i++) {
			
			if (str.charAt(i) == str.charAt(str.length()-1-i)) {
				return true;
			}
		}
		return false;
	}

}
