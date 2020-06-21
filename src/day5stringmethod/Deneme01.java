package day5stringmethod;

import java.util.Scanner;

public class Deneme01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen ters yazılacak kelimeyi giriniz");
		String str=scan.nextLine();
		int uzunluk=str.length();
		
		while(uzunluk>0){
			System.out.print(str.charAt(uzunluk-1));
			uzunluk=uzunluk-1;
			
		}

	}

}
