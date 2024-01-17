package notLiskov;

public class Dikdortgen {

	protected int kenar;
	protected int kenar2;
	
	public void kenarSet(int kenar,int kenar2) {
		this.kenar=kenar;
		this.kenar2=kenar2;
	}
	public int alanHesapla() {
		return this.kenar*this.kenar2;
	}
}
