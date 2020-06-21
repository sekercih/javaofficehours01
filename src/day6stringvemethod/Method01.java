package day6stringvemethod;

public class Method01 {

	public static void main(String[] args) {
		// saat ve dakika girildiğinde sonuç olarak saniye return etsin
		System.out.println("saniye sonucu= "+saniyeDonusturucu(1,0));
		
	}
public static int saniyeDonusturucu(int hours,int minutes){
	
	int saniye=(hours*3600)+(minutes*60);
	return saniye;
	
}
}
