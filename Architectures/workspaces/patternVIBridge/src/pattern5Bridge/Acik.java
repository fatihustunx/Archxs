package pattern5Bridge;

public class Acik implements IRenk{

	@Override
	public String renkOlustur() {
		
		System.out.println("A��k renk verileri g�nderiliyor..");
		return "Beyaz";
	}

}
