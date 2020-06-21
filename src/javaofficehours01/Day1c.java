package javaofficehours01;

import java.util.Scanner;

public class Day1c {

	public static void main(String[] args) {
		// Kullanıcadan 5 basamaklı tam sayı alalım ve bu sayının baştan 2 ve sonda 2 rakamların
				// basamak değeri ile toplama sonucunu yazdıralım.  12345 => 12045
		Scanner scan=new Scanner(System.in);
		System.out.println("LUTFEN 5 BASAMAKLI BIR SAYI GIRINIZ");
		int num=scan.nextInt();
		int ilkiki=num/1000;
		 ilkiki=ilkiki*1000;
		 System.out.println(ilkiki);
		 
		 int soniki=num%100;
		 System.out.println(soniki);
		int sum=ilkiki+soniki;
		
		 System.out.println(sum);

	}

}
