package day6stringvemethod;

import java.util.Scanner;

public class StringKarsilastirma {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen karşılaştırılacak 1. kelıme");
		String str=scan.nextLine();
		System.out.println("lutfen  karşılaştırılacak 2. kelıme");
		String str1=scan.nextLine();
		System.out.println(str.contentEquals(str1));

	}

}
