package pattern3Facade;

public class Klima {

	private int sicaklik;

	public void guncelle(int sicaklik) {
		this.sicaklik=sicaklik;
	}
	
	public void ac() {
		System.out.println("Klima açýldý.");
	}
	
	public void kapat() {
		System.out.println("Klima kapatýldý.");
	}
	
}
