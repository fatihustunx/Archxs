package pattern5Bridge;

public class Acik implements IRenk{

	@Override
	public String renkOlustur() {
		
		System.out.println("Açık renk verileri gönderiliyor..");
		return "Beyaz";
	}

}
