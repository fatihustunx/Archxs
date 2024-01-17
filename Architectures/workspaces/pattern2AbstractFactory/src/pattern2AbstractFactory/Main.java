package pattern2AbstractFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ISoyutFabrika soyut= new SomutFabrika1();
		AraIstemci ara= new AraIstemci(soyut);
		ara.calsitir();
		
		System.out.println();
		
		soyut= new SomutFabrika2();
		ara= new AraIstemci(soyut);
		ara.calsitir();
	}

}
