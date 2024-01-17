package VStrategy;

public class Context {
	
	private Davranis d;
	
	public void setDavranis(Davranis davranis) {
		
		this.d=davranis;
	}
	
	public void calistir() {
	
		d.durumSet();
		d.hizlanmaKatsayiSet();
		d.maxHizSet();
		d.nitroSet();
		d.renkSet();
		d.yazdir();
	}

}
