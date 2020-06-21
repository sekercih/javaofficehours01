package day5stringmethod;

import java.util.Scanner;

public class Deneme06 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen palidrom kelime giriniz");
		String str=scan.nextLine();
		
		String tersStr="";
		
	
		for(	int uzunluk=str.length()-1;uzunluk>=0;uzunluk--){
			tersStr=tersStr+str.charAt(uzunluk);
			
//		}if(tersStr.equals(str)){
//			System.out.println("true");
//		}else{
//			System.out.println("false");
			
		}System.out.println(str.equals(tersStr));

	}

}
