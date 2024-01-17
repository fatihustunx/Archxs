package Liskov;

public class Kare implements ICokgen{

	private int kenar;
	
	public Kare(int kenar) {
		super();
		this.kenar = kenar;
	}

	@Override
	public int alanHesapala() {
		// TODO Auto-generated method stub
		return this.kenar*this.kenar;
	}
	
}
