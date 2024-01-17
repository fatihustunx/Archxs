package pattern3Facade;

public class Televizyon {
	
	private int sesSeviye;
	private int kanalNumara;
	
	public Televizyon() {
		this.sesSeviye=10;
		this.kanalNumara=1;
	}
	
	public void ac() {
		System.out.println("Televizyon a��ld�.");
	}
	
	public void kapat() {
		System.out.println("Televizyon kapatld�.");
	}
	
	public void sesAzalt() {
		this.sesSeviye--;
	}
	
	public void sesArttir() {
		this.sesSeviye++;
	}
	
	public void kanalAzalt() {
		this.kanalNumara--;
	}
	
	public void kanalArttir() {
		this.kanalNumara++;
	}
}
