package metotlar;

public class toplam {
	public static void main(String[] args) {
		int a []= {1,2,3,4,5};
		System.out.println(toplama(a));
		
	}
	public static int toplama(int []b) {
		int top = 0;
		for(int i = 0; i <= b.length - 1; i++) {
			top += b[i];
		}
		return top;
	}

}
