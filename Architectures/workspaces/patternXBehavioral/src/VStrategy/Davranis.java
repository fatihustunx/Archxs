package VStrategy;

public abstract class Davranis {

	protected int durum= 0;
	protected int hizlanmaKatsayi= 1;
	protected int maxHiz= 200;
	protected boolean nitro= false;
	protected String renk= "beyaz";
	
	abstract public void durumSet();
	abstract public void hizlanmaKatsayiSet();
	abstract public void maxHizSet();
	abstract public void nitroSet();
	abstract public void renkSet();
	
	public void yazdir() {
		System.out.println("Durum : " + durum + " Hizlanma Kat Sayýsý : " + hizlanmaKatsayi + " Max Hýz : " + maxHiz + " Nitro : " + nitro + " Renk : " + renk);
	}
}
