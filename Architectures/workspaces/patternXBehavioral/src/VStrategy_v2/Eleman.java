package VStrategy_v2;

public class Eleman {

	private MaasHesap maasHesap;
	private IzinHesap izinHesap;
	
	public Eleman(MaasHesap maasHesap, IzinHesap izinHesap) {	
		this.maasHesap=maasHesap;
		this.izinHesap=izinHesap;
	}
	
	public void maasHesapla() {
		maasHesap.maasHesapla();
	}
	
	public void izinHesapla() {
		izinHesap.izinHesapla();
	}
}
