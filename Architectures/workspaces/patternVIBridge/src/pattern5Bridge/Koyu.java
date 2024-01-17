package pattern5Bridge;

public class Koyu implements IRenk {

	@Override
	public String renkOlustur() {
		System.out.println("Koyu renk verileri gönderiliyor..");
		return "Siyah";
	}

}
