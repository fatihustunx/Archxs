package patternVICompozite;

public class Main {

	public static void main(String[] args) {

		Tasarimci t1= new Tasarimci(101,"Tasarimci Ornek1");
		Tasarimci t2= new Tasarimci(103,"Tasarimci Ornek3");
		InsanKaynaklari tasarimcilar= new InsanKaynaklari();
		tasarimcilar.calisanEkle(t1);
		tasarimcilar.calisanEkle(t2);
		
		Gelistirici g1= new Gelistirici(202,"Gelistirici Ornek2");
		Gelistirici g2= new Gelistirici(204,"Gelistirici Ornek4");
		InsanKaynaklari gelistiriciler= new InsanKaynaklari();
		gelistiriciler.calisanEkle(g1);
		gelistiriciler.calisanEkle(g2);
		
		Yonetici y1= new Yonetici(505,"Yonetici Ornek5");
		Yonetici y2= new Yonetici(506,"Yonetici Ornek6");
		InsanKaynaklari yoneticiler= new InsanKaynaklari();
		yoneticiler.calisanEkle(y1);
		yoneticiler.calisanEkle(y2);
		
		InsanKaynaklari calisanlar= new InsanKaynaklari();
		calisanlar.calisanEkle(tasarimcilar);
		calisanlar.calisanEkle(gelistiriciler);
		calisanlar.calisanEkle(yoneticiler);
		
		calisanlar.bilgiGoster();
		
		/*
		tasarimcilar.bilgiGoster();
		gelistiriciler.bilgiGoster();
		yoneticiler.bilgiGoster();
		*/
	}

}
