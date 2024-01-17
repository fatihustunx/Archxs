package pattern4Adapter;

public class FlashYedekleyici implements IYedekleyici {

	@Override
	public void Kaydet(String kaynakKlasorKonumu, String hedefKlasoronumu) {
		
		System.out.println(kaynakKlasorKonumu + " konumundaki dosyalar flash diskte " + hedefKlasoronumu + " icine yedeklenmistir.");
		
	}

}
