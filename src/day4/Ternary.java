package day4;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		// Kullanıdan alınacak sayının negatif pozitif yada notr olup olmadığını kontrol eden 
				// ternary yazalım.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("LUTFEN BIOR SAYI GIRINIZ");
		int num1=scan.nextInt();
		String result=num1<0?"negatif":num1>0?"Pozitif":"notur";
		//System.out.println( num1<0?"Negatif":"Pozitif");
		System.out.println(result);
	}

}
