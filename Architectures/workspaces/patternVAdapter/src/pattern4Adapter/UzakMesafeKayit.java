package pattern4Adapter;

public class UzakMesafeKayit {
	
	public void UzakMesafeKaydet (String kaynakDosya, String hedefKonum) {
		this.baglantiKur(hedefKonum);
		this.dosyalariG�nder(kaynakDosya);
		this.baglantiyiKapat();
	}
	
	private void baglantiKur (String hedef) {
		System.out.println(hedef + " adresi ile ba�lant� kuruldu.");
	}
	
	private void dosyalariG�nder (String kaynak) {
		System.out.println(kaynak + "klasorundeki dosyalar hedef konuma gonderiliyor...");
	}
	
	private void baglantiyiKapat() {
		System.out.println("Baglanti sonlandirildi !");
	}
}
