package metotlar;

public class ikiBytSutunTop {
	public static void main(String[] args) {
		int sayi[][] = { { 1, 4 }, { 87, 45 } };
		int sutunTop[] = sutun(sayi);
		for (int i = 0; i < sutunTop.length; i++) {
			System.out.println("sutun" + (i + 1) + "toplam: " + sutunTop[i]);
		}

	}

	public static int[] sutun(int a[][]) {

		int s[] = new int[a.length];
		for (int i = 0; i < 2; i++) {
			int toplam = 0;
			for (int j = 0; j < 2; j++) {
				toplam += a[j][i];
			}
			s[i] += toplam;
		}
		return s;
	}
}
