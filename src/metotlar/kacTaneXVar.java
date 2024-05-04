package metotlar;

public class kacTaneXVar {
	//kaç tane x olduğunu yazdıran methodun kodunu yazınız. 

	public static void main(String[] args) {
		kactane("bilgixxxsayxarx");
	}

	public static void kactane(String str) {
		int sayac = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'x') {
				sayac++;

			}

		}
		System.out.println(sayac);
	}

}
