package IVState;

public class SoketStateAc implements ISoketState{

	@Override
	public void handle(Soket s) {

		System.out.println("Port soket a��ld� : " + s.getPort());
		s.setState(new SoketStateDinle());
	}

}
