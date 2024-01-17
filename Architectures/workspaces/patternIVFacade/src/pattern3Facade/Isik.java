package pattern3Facade;

public class Isik {
	
	private boolean durum[];
	
	public Isik(int adet) {
		this.durum=new boolean[adet];
	}
	
	public void ac(int numara) {
		this.durum[numara]=true;
		System.out.println(numara + " numaral� ���k a��ld�.");
	}
	
	public void kapat(int numara) {
		this.durum[numara]=false;
		System.out.println(numara + " numaral� ���k kapat�ld�.");
	}
}
