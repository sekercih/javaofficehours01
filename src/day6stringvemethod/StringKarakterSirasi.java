package day6stringvemethod;

import java.util.Scanner;

public class StringKarakterSirasi {

	public static void main(String[] args) {
		//Girilen String değer içindeki istenen indexdeki karakteri bulan
		//java kodu.
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen kelime gırınız");
		String str=scan.nextLine();
		System.out.println("kacınca indexi yazılsın");
		int index=scan.nextInt();
		System.out.println(str.charAt(index));
		

	}

}
