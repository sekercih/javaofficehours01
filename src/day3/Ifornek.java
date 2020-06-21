package day3;

import java.util.Scanner;

public class Ifornek {

	public static void main(String[] args) {
		
		// Kullacıdan yaşını ve kilosunu alalın.
				//18 yaşından küçük ise kan bağıyapamasın.
				//18 yaşından büyük ve 50 kilodan zayıf ise kan bağışı yapamasın
				// 18 yaşından büyük ve 50 kilo da fazla ise kan bağışı yapabilsin.
		Scanner scan = new Scanner(System.in);
		System.out.println("Yasinizi  giriniz");
		int yas = scan.nextInt();
		System.out.println("Kilonuzu  giriniz");
		int kilo = scan.nextInt();
//		
//		if(yas<18) {
//			System.out.println("Kan bagisi yapamazsiniz");
//		}else if(yas>=18 && kilo<50) {
//			System.out.println("Kan bagisi yapamazsiniz");
//		}else if(yas>=18 && kilo>=50) {
//			System.out.println("Kan bagisi yapabilirsiniz");
		
		String result= (yas>=18 ? kilo>=50 ? "Kan verebilirsiniz." :"50 kilodan zayıflar kan veremez." :"18 yaşından küçükler kan veremez.");
		System.out.println(result);
		
		
		
		
	}
	}


