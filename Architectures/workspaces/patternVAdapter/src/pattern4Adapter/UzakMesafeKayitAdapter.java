package pattern4Adapter;

public class UzakMesafeKayitAdapter implements IYedekleyici {
	
	private UzakMesafeKayit uzakMesafeKayit;

	@Override
	public void Kaydet(String kaynakKlasorKonumu, String hedefKlasoronumu) {
		
		uzakMesafeKayit= new UzakMesafeKayit();
		uzakMesafeKayit.UzakMesafeKaydet(kaynakKlasorKonumu, hedefKlasoronumu);
	}
}
