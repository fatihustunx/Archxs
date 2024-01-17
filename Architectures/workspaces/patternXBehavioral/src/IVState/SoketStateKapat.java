package IVState;

public class SoketStateKapat implements ISoketState {

	@Override
	public void handle(Soket s) {

		System.out.println("Port soket kapatýlýyor : " + s.getPort());
		s.setState(new SoketStateAc());
	}

}
