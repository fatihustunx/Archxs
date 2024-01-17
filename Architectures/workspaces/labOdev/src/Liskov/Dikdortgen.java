package Liskov;

public class Dikdortgen implements ICokgen{
	private int kenar;
	private int kenar2;
	

	public Dikdortgen(int kenar, int kenar2) {
		super();
		this.kenar = kenar;
		this.kenar2 = kenar2;
	}


	@Override
	public int alanHesapala() {
		// TODO Auto-generated method stub
		return this.kenar*this.kenar2;
	}
	
}
