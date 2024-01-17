package pattern4Adapter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String kaynak= "C:\\YedekelenecekKlasor";
		
		IYedekleyici yedekleme;
		
		yedekleme=new DiskYedekleyici();
		yedekleme.Kaydet(kaynak, "D:\\HedefDiskKonumu");
		
		yedekleme=new FlashYedekleyici();
		yedekleme.Kaydet(kaynak, "U:\\HedefFlashKonumu");
		
		System.out.println();
		
		yedekleme=new UzakMesafeKayitAdapter();
		yedekleme.Kaydet(kaynak, "www.abcd.com/hedefWebKonumu");
		
	}

}
