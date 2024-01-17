package patternFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String uretilenKumas;
		
		IFabrika kumasf= new KumasFabrikasý();
		
		IKumas kumas= kumasf.fabrikaMetodu("keten");
		uretilenKumas= kumas.kumasUret();
		System.out.println(uretilenKumas+ " üretildi !");
		
		kumas= kumasf.fabrikaMetodu("kadife");
		uretilenKumas=kumas.kumasUret();
		System.out.println(uretilenKumas+ " üretildi !");
		
	}

}
