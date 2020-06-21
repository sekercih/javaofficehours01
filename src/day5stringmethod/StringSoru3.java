package day5stringmethod;

import java.util.Scanner;

public class StringSoru3 {

	public static void main(String[] args) {
		//stringi bulan java kodu aranacak kelimeyi bulun
		
	
		//3. Kullanıcıdan alınan String kümesi içerisinde aranan  
		//	String i bulan Java Kodunu yazınız. 
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Lütfen cümle giriniz");
			String str =sc.nextLine();
			System.out.println("aranavak kelime giriniz");
			String strbul = sc.nextLine();
			
			System.out.println(str.contains(strbul));
		
	}

}
