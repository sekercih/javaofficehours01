package day5stringmethod;

import java.util.Scanner;

public class StringSoru5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("kullanicidan aldğiniz stringi büyk harfe cevirecek");
		String str =scan.nextLine().toUpperCase();
		System.out.println(str);
		scan.close();
	}

}
