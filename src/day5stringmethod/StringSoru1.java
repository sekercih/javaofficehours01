package day5stringmethod;

import java.util.Scanner;

public class StringSoru1 {

	public static void main(String[] args) {
		
		// 1. Girilen String değeri tersten yazan Java kodunu yazınız
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen kelıme gırınız");
//		String str1=scan.nextLine();
//		
//		for(int i=str1.length()-1;i>=0;i--){
//			
//			System.out.print(str1.charAt(i));
//			Scanner scan=new Scanner(System.in);
//			System.out.println("Lütfen kelime giriniz.");
			String str =scan.nextLine();
			
			int countStr =str.length();
			
			while (countStr>0) {
				System.out.print(str.charAt(countStr-1));
				
				countStr--;
			
			
			
		}
		

	}}


