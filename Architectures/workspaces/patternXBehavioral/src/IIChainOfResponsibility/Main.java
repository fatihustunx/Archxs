package IIChainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Yerel yerel= new Yerel();
		Intranet intranet= new Intranet();
		Internet internet= new Internet();
		
		yerel.setSonraki(intranet);
		intranet.setSonraki(internet);
		
		yerel.uygula(new Istek("50.0.0.1",Istek.Tip.GET));
		
	}

}
