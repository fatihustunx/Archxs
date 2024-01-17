package pattern5Bridge;

public class HighContrast implements IRenk {

	@Override
	public String renkOlustur() {
		
		System.out.println("Yüksek kontrast renk verileri gönderiliyor..");
		return "Yüksek kontrast";
	}
}
