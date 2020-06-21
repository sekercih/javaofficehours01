package day4;

import java.util.Scanner;

public class StringMethot1 {

	public static void main(String[] args) {
		// ındexOf karakterin yerini belirler.
		//karakter sayımı 0 dan başlar.
		String str="istanbuncalu";
		
		System.out.println(str.indexOf('u'));
		System.out.println(str.lastIndexOf('n'));
		
		System.out.println(str.length());
		
  Scanner scan=new Scanner(System.in);
  /*System.out.println("lutfen bir kelime giriniz");
  String str2=scan.next();
  System.out.println(str2.charAt(str2.length()-1));
  */System.out.println("---------------");
  
//  String a=scan.next();
  //System.out.println(a.contains("pt"));
  String c="a" ;
  
  System.out.println(c.isEmpty());
  
  
  String tr=" karakartal samsunda  ";
  System.out.println(tr.trim());
  
  String star="kara";
  System.out.println(star.startsWith("k"));
  
  String sub="karadeniz";
  System.out.println(sub.substring(4));
  System.out.println(sub.substring(2, sub.length()-1));
  
  String kelime=scan.next();
  char ilk =kelime.charAt(0);
  char son=kelime.charAt(kelime.length()-1);
  
 System.out.println(son+kelime.substring(1, kelime.length()-1)+ilk);
  
  
  
  
  
  

	}

}
