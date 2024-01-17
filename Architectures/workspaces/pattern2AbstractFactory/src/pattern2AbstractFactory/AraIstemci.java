package pattern2AbstractFactory;

public class AraIstemci {

	private ISoyutUrunKumas kumas;
	private ISoyutUrunIskelet iskelet;
	
	public AraIstemci(ISoyutFabrika sf) {
		
		kumas= sf.kumasGetir();
		iskelet= sf.iskeletGetir();
	}
	
	public void calsitir() {
		
		String kum= kumas.kumasUret();
		String iske= iskelet.iskeletUret();
		
		System.out.println("Koltuk "+ kum + " ve " + iske + " ile üretilmiþtir !");
	}
}
