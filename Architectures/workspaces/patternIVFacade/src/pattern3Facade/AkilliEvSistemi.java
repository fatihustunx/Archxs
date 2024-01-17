package pattern3Facade;

public class AkilliEvSistemi {
	
	Klima klima;
	Kapi kapi;
	Isik isik;
	Televizyon tv;
	
	public AkilliEvSistemi(int adet) {
		klima=new Klima();
		kapi=new Kapi();
		isik=new Isik(adet);
		tv=new Televizyon();
	}
	
	public void klimaGuncelle(int sicaklik) {
		klima.guncelle(sicaklik);
	}
	
	public void klimaAc() {
		klima.ac();
	}
	
	public void klimaKapat() {
		klima.kapat();
	}
	
	public void kapiKilitle() {
		kapi.kilitle();
	}
	
	public void kapiKilitAc() {
		kapi.kilitAc();
	}
	
	public void isikAc(int numara) {
		isik.ac(numara);
	}
	
	public void isikKapat(int numara) {
		isik.kapat(numara);
	}
	
	public void tvAc() {
		tv.ac();
	}
	
	public void tvKapat() {
		tv.kapat();
	}
	
	public void tvSesAzalt() {
		tv.sesAzalt();
	}
	
	public void tvSesArttir() {
		tv.sesArttir();
	}
	
	public void tvKanalAzalt() {
		tv.kanalAzalt();
	}
	
	public void tvKanalArttir() {
		tv.kanalArttir();
	}
	
	public void butunIsiklariKapat() {
		for(int i=0;i<4;i++)
			isik.kapat(i);
	}
	
	public void sinemaModu() {
		klima.ac();
		this.butunIsiklariKapat();
		tv.ac();
	}
	
	public void uykuModu() {
		klima.kapat();
		kapi.kilitle();
		this.butunIsiklariKapat();
		tv.kapat();
	}
	
	
}
