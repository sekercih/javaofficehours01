package day5stringmethod;

public class StringMethod01 {

	public static void main(String[] args) {
		//concat methodu: concotination yapmamızı sağlar.
		String str1="van";
		String str2="ankara";
		System.out.println(str1.concat(str2));
		
		String st3="karete";
		System.out.println(st3.replace("a", "o"));
		System.out.println(st3);
		
		//valuof ()  stringde bulunan karakterleri  int e dönüştürüyor.
		
		//String içinde matematiksel işlem yapmamızı sağlar.
		
		String butce1="12000";
		String butce2="13000";
		System.out.println(butce1+butce2);
		System.out.println(Integer.valueOf(butce1)+Integer.valueOf(butce2));
		int yas=12;
		int yas1=15;
		System.out.println(yas+yas1);
		System.out.println(String.valueOf(yas)+String.valueOf(yas1));
		
		

	}

}
