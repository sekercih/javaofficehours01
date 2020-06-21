package day5stringmethod;

import java.util.Scanner;

public class Deneme04 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen son harfi silinecek kelime giriniz");
		String str=scan.nextLine();
		String str1=str.substring(0, str.length()-1);
		System.out.println(str1);
		

	}

}
