package day4;

import java.util.Scanner;

public class Ternary2 {

	public static void main(String[] args) {
		// Kullanıcıdan bir harf isteyelim ve bunun büyük harf küçük harf yada hatalı gişir.
				// olmadurumunu ternary ile kontrol edelim.
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bır karakter gırın");
		char ch=scan.next().charAt(0);
		
	
		String result=ch>='a'&&ch<='z'?"kucuk harf":ch >='A'&&ch<='Z'?"buyuk harf":"hatalı giriş";
		System.out.println(result);
		
		

	}

}
