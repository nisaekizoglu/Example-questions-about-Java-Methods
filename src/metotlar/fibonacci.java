package metotlar;

public class fibonacci {
	public static void main(String[] args) {
		int x = Fibonacci(6);
		System.out.println(x);
	}
	public static int Fibonacci(int a) {
		int d = 1;
		int b = 1;
		int c = 1;
		for(int i = 3; i <= a; i++) {
			d = b+c;
			b = c;
			c = d;
		}
		return d;
	}
	
}
