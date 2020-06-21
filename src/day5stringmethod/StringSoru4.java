package day5stringmethod;

import java.util.Scanner;

public class StringSoru4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen son harfi silinecek kelime giriniz");
		String str=scan.nextLine();
		String sonsil=str.substring(0, str.length()-1);
		System.out.println(sonsil);
		scan.close();
	}

}
