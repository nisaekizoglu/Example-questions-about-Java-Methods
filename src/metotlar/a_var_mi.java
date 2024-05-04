package metotlar;

public class a_var_mi {
	public static void main(String[] args) {
		String str = "nisa";
		if (a(str)) {
			System.out.println("'a' karakteri vardır.");
		} else {
			System.out.println("'a' karakteri yoktur.");
		}

	}

	public static boolean a(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a') {
				return true;
			}
		}

		return false;
	}

}
