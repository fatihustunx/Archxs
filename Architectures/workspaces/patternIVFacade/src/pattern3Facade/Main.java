package pattern3Facade;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AkilliEvSistemi evora=new AkilliEvSistemi(4);
		evora.klimaAc();
		evora.isikAc(2);
		evora.kapiKilitle();
		evora.tvAc();
		
		System.out.println();
		
		evora.sinemaModu();
		
		System.out.println();
		
		evora.uykuModu();
		
	}

}
