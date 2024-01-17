package patternFactory;

public class KumasFabrikasý implements IFabrika{

	@Override
	public IKumas fabrikaMetodu(String urun) {
		switch(urun) {
		case "kadife": return new KadifeKumas();
		case "keten" : return new KetenKumas();
		default : return new KadifeKumas();
		}
	}
	
}
