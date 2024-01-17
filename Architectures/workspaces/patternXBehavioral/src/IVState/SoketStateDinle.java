package IVState;

public class SoketStateDinle implements ISoketState {

	@Override
	public void handle(Soket s) {

		System.out.println("Port soket dinleniyor : " + s.getPort());
		s.setState(new SoketStateKapat());
	}

}
