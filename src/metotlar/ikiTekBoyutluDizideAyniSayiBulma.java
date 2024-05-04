package metotlar;

public class ikiTekBoyutluDizideAyniSayiBulma {
	//Kendisine parametre olarak gelen iki tek boyutlu sayısal dizi içindeki yerleri aynı olan sayıları bulup 
	//yerleriyle birlikte ekrana yazan metodu yazınız.
	public static void main(String[] args) {
		int a [] = {1,3,4,5,6,9,0};
		int b [] = {1,2,5,7,6,8,0};
		ayniYer(a, b);
	}
	public static void ayniYer (int a [], int b[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) {
				System.out.println(a [i] + " " + i);
			}
		}
	}

}
