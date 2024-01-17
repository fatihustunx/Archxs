package pattern4Adapter;

public class DiskYedekleyici implements IYedekleyici {

	@Override
	public void Kaydet(String kaynakKlasorKonumu, String hedefKlasoronumu) {
		
		// Kaynaktan kopyalayýp hedefe yapistiran
		
		System.out.println(kaynakKlasorKonumu + " konumundaki dosyalar diskte " + hedefKlasoronumu + " icine yedeklenmistir.");
		
	}

}
