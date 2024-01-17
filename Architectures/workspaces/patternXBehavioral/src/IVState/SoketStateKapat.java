package IVState;

public class SoketStateKapat implements ISoketState {

	@Override
	public void handle(Soket s) {

		System.out.println("Port soket kapatılıyor : " + s.getPort());
		s.setState(new SoketStateAc());
	}

}
