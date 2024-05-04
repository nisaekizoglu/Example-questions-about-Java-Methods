package metotlar;
//krndisine parametre olarak gelen iki tam sayının a üzeri bsini hesaplayan metot
//kendisine parametre olarak gelen n tam sayısı kadar adınızı ekrana yazan metot
//kendisine parametre olarak gelen poz. tam sayının kaç basamaklı olduğunu geri döndüren metot 
//n. fibonacci sayısını geri döndüren metot yazınız.
//kendisine parametre olarak gelen poz tam sayının faktöriyelini döndüren metot
//kendisine parametre olarak gelen poz tam sayıya kadarki tüm sayıları toplayıp geri döndüren metot 
//kendisine parametre olarak gelen iki tam sayıdan büyük olanı döndüren metot
//kendisine parametre olarak gelen stringteki küçük karakterlerin sayısını geri döndüren
//kendisine parametre olarak gelen stringteki küçük karakterleri
//kendisine parametre olarak gelen stringi ters cevirip geri döndüren metot
//kendisine parametre olarak gelen stringteki kucuk karakterleri buyuk yapıp döndüren 
//kendisine parametre olarak gelen strinteki küçük karakterleri büyük, büyükleri küçük yapan 
//kendisine parametre olarak gelen stringteki "aa" stringinden kac tane oldugunu geri döndüren metot
//kendisine parametre olarak gelen iki stringten büyük olanı geri döndüren metot(stringler aynı uzunlukta/sözlük)
//kendisine parametre olarak gelen stringteki kelime sayısını geri döndüren metot 
//dizinin toplamını geri döndüren metot
public class auzerib {
	public static void main(String[] args) {
		int x = us(3,2);
		System.out.println("a uzeri b: " +x);
	}
	public static int us(int a,int b) {
		int c =1;
		for(int i=1; i <=b; i++) {
			c = c*a;
		}
		return c;
	}

}
