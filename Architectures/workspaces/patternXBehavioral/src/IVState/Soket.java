package IVState;

public class Soket {

	private int port;
	private ISoketState state;
	
	public Soket(int port) {
		this.port=port;
		this.state= new SoketStateAc();
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public ISoketState getState() {
		return state;
	}

	public void setState(ISoketState state) {
		this.state = state;
	}
	
	
	public void Do() {
		
		state.handle(this);
	}
}
