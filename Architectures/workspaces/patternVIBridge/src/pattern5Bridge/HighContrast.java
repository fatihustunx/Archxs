package pattern5Bridge;

public class HighContrast implements IRenk {

	@Override
	public String renkOlustur() {
		
		System.out.println("Y�ksek kontrast renk verileri g�nderiliyor..");
		return "Y�ksek kontrast";
	}
}
