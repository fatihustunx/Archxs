package pattern3Facade;

public class Televizyon {
	
	private int sesSeviye;
	private int kanalNumara;
	
	public Televizyon() {
		this.sesSeviye=10;
		this.kanalNumara=1;
	}
	
	public void ac() {
		System.out.println("Televizyon açýldý.");
	}
	
	public void kapat() {
		System.out.println("Televizyon kapatldý.");
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
