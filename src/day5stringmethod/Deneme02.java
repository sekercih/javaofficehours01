package day5stringmethod;

import java.util.Scanner;

public class Deneme02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen cümle giriniz");
		String str =sc.nextLine();
		System.out.println("aranavak kelime giriniz");
		String strbul = sc.nextLine();
		boolean bul=str.contains(strbul);
		
		System.out.println(bul);
	}

}
